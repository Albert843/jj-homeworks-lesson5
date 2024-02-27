package chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Program {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4300);
        Server server = new Server(serverSocket);
        server.runServer();
    }
}
