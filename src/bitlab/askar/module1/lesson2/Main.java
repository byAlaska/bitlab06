package bitlab.askar.module1.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n<=20 && n>=10){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        System.out.println(String.format("%.2f", 1.23456));
        System.out.printf("%.2f", 1.23456);

    }
}
