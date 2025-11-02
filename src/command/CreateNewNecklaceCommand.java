package command;

import service.NecklacesProcessingSystem;

public class CreateNewNecklaceCommand implements Command{
    private NecklacesProcessingSystem performer;

    public CreateNewNecklaceCommand(NecklacesProcessingSystem performer){
        this.performer = performer;
    }

    @Override
    public void execute() {
        performer.createNewNecklace();
    }
}
