package command;
import service.NecklacesProcessingSystem;

public class DeleteSavedNecklacesCommand implements Command{
    private NecklacesProcessingSystem performer;

    public DeleteSavedNecklacesCommand(NecklacesProcessingSystem performer){
        this.performer = performer;
    }

    @Override
    public void execute() {
        performer.deleteSavedNecklaces();
    }
}
