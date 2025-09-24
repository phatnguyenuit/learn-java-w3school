package exercises;

/**
 * @author PhatNguyen
 * @created 19/09/2025 - 21:32
 * @project learn-java-w3school
 */
public class GreatestCommonDivisorEx {
    public static int gcd(int a, int b) {
        System.out.println(a + " " + b);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(10, 8)); // Output: 2
    }
}
