package exercises;

/**
 * @author PhatNguyen
 * @created 20/09/2025 - 09:26
 * @project learn-java-w3school
 */
public class DigitCalculationEx {
    public static int countsDigits(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    public static int sumDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countsDigits(123)); // Output: 3
        System.out.println(sumDigits(123)); // Output: 6
    }
}
