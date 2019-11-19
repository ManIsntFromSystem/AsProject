package NIOEX;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LessonTwoNIO {
    public static void main(String[] args) {
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("input.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)){
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < buffer.capacity(); i++) {
                buffer.put( (byte) ('A' + i));
            }
        } catch (IOException e){
            System.out.println("Input / Output error");
        }
    }
}
