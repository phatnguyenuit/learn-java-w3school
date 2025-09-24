package files;

import java.io.File;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 09:15
 * @project learn-java-w3school
 */
public class DeleteFileExample {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
