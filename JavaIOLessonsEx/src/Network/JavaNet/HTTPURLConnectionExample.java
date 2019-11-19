package Network.JavaNet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HTTPURLConnectionExample {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Request's method: " + hpCon.getRequestMethod());
        System.out.println("Code of request: " + hpCon.getResponseCode() );
        System.out.println("Answer message: " + hpCon.getResponseMessage());
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        for(Map.Entry<String, List<String>> entry : hdrMap.entrySet()){
            System.out.println(entry.getKey() + "/ " + entry.getValue());
        }
        Set<String> hdrField = hdrMap.keySet(); //the same result
        System.out.println("\nAfter follows title: ");
        for(String k : hdrField) {
            System.out.println("Key: "+ k + "Value: " + hdrMap.get(k) );
        }
    }
}
