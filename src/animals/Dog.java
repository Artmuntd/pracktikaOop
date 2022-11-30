package animals;

import java.util.Arrays;

public class Dog extends Pet implements Trained {
    public static final String CMD_SIT = "Сидеть";
    public static final String CMD_VOICE = "Голос";
    public static final String CMD_WLK = "ГУЛЯТЬ";
    public static final String[] ALL_TRAINED_COMANDS = new String[]{CMD_SIT,CMD_VOICE,CMD_WLK}; //new String[] пишется по желанию

    private  String[] trainedCommands = new String[0];
    public Dog(String name) {
        this(name,0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("насыпать собачий корм в миску");
        System.out.println("дают команду");
        System.out.println("ем");
    }

    @Override
    public String[] getTrainedCommands() {
        return trainedCommands;
    }

    @Override
    public String[] getAllComands() {
        return  ALL_TRAINED_COMANDS;
    }

    @Override
    public void doCommand(String command) {
        System.out.println("выполняю " + command);
        switch (command){
            case CMD_SIT:
                System.out.println("слышу команду сидеть");
                System.out.println("Сожусь на пол");
                break;
            case CMD_WLK:
                System.out.println("Иду к двери");
                break;
            case CMD_VOICE:
                talk();
                break;
            default:
                System.out.println("Нет такой команды");
        }

    }

    @Override
    public void train(String command) {
        trainedCommands = Arrays.copyOf(trainedCommands,trainedCommands.length+1);
        trainedCommands[trainedCommands.length -1] = command;
    }
}
