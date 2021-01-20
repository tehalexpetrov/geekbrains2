package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8081;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {

    }
    public void openConnection() throws IOException{
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    do{
                        String strFromServer = in.readUTF();
                        if (strFromServer.equalsIgnoreCase("//end")){
                            break;
                        }
                    } while (true);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
