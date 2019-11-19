package Network.JavaNet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressSimpleOne {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.google.com");
        System.out.println(address);
        System.out.println(address.isMulticastAddress());
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
        byte b[] = address.getAddress();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println(Arrays.toString(address.getAddress()));

        InetAddress SW[] = InetAddress.getAllByName("www.mail.ru");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
