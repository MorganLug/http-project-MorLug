package src;

import java.net.*;
import java.io.IOException;

class BasicSocket {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(6789, 1, InetAddress.getByName("127.0.0.1"));) 
        {    
            System.out.println("Waiting for client...\n");
            Socket client = server.accept();
            System.out.println("A client is connected !\n");

        } catch (IOException e) {
            System.err.println("port 6789 already used !\n");
        }
    }
}