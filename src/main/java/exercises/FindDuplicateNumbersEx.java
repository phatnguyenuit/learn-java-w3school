package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Find duplicate numbers in list
 *
 * @author PhatNguyen
 * @created 07/09/2025 - 21:24
 * @project learn-java-w3school
 */
public class FindDuplicateNumbersEx {
    public static List<Integer> findDuplicateNumbers(int[] numbers) {
        HashMap<Integer, Boolean> store = new HashMap<>();
        List<Integer> duplicateNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (store.containsKey(numbers[i])) {
                duplicateNumbers.add(numbers[i]);
                continue;
            }

            store.put(numbers[i], true);
        }

        return duplicateNumbers;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 5, 8, 1, 5 };

        System.out.println(findDuplicateNumbers(numbers));
    }
}
