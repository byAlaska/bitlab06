package bitlab.askar.module1.lesson8;

public class Dog {
    String nickName;
    int age;

    public Dog(String nickName, int age) {
        this.nickName = nickName;
        this.age = age;
    }

    public void getInfo(){
        System.out.println(nickName + ", " + age);
    }

}
