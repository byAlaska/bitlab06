package bitlab.askar.module2.lesson7.lab2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    static ObjectOutputStream outputStream;
    static ObjectInputStream inputStream;
    public static void main(String[] args){


        try {

            Socket socket = new Socket("127.0.0.1",2077);

            outputStream = new ObjectOutputStream(socket.getOutputStream());
            inputStream = new ObjectInputStream(socket.getInputStream());
            MainFrame frame = new MainFrame();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void sendMessage(String text){

        try {
            outputStream.writeObject(text);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
