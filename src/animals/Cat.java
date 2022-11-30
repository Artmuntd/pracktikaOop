package animals;

import java.time.LocalDate;

public  final class Cat  extends Pet implements Trained{

    private  Cat [] friends;


    public  static  class  Breed {
        private  String name;
        private  String getBreedCountry;
        private  String breedHairType;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGetBreedCountry() {
            return getBreedCountry;
        }

        public void setGetBreedCountry(String getBreedCountry) {
            this.getBreedCountry = getBreedCountry;
        }

        public String getBreedHairType() {
            return breedHairType;
        }

        public void setBreedHairType(String breedHairType) {
            this.breedHairType = breedHairType;
        }
    }
    public Cat (String name) { this(name, 0);}

    public Cat(String name, int age) {
      super(name, age);
        friends = new Cat[0];
    }

    @Override
    public void eat() {
        System.out.println("кошачий корм в миску");
        System.out.println("сеьсть");
    }

    public void meow(){
        System.out.println("мяу");
        System.out.println(getName());
        System.out.println(" мне лет"  );
    }

    @Override
    public void setName(String name) {


    }

    public Cat[] getFriends() {
        return friends;
    }

    public void setFriends(Cat[] friends) {
        this.friends = friends;
    }
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
