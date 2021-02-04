package bitlab.askar.module1.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Animal []animals  = {
                new Animal(15,"Rex",100,"Male"),
                new Cat(10,"Barsik",10,"Male", 4, 100),
                new Cat(10,"Pushok",5,"Female", 14, 10),
                new Frog(15,"Bobba",100,"Male", 100,true),
                new Frog(115,"Idris",20,"Female", 100,false),
        };


        for (int i=0;i<5;i++){
            System.out.println(animals[i].toString());
        }

    }
}
