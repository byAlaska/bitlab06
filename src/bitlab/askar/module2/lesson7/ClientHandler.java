package bitlab.askar.module2.lesson7;


import bitlab.askar.module2.lesson2.Main;
import bitlab.askar.module2.lesson2.lab.Book;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {

    Socket socket;
    ArrayList<Book> books;

    public ClientHandler(Socket socket, ArrayList<Book> books) {
        this.socket = socket;
        this.books = books;
    }

    @Override
    public void run() {

        try {

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData data;
            while (true){
                data = (PackageData)inputStream.readObject();

                if (data.getOperationType().equals("LIST")){
                    System.out.println(Server.books);
                    outputStream.writeObject(new PackageData(null,Server.books,null));
                }else if (data.getOperationType().equals("ADD")){
                    System.out.println(data);
                    books.add(data.getBook());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
