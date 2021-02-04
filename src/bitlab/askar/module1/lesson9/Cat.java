package bitlab.askar.module1.lesson9;

public class Cat extends Animal {

    int moustache;
    int lengthOfTail;

    public Cat(int age, String name, int weight, String gender, int moustache, int lengthOfTail) {
        super(age,name,weight,gender);
        this.moustache = moustache;
        this.lengthOfTail = lengthOfTail;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "moustache=" + moustache +
                ", lengthOfTail=" + lengthOfTail +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
