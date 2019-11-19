package NIOEX;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LessonThreeNIO {
    public static void main(String[] args) {
        int length;

        try (SeekableByteChannel channel = Files.newByteChannel(Paths.get("file.txt"))) {
            ByteBuffer buffer = ByteBuffer.allocate(26);

            do{
              length = channel.read(buffer);

              if (length != -1){

                  buffer.rewind();

                  for (int i = 0; i < length; i++) {
                      System.out.print( (char) buffer.get());
                  }
              }
            }while (length != -1);
        }catch (IOException e){
            System.out.println("IO error");
        }
    }
}
