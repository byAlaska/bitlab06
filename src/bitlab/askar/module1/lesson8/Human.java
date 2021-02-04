package bitlab.askar.module1.lesson8;

public class Human {

    private int age;
    private String name;
    private String surname;
    private int height;
    Dog []dogs;


    public Human(){ }

    public Human(int age, String name, String surname, int height){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return age + ", " + name + ", " + surname + ", " + height + "\n";
    }

    public static void averageOfAges(Human[] humans){
        double sum = 0;
        for (int i=0;i<humans.length;i++){
            sum += humans[i].age;
        }

        System.out.println(sum/humans.length);
    }

}
