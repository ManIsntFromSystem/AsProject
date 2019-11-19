package IOEX;

import java.io.File;
import java.io.FileDescriptor;

public class LessonTwoIO {
    public static void main(String[] args) {

        String path = "src/backup";
        File directory = new File(path);

        if(directory.isDirectory()){
            String[] content = directory.list();

            if(content != null){
                for (String eachFile : content){
                    File file = new File(path + "/" + eachFile);
                    System.out.println(file.isDirectory() ? (eachFile + " is directory") : (eachFile + "is file"));
                }
            }else {
                System.out.println("Is not exist");
            }
        } else {
            System.out.println("directory is not exist");
        }


        /*if (!directory.exists()){
            System.out.println(directory.mkdir() ? "Directory is created" : "Directory is not created");
        } else {
            System.out.println("Directory is already created");
        }*/
    }
}
