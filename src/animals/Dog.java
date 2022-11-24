package animals;

public class Dog extends Pet {
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
}
