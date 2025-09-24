package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 09:19
 * @project learn-java-w3school
 */
public class ReadFileExample {
    public static void readFileDetails(File file) {
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("File size in bytes " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("hello.txt");

            readFileDetails(file);

            Scanner scanner = new Scanner(file);
            System.out.println("Reading file content....");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (IOException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }
    }
}
