package NIOEX;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LessonFourNIO {
    public static void main(String[] args) {
        int length;

        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("file.txt"))) {
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());

            for (int i = 0; i < channel.size(); i++) {
                        System.out.print( (char) buffer.get());
                    }
        }catch (IOException e){
            System.out.println("IO error");
        }
    }
}
