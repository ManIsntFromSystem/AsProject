package Network.JavaNet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketJavaLessonThree {
    public static void main(String[] args) throws IOException{
        try (ServerSocket serverSocket = new ServerSocket(8189);
            Socket socket = serverSocket.accept();
            Scanner scanner = new Scanner(socket.getInputStream())) {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            //printWriter.println("hello");
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                printWriter.println("I've send: " + str);
                System.out.println(str);
                if(str.equals("exit")){
                    break;
                }
            }
        }
    }
}
