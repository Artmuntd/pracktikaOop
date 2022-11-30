package animals;

public interface Trained {

   String[] getTrainedCommands();
   String[]  getAllComands();
   void  doCommand(String  command);

   void train(String command);


}
