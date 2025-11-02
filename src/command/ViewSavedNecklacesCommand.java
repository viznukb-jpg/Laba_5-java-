package command;

import service.NecklacesProcessingSystem;

public class ViewSavedNecklacesCommand implements Command{
    private NecklacesProcessingSystem performer;

    public ViewSavedNecklacesCommand(NecklacesProcessingSystem performer){
        this.performer = performer;
    }

    @Override
    public void execute() {
        performer.viewSavedNecklaces();
    }
}
