package bitlab.askar.module1.lesson9;

public class Frog extends Animal {

    int lengthTongue;
    boolean poison;

    public Frog(int age, String name, int weight, String gender, int lengthTongue, boolean poison) {
        super(age, name, weight, gender);
        this.lengthTongue = lengthTongue;
        this.poison = poison;
    }

    public Frog() {
    }

    @Override
    public String toString() {
        return "Frog{" +
                "lengthTongue=" + lengthTongue +
                ", poison=" + poison +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
