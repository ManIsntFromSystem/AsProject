package NIOEX;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class LessonEightNIO {
    public static void main(String[] args) {

        try {
            Path sourcePath = Paths.get("input.txt"), destinationPath = Paths.get("src/backup/output.txt");
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
