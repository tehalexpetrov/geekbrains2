package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        Socket socket = null;

        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            System.out.println("Сервер запущен. Ожидаем подключения.. ");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            do{
                String str = in.readUTF();
                if (str.equals("//end")){
                    break;
                }
                out.writeUTF("Сообщение: " + str);
            } while (true);

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
