package advances.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author PhatNguyen
 * @created 06/09/2025 - 21:14
 * @project learn-java-w3school
 */
public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello world!");

        if (matcher.find()) {
            System.out.println("Found a match!");
        } else {
            System.out.println("No match found.");
        }
    }
}
