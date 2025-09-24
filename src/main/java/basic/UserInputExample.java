package basic;

import java.util.Scanner;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 11:22
 * @project learn-java-w3school
 */
public class UserInputExample {
    public static void main(String[] args) {
        // Using a "try-with-resources" block is the best practice for managing
        // resources like Scanner. It automatically closes the scanner for you.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input your name: ");
            String name = scanner.nextLine();

            System.out.print("Input your age: ");
            int age = scanner.nextInt();

            System.out.print("Input your salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Is Java fun? (true/false): ");
            boolean isJavaFun = scanner.nextBoolean();

            // *** IMPORTANT FIX ***
            // The nextInt(), nextDouble(), nextBoolean() etc. methods read the number/boolean
            // but do not consume the "newline" character you press with 'Enter'.
            // This leftover newline would be immediately read by the next nextLine(),
            // causing it to skip the user's input.
            // We call nextLine() here to consume that leftover newline.
            scanner.nextLine();

            System.out.print("What is your favorite quote? ");
            String quote = scanner.nextLine();

            System.out.println("\n--- Your Information ---");
            System.out.printf("Name: %s\n", name);
            System.out.printf("Age: %d\n", age);
            System.out.printf("Salary: %.2f\n", salary);
            System.out.printf("Thinks Java is fun: %b\n", isJavaFun);
            System.out.printf("Favorite Quote: %s\n", quote);
        }
        // The scanner is automatically closed here by the try-with-resources block.
    }
}