import java.io.*;

public class JavaDirectoryEx {
    public static void main(String[] args) {

        File dir = new File("."); // for current directory

        String[] names = dir.list();// list() - returned arrays lists

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        File nFile = new File("ComparatorLessonEx.iml");
        System.out.println(nFile.length());

        try {
            FileInputStream fIStr = new FileInputStream(nFile);
            int length = fIStr.available();
            System.out.println(length);

            byte [] data = new byte[length];
            fIStr.read(data);

            String text = new String(data);
            System.out.println(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fOStr = new FileOutputStream(nFile, true);
            String newtext = "<!-- Hello World files -->";
            byte [] newTextBytes = newtext.getBytes();
            fOStr.write(newTextBytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
