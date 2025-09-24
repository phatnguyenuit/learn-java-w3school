package errors;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 09:11
 * @project learn-java-w3school
 */
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
