package exercises;

/**
 * @author PhatNguyen
 * @created 20/09/2025 - 09:14
 * @project learn-java-w3school
 */
public class CheckPerfectNumberEx {
    public static boolean isPerfectNumber(int x) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                sum += i;
                if (i * i != x) {
                    sum += x / i;
                }
            }
        }

        return sum == x;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // Output: true
        System.out.println(isPerfectNumber(28)); // Output: true
        System.out.println(isPerfectNumber(32)); // Output: false
    }
}
