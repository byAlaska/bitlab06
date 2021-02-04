package bitlab.askar.module2.lesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<String> products = readText();

        while (true){
            System.out.println("[1] add product");
            System.out.println("[2] list products");
            System.out.println("[0] exit");

            int choice  = in.nextInt();

            if (choice==1){
                String product = in.next();
                products.add(product);
                writeText(products);
            }else if (choice==2){
                System.out.println(products.toString());
            }else {
                break;
            }
        }
    }

    public static ArrayList<String> readText(){

        ArrayList<String> products = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/bitlab/askar/module2/lesson4/input.txt"));

            String s = "";
            while ((s  = reader.readLine())!=null){
                products.add(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return products;
    }

    public static void writeText(ArrayList<String > products){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/bitlab/askar/module2/lesson4/input.txt"));
            for (String s:products){
                writer.write(s + "\n");
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
