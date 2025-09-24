package basic;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 10:56
 * @project learn-java-w3school
 */
public class RecursionExample {
    public static void countdown(int ms) {
        System.out.print(ms);
        if (ms > 0) {
            System.out.print("...");
            countdown(ms - 1);
        }
    }

    public static void main(String[] args) {
        countdown(10);
    }
}
