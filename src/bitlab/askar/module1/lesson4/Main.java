package bitlab.askar.module1.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int []ages = new int[n];


        //[] [] [] [] [] [] [] [] [] []
        // 0  1  2  3  4  5  6  7  8  9

        int sum = 0;

        for (int i=0;i<ages.length;i++){
            ages[i] = in.nextInt();
        }

        for (int i=ages.length-1;i>=0;i--){
            System.out.println(ages[i]);
        }

    }
}
