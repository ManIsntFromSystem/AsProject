package Network.JavaNet;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLJavaExampleOne {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp1 = new URL( "http://www.HerbSchildt.com/Articles");
        URL hp = new URL( "https://e.mail.ru/inbox/");
        URLConnection urlCon = hp.openConnection();

        long d = urlCon.getDate();
        System.out.println("Date: " + (d == 0 ? "There aren't date information" : new Date(d)));
        System.out.println("Type content" + urlCon.getContentType());

        d = urlCon.getExpiration();
        System.out.println("Validity information: " + (d == 0 ? "There isn't validity information" : new Date(d)) + "\n");

        d = urlCon.getLastModified();
        System.out.println("Last modified: " + (d == 0 ? ("Information about last modified " + d) : ("Date last modified: " + new Date(d))));

        long len = urlCon.getContentLengthLong();
        System.out.println("Length of content" + (len == -1 ? " isn't accept!" : (" is: " + len)));

        if (len != -1) {
            System.out.println("=== Content ===");
            InputStream input = urlCon.getInputStream();
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
                     }
                input.close();
            } else {
                System.out.println("Content isn't accept");
        }

        System.out.println("Protocol " + hp.getProtocol());
        System.out.println("Port "+ hp.getPort());
        System.out.println("Host " + hp.getHost());
        System.out.println("File " + hp.getFile());
        System.out.println("Full form " + hp.toExternalForm());
    }
}
