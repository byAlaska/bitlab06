package bitlab.askar.module2.lesson7;

import bitlab.askar.module2.lesson2.lab.Book;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        try {

            Socket socket = new Socket("127.0.0.1",2077);

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            PackageData data;
            while (true){

                System.out.println("[1] list books");
                System.out.println("[2] add bookd");
                System.out.println("[0] exit ");

                int choice = in.nextInt();

                if (choice==1){
                    data = new PackageData("LIST",null,null);
                    outputStream.writeObject(data);
                    PackageData data1 = (PackageData)inputStream.readObject();
                    System.out.println(data1);

//                    ArrayList<Book> books = data.getBooks();
//
//                    for (Book b:books){
//                        System.out.println(b.toString());
//                    }

                }else if (choice==2){
                    Book book = new Book(in.nextInt(),in.next(), in.next());
                    data = new PackageData("ADD",null,book);
                    outputStream.writeObject(data);
                }else {
                    break;
                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
