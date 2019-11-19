package Network.JavaNet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketJavaExampleOne {
    public static void main(String[] args) throws IOException {
        int c;
        try (Socket s = new Socket("whois.internic.net", 43)){
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            System.out.println(s.getInetAddress());
            System.out.println(s.isBound());
            System.out.println(s.isClosed());
            System.out.println(s.isConnected());

            String str = (args.length == 0 ? "OraclePressBooks.com" : args[0] + "\n");
            String str1 = "www.google.com";

            byte b[] = str1.getBytes();

            out.write(b);

            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
        }
    }
}


/*
*       int c;
        Socket s = new Socket("whois.internic.net", 43);

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]
            + "\n");

        byte b[] = str.getBytes();

        out.write(b);

        while ((c = in.read()) != -1) {
            System.out.println((char) c);
        }
        s.close();
* */
