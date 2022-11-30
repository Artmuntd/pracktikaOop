import animals.*;

public class Main {
    public static void main(String[] args) {
        Dog sharik = new Dog("Шарик");

        Tiger tiger = new Tiger();
        //  sharik.train(Dog.CMD_SIT);
        //sharik.train(Dog.CMD_VOICE);
       checkTrainedAnimals(sharik,tiger, new Dog("saaa"));
       Trainer<Dog>alex = new Trainer<>("Alex");
       alex.train(sharik);

    }
    public  static void checkTrainedAnimals(Trained... animals){
       for(Trained animal : animals){
           for (String command : animal.getTrainedCommands()) {
                   animal.doCommand(command);
           }
       }


    }
}