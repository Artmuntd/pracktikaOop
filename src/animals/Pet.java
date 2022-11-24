package animals;

import java.time.LocalDate;

public abstract class  Pet {
    private    String name;
    private  int birthYear;
    private String number;
    private  String address;

    public Pet(String name) {
        this(name,0);
    }

    public Pet(String name, int age) {
        setName(name);
        if(age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public  void  talk(){
        System.out.println("hello");
    }
    public abstract void eat();

   public int getAge(){
        return  LocalDate.now().getYear() - birthYear;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name != null && !name.isEmpty() && !name.isBlank()){
           this.name = name;
       }
    }

    public int getBirthYear() {
        return birthYear;
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
