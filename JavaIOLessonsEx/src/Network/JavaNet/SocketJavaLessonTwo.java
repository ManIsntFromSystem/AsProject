package Network.JavaNet;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketJavaLessonTwo {
    public static void main(String[] args) throws Exception{
            try (Socket socket = new Socket()) {

                socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8189), 2000);
                Scanner scanner = new Scanner(socket.getInputStream());
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
        }
    }
}
