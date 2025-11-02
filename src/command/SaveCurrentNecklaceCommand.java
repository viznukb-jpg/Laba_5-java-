package command;
import service.NecklacesProcessingSystem;

public class SaveCurrentNecklaceCommand implements Command{
    private NecklacesProcessingSystem performer;

    public SaveCurrentNecklaceCommand(NecklacesProcessingSystem performer){
        this.performer = performer;
    }

    @Override
    public void execute() {
        performer.saveCurrentNecklace();
    }
}
