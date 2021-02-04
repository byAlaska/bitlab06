package bitlab.askar.module2.lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);


        ArrayList<String> array = new ArrayList<>();
        array.add("asktji");
        array.add("new name");
        array.add("hello");
        array.add("byebye");


        for (int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }

        System.out.println(array.size());


        array.remove(0);
        array.remove("hello");



        for (int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }


        array.indexOf("hello");
        array.set(0,"hasd");



        for (String s:array){
            System.out.println(s);
        }



    }
}
