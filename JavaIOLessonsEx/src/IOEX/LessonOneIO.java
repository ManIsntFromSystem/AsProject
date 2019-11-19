package IOEX;

import java.io.File;
import java.io.IOException;

public class LessonOneIO {
    public static void main(String[] args) throws IOException {
        String path = "E:/lessTestOne.txt";
        File file = new File(path);

        System.out.println("File name: " + file.getName() + "\n");

        System.out.println("Path: " + file.getPath());
        System.out.println("Absolutely path: " + file.getAbsolutePath() + "\n");

        System.out.println("Absolutely path: " + file.getParent());
        System.out.println("File length: " + file.length() + "\n");

        System.out.println("File: " + (file.exists() ? "exist" : "doesn't exist"));
        System.out.println("File: " + (file.canWrite() ? "writable" : "not writable"));
        System.out.println("File: " + (file.canRead() ? "readable" : "not readable"));
        System.out.println("File: " + (file.isDirectory() ? "is Directory" : "is not Directory"));
        System.out.println("File: " + (file.isFile() ? "is File" : "is not File"));
        System.out.println("File: " + (file.isHidden() ? "is hidden" : "is not hidden")+ "\n");

        System.out.println("Total space: " + CapacityFormatter.toGigabytes(file.getTotalSpace()) + " Gb");
        System.out.println("Free space: " + CapacityFormatter.toGigabytes(file.getFreeSpace()) + " Gb");

    }

    private static class CapacityFormatter {
        private static long toGigabytes(long capacity) {
                return capacity / (long) Math.pow(10, 9);
        }
    }
}
