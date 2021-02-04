package bitlab.askar.module2.lesson7.lab2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread {

    Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            while (true){
                String s = (String)inputStream.readObject();
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
