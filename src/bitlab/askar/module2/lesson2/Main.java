package bitlab.askar.module2.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {

            String name = in.next();
            String surname = in.next();
            int a = in.nextInt();
            System.out.println(a);

        }catch (Exception e) {
            String s = in.next();
            e.printStackTrace();
        }
    }
}
