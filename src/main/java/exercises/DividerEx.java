package exercises;

import java.util.Optional;

/**
 * @author PhatNguyen
 * @created 20/09/2025 - 09:38
 * @project learn-java-w3school
 */
public class DividerEx {
    public static Optional<Float> safeDivide(int x, int y) {
        if (y == 0) {
            return Optional.empty();
        }
        return Optional.of((float) x / y);
    }

    public static void main(String[] args) {
        safeDivide(10, 2).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Cannot divide by zero.")
        );

        safeDivide(2, 0).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Cannot divide by zero.")
        );
    }
}
