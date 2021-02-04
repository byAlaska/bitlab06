package bitlab.askar.module1.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);




    }

    public static void zamenaMest(int mas[][]){

        int buffer=0;
        int razmerMassiva = mas.length-1;

        for (int i=0; i<mas[razmerMassiva].length; i++) {

            buffer = mas[0][i];

            mas[0][i] = mas[razmerMassiva][i];

            mas[razmerMassiva][i] = buffer;


        }



        //Вывод массива
        for (int i=0; i<mas.length;i++) {
            for (int j = 0; j < mas[i].length; j++) {

                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][]kol(int [][]mas){
        int[] bubble = mas[0];
        mas[0] = mas[mas.length-1];
        mas[mas.length-1] = bubble;

        return mas;
    }

}