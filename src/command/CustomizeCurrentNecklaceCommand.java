package command;

import service.NecklacesProcessingSystem;

public class CustomizeCurrentNecklaceCommand implements Command {
    private NecklacesProcessingSystem performer;

    public CustomizeCurrentNecklaceCommand(NecklacesProcessingSystem performer){
        this.performer = performer;
    }

    @Override
    public void execute() {
        performer.customizeCurrentNecklace();
    }
}
