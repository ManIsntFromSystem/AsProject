package NIOEX;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class LessonFiveNIO {
    public static void main(String[] args) {
        try {
            Path  sourcePath = Paths.get("input1.txt"), destinationPath = Paths.get("output.txt");
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
