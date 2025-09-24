package exercises;

/**
 * @author PhatNguyen
 * @created 20/09/2025 - 09:33
 * @project learn-java-w3school
 */
public class RemoveWhiteSpacesEx {
    public static String removeWhiteSpaces(String str) {
        // Use String.replaceAll
        // return str.replaceAll("\\s", "");

        // Use algorithm
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("Hello World"));
        System.out.println(removeWhiteSpaces("    Hello          World   "));
    }
}
