package bitlab.askar.module1.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int [][]massiv = new int[n][m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                massiv[i][j] = in.nextInt();
            }
        }


        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println(massiv[j][i]);
            }
        }


    }
}
