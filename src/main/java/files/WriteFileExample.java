package files;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 09:19
 * @project learn-java-w3school
 */
public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("hello.txt");

            fileWriter.write("Learn Java is fun :)\n");
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }
    }
}
