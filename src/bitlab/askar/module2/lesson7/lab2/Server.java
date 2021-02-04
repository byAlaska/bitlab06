package bitlab.askar.module2.lesson7.lab2;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){


        try {
            ServerSocket server = new ServerSocket(2077);
            System.out.println("Server is started");

            while (true) {
                Socket socket = server.accept();
                System.out.println("Client is connected");

                ClientHandler handler = new ClientHandler(socket);
                handler.start();
                System.out.println("New thread for new client is started");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
