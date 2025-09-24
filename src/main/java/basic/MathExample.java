package basic;

/**
 * @author PhatNguyen
 * @created 30/08/2025 - 23:46
 * @project learn-java-w3school
 */
public class MathExample {
    public static int randomNumberInRange(int from, int to) {
        // [0, 1)
        // from + [0, 1) * (to - from + 1)
        int random = from + (int) (Math.random() * (to - from + 1));

        return random;
    }

    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(19, 11));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-64));

        // [0, 1)
        System.out.println(Math.random());
        System.out.println("Random from 0 -> 10: " + randomNumberInRange(0, 10));
    }
}
