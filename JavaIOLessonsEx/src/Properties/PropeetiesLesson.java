package Properties;

import java.io.*;
import java.util.Properties;

public class PropeetiesLesson {
    public static void main(String[] args) throws IOException {
        Properties defaultProp = new Properties();
        defaultProp.setProperty("22", "My def");
        Properties properties = new Properties(defaultProp);
        properties.put("1", "edew");
        properties.put("3", "Rot");
        properties.put("2", "Mike");
//        System.out.println(properties.getProperty("1"));
////        FileOutputStream file = new FileOutputStream("myprop.properties");
////        properties.store(file, "my Comment");
        FileInputStream fin = new FileInputStream("myprop.properties");
        properties.load(fin);
        System.out.println(properties.getProperty("2"));
        //System.out.println(properties.getProperty("22", "not value"));
        System.out.println(properties.getProperty("22"));
    }
}
