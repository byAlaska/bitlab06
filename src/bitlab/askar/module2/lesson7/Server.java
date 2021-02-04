package bitlab.askar.module2.lesson7;

import bitlab.askar.module2.lesson2.lab.Book;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    static ArrayList<Book> books = new ArrayList<>();
    public static void main(String[] args){

        try {
            ServerSocket server = new ServerSocket(2077);
            System.out.println("Server is started");

            books.add(new Book(1,"Steven","Spilberg"));
            books.add(new Book(2,"Bent","New era"));
            books.add(new Book(3,"Setat","Boomych"));
            books.add(new Book(4,"Josh","Avatar"));
            while (true){
                Socket socket = server.accept();
                System.out.println("Client is connected");

                ClientHandler handler = new ClientHandler(socket,books);
                handler.start();
                System.out.println("New thread for new client is started");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
