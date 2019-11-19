package NIOEX;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LessonNineNIO {
    public static void main(String[] args) {
        Path path = Paths.get("src/backup/output.txt");

        System.out.println("File name: " + path.getFileName());
        System.out.println("Path to file: " + path + "\n");
        System.out.println("File  " + (Files.exists(path)? "exist" : "doesnt exist"));
        try {
            System.out.println("File " + (Files.isHidden(path) ? "is hidden" : "isn't hidden"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
