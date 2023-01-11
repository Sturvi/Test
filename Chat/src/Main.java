import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class Main {

    static List<Client> clients = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        // создаем серверный сокет на порту 1234
        ServerSocket server = new ServerSocket(1234);
        while (true) {
            System.out.println("Waiting...");
            // ждем клиента из сети
            Socket socket = server.accept();
            System.out.println("Client connected!");
            // создаем клиента на своей стороне
            clients.add(new Client(socket));
            // запускаем поток
            Thread thread = new Thread(clients.get(clients.size() - 1));
            thread.start();
        }
    }

    public static void messageSender(String text, Client sender) {
        for (int i = 0; i < clients.size(); i++) {
            if (!clients.get(i).equals(sender))
                clients.get(i).sendMessage(text);
        }
    }

}