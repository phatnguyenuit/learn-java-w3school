package exercises;

/**
 * Reverse a string
 * Example: hello -> olleh
 *
 * @author PhatNguyen
 * @created 07/09/2025 - 19:47
 * @project learn-java-w3school
 */
public class ReverseStringEx {
    public static String reverseString(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(String.format("Reverse \"%s\": \"%s\"", "hello", reverseString("hello")));
        System.out.println(String.format("Reverse \"%s\": \"%s\"", "ok", reverseString("ok")));
        System.out.println(String.format("Reverse \"%s\": \"%s\"", "madam", reverseString("madam")));
    }
}
