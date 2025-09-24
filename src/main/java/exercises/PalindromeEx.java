package exercises;

/**
 * @author PhatNguyen
 * @created 07/09/2025 - 20:01
 * @project learn-java-w3school
 */
public class PalindromeEx {
    public static boolean isPalindrome(String str) {
        int length = str.length();
        int mid = str.length() / 2;
        for (int i = 0; i < mid; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.printf("Is \"%s\" palindrome? -> %b%n", "madam", isPalindrome("madam"));
        System.out.printf("Is \"%s\" palindrome? -> %b%n", "test", isPalindrome("test"));
    }
}
