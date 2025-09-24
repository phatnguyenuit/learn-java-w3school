package exercises;

import java.util.HashMap;

/**
 * @author PhatNguyen
 * @created 07/09/2025 - 20:08
 * @project learn-java-w3school
 */
public class FibonacciSequenceEx {
    static HashMap<Integer, Integer> fibMemo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (fibMemo.containsKey(n)) {
            return fibMemo.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        fibMemo.put(n, result);

        return result;
    }

    public static void printFibonacciSequence(int n) {
        for (int i = 0; i<= n; i++) {
            System.out.print(fibonacci(i));

            if (i < n) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        printFibonacciSequence(10);
    }
}
