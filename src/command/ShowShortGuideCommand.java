package command;

import service.NecklacesProcessingSystem;

public class ShowShortGuideCommand implements Command{
    private NecklacesProcessingSystem performer;

    public ShowShortGuideCommand(NecklacesProcessingSystem performer){
        this.performer = performer;
    }

    @Override
    public void execute() {
        performer.showShortGuide();
    }
}
