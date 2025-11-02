package ui;

import java.util.Map;
import java.util.HashMap;
import command.*;
import service.NecklacesProcessingSystem;
import options.MenuOptions;

public class MenuInvoker {
    private final Map<String, Command> menuItems = new HashMap<>();
    private final NecklacesProcessingSystem performer;

    public MenuInvoker(NecklacesProcessingSystem performer) {
        this.performer = performer;
    }

    public void addCommand(String key, Command command) {
        this.menuItems.put(key, command);
    }

    public void initializeDefaultCommands(){
        ViewSavedNecklacesCommand viewSaved = new ViewSavedNecklacesCommand(this.performer);
        DeleteSavedNecklacesCommand deleteSaved = new DeleteSavedNecklacesCommand(this.performer);
        CreateNewNecklaceCommand createNew = new CreateNewNecklaceCommand(this.performer);
        CustomizeCurrentNecklaceCommand customizeCurrent = new CustomizeCurrentNecklaceCommand(this.performer);
        SaveCurrentNecklaceCommand saveCurrent = new SaveCurrentNecklaceCommand(this.performer);
        ShowShortGuideCommand showShortGuide = new ShowShortGuideCommand(this.performer);
        StopProgramCommand stopProgram = new StopProgramCommand(this.performer);

        addCommand(MenuOptions.VIEW_SAVED_NECKLACES.getCode(), viewSaved);
        addCommand(MenuOptions.DELETE_SAVED_NECKLACES.getCode(), deleteSaved);
        addCommand(MenuOptions.CREATE_NEW_NECKLACES.getCode(), createNew);
        addCommand(MenuOptions.CUSTOMIZE_CURRENT_NECKLACE.getCode(), customizeCurrent);
        addCommand(MenuOptions.SAVE_CURRENT_NECKLACE.getCode(), saveCurrent);
        addCommand(MenuOptions. SHOW_SHORT_GUIDE.getCode(), showShortGuide);
        addCommand(MenuOptions. STOP_PROGRAM.getCode(), stopProgram);
    }

    public void showMenu(){
        System.out.println("\n===== MENU =====");

        for (MenuOptions option : MenuOptions.values()) {
            System.out.printf("%-30s -> %s\n", option.getDescription(), option.getCode());
        }
        System.out.println("========================================");
        System.out.print("Choice:  ");
    }

    public void executeCommand(String key) {
        Command command = menuItems.get(key);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Incorrect command! Try again :)");
        }
    }
}
