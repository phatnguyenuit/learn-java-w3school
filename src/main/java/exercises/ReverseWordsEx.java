package exercises;

/**
 * @author PhatNguyen
 * @created 18/09/2025 - 20:04
 * @project learn-java-w3school
 */
public class ReverseWordsEx {
    public static String reserveWords(String sentence) {
        String[] words = sentence.trim().split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];

            if (i > 0) {
                result += " ";
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(reserveWords("Learn Java is fun"));
        System.out.println(reserveWords("hello world"));
    }
}
