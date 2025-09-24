package files;

import java.io.File;
import java.io.IOException;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 09:15
 * @project learn-java-w3school
 */
public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("hello.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }
    }
}
