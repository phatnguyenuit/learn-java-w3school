package exercises;


import static exercises.GreatestCommonDivisorEx.gcd;

/**
 * @author PhatNguyen
 * @created 19/09/2025 - 21:51
 * @project learn-java-w3school
 */
public class LeastCommonMultipleEx {
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(10, 8)); // Output: 40
        System.out.println(lcm(4, 6));  // Output: 12
    }
}
