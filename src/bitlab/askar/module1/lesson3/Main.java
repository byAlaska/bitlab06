package bitlab.askar.module1.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        // a * b -> a+a+a+a -> b raza
//
//        int sum = 0;
//        for (int i=0;i<b;i++){
//            sum += a;
//        }
//
//
//        System.out.println(sum);
//
//
//        int a = in.nextInt();
//        int max = a;
//
//        while (a!=0){
//            a = in.nextInt();
//            if (max<a){
//                max = a;
//            }
//        }
//
//        System.out.println(max);


        int counter = 0;

        //counter = 2
        while (counter<10){
            System.out.println("Hello");
            counter++;
            if (counter%2==0){
                continue;
            }
            System.out.println("bye bye");
        }

    }
}
