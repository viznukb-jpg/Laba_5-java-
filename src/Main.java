import ui.MenuInvoker;
import service.NecklacesProcessingSystem;
import command.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        NecklacesProcessingSystem performer = new NecklacesProcessingSystem("Some file");
        MenuInvoker menuInvoker = new MenuInvoker(performer);
        menuInvoker.initializeDefaultCommands();


        Scanner input = new Scanner(System.in);
        while (true) {
            menuInvoker.showMenu();
            String choice = input.nextLine().trim();
            clearConsole();
            menuInvoker.executeCommand(choice);
            input.nextLine();
            clearConsole();
        }
    }

    public static void clearConsole(){
        for(int i = 0; i < 50; i++){
            System.out.println();
        }
    }
}