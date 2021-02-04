package bitlab.askar.module1.lesson9;

public class Animal {

    int age;
    String name;
    int weight;
    String gender;

    public Animal() {
    }

    public Animal(int age, String name, int weight, String gender) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
