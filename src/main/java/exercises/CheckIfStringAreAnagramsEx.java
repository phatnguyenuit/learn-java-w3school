package exercises;

import java.util.HashMap;

/**
 * Check if two strings are anagrams
 * (same characters and frequency)
 * <br />
 * Example: listen and silent
 *
 * @author PhatNguyen
 * @created 08/09/2025 - 10:18
 * @project learn-java-w3school
 */
public class CheckIfStringAreAnagramsEx {
    public static HashMap<Character, Integer> countCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!charCount.containsKey(c)) {
                charCount.put(c, 1);
            }

            Integer count = charCount.get(c);
            charCount.put(c, ++count);
        }

        return charCount;
    }

    public static boolean areAnagrams(String str, String str2) {
        if (str.length() != str2.length()) return false;

        HashMap<Character, Integer> s1Count = countCharacters(str);
        HashMap<Character, Integer> s2Count = countCharacters(str2);

        for (Character c : s1Count.keySet()) {
            if (!s2Count.containsKey(c)) return false;
            if (s1Count.get(c) != s2Count.get(c)) return false;
        }

        return true;

    }

    public static void checkStringsAreAnagrams(String s1, String s2) {
        System.out.printf("Check if \"%s\" and \"%s\" are anagrams: %b%n", s1, s2, areAnagrams(s1, s2));
    }

    public static void main(String[] args) {
        checkStringsAreAnagrams("listen", "silent");
        checkStringsAreAnagrams("hello", "ok");
        checkStringsAreAnagrams("hello", "bello");
    }
}
