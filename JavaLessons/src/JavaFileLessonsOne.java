import java.io.*;

public class JavaFileLessonsOne {
    public static void main(String[] args) throws Exception{
        java.io.File file = new File("temp.txt");

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("exists");
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.flush();
        //fileWriter.close();

        FileReader fileReader = new FileReader(file);
        /*char [] text = new char[20];
        fileReader.read(text);
        System.out.println(text);
*/
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str3");
        bufferedWriter.newLine();
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }

        /*if (!file.exists()) {
            //file.mkdir();
            file.createNewFile();
            System.out.println("exists");
        }
        if (file.isDirectory()) {
            System.out.println("directory");}
        if (file.isFile()) {
            System.out.println("not directory");}*/
    }
}
