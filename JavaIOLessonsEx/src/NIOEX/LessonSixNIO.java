package NIOEX;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LessonSixNIO {
    public static void main(String[] args) {
        String text = "Hello Java";
        byte [] bytes = text.getBytes();

        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get("file2.txt")))) {
            for (byte b : bytes) {
                outputStream.write(b);
            }
        }catch (IOException e){
            System.out.println("IO error");
        }
    }
}
