package command;

import service.NecklacesProcessingSystem;

public class StopProgramCommand implements Command {
    private NecklacesProcessingSystem performer;

    public StopProgramCommand(NecklacesProcessingSystem performer){
        this.performer = performer;
    }

    @Override
    public void execute() {
        performer.stopProgram();
    }
}
