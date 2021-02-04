package bitlab.askar.module2.lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1, "qwerty", "asdf", "Hasko"));
        users.add(new User(2, "asdfasdf", "123", "Ken"));
        users.add(new User(3, "Bye bye", "password", "Name"));
        users.add(new User(4, "hello bye", "password", "Jerry"));
        users.add(new User(5, "good bye", "password", "Steve"));


        System.out.println("hello");
        
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/Users/marcus/Documents/bitlab_se1/bitlab08/src/bitlab/askar/module2/lesson5/output.txt"));
            outputStream.writeObject(users);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/marcus/Documents/bitlab_se1/bitlab08/src/bitlab/askar/module2/lesson5/output.txt"));
            ArrayList<User> users1 = (ArrayList<User>) inputStream.readObject();
            inputStream.close();

            System.out.println(users1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static ArrayList<User> read() {
        ArrayList<User> users1 = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/marcus/Documents/bitlab_se1/bitlab08/src/bitlab/askar/module2/lesson5/output.txt"));
            users1 = (ArrayList<User>) inputStream.readObject();
            inputStream.close();

            System.out.println(users1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users1;
    }
}
