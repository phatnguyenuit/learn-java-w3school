package exercises;

/**
 * Write multiplication from 1 to 10
 * @author PhatNguyen
 * @created 07/09/2025 - 18:52
 * @project learn-java-w3school
 */
public class MultiplicationTableEx {
    public static String padStart(int n, int length) {
        return String.format("%" + length + "s", n);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                String line = String.format(
                        "%s x %s = %s  ",
                        padStart(j, 2),
                        padStart(i, 2),
                        padStart(i * j, 2)
                );
                System.out.print(line);
            }
            System.out.println();
        }
    }
}
