package service;
import model.Necklace;

public class NecklacesProcessingSystem {
    private String fileName;
    private Necklace currentNecklace;

    public NecklacesProcessingSystem(String fileName) {
        this.fileName = fileName;
        this.currentNecklace = null;
    }

    public void viewSavedNecklaces() {
        System.out.println("EXECUTING: (reviewing saved necklaces...)");
    }

    public void deleteSavedNecklaces() {
        System.out.println("EXECUTING: (deleting saved necklaces...)");
    }

    public void createNewNecklace() {
        System.out.println("EXECUTING: (creating new necklace...)");
    }

    public void customizeCurrentNecklace() {
            System.out.println("EXECUTING: (customizing current necklace...)");
    }

    public void saveCurrentNecklace() {
        System.out.println("EXECUTING: (saving current necklace...)");
    }

    public void showShortGuide() {
        System.out.println("EXECUTING: (showing short guide)...)");
    }

    public void stopProgram() {
        System.exit(0);
    }
}