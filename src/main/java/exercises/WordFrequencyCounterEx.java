package exercises;

import java.util.*;

/**
 * @author PhatNguyen
 * @created 07/09/2025 - 20:42
 * @project learn-java-w3school
 */
public class WordFrequencyCounterEx {
    public static int calculateWordFrequency(String[] words, String word) {
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input your sentence:");
            String userInput = scanner.nextLine();
            String[] words = userInput.trim().split(" ");
            // keeps word order.
            Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

            for (String word : uniqueWords) {
                System.out.printf("\"%s\" repeats %d time(s).%n", word, calculateWordFrequency(words, word));
            }

        } catch (Exception ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
}
