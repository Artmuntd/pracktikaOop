package animals;

public class Parrot extends Pet {
    private  String name;
    private  int birthYear;
    private boolean talk;
    private  String breed;

    public Parrot(String name) {
      this(name,0);
    }

    public Parrot(String name, int age) {
       super(name,age);
    }
    public void talk(){
        System.out.println("я говорю");
    }
    public void talk(String... words){
        talk();
        for (String word : words){
            System.out.println(word);
        }
    }

    @Override
    public void eat() {
        System.out.println("ем зерно");
    }


    public boolean isTalk() {
        return talk;
    }

    public void setTalk(boolean talk) {
        this.talk = talk;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
