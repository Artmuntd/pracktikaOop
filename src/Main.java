import animals.Dog;
import animals.Parrot;
import animals.Pet;

public class Main {
    public static void main(String[] args) {
     Dog sharik = new Dog("Шарик");
     sharik.talk();
     Parrot kesha = new Parrot("kesha");
     kesha.talk();
     kesha.eat();

    }
}