package animals;

public class Tiger implements Trained{
    @Override
    public String[] getTrainedCommands() {
        return new String[0];
    }

    @Override
    public String[] getAllComands() {
        return new String[0];
    }

    @Override
    public void doCommand(String command) {

    }

    @Override
    public void train(String command) {

    }
}
