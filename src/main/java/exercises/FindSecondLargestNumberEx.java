package exercises;

/**
 * @author PhatNguyen
 * @created 20/09/2025 - 09:30
 * @project learn-java-w3school
 */
public class FindSecondLargestNumberEx {
    public static int findSecondLargestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargestNumber(new int[]{1, 2, 3, 4, 5}));
    }
}
