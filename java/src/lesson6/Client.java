package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8081;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
       Socket socket = new Socket("localhost", 8081);
       DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
       String intputStrng;
       do {
           intputStrng = scanner.nextLine();
           dataOutputStream.writeUTF(intputStrng);
           dataOutputStream.flush();
       } while (!"//end".equals(intputStrng));
       socket.close();
    }
}
