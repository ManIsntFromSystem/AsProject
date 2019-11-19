import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class MyCollectionsEx {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:/AndroidStudioProjects/JavaCollectionsExOne/src/TemplateImportEmpl.csv");
        int length = fileInputStream.available();
        byte [] bytes = new byte[length];
        fileInputStream.read(bytes);

        String text = new String(bytes);

        ArrayList<String []> lineWords = new ArrayList<>();

        String [] lines = text.split("\n");
        for(String line : lines) {
            String [] words = line.split(";");
            lineWords.add(words);
        }

        for (String [] words : lineWords) {
            if (words[3].equals("22222")) {
                for (String word : words) {
                    System.out.println(word + "|");
                    //System.out.println("|");
                }
                System.out.println("---------------------------------");
            }
        }
    }
}
