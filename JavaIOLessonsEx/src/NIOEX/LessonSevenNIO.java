package NIOEX;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LessonSevenNIO {
    public static void main(String[] args) {
        int content;

        try (InputStream inputStream = Files.newInputStream(Paths.get("file2.txt"))) {
            do {
                content = inputStream.read();

                if (content != -1) {
                    System.out.println((char) content);
                }
            } while (content != -1);
        } catch (IOException exception) {
            System.out.println("IO error");
        }
    }

}