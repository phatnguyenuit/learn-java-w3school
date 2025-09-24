package advances.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 23:56
 * @project learn-java-w3school
 */

class Box<T> {
    T value; // T is a placeholder for any data type

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class Stats<T extends Number> {
    T[] nums;

    // Constructor
    Stats(T[] nums) {
        this.nums = nums;
    }

    // Calculate average
    double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
}

public class GenericExample {
    public static <T> void printList(List<T> lst) {
        System.out.println("Printing list...");
        for (T item: lst) {
            System.out.println("Item: " + item);
        }
    }

    public static void main(String[] args) {
        // Create a Box to hold a String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("Value: " + stringBox.get());

        // Create a Box to hold an Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(50);
        System.out.println("Value: " + intBox.get());

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        printList(list);

        // Use with Integer
        Integer[] intNums = {10, 20, 30, 40};
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println("Integer average: " + intStats.average());

        // Use with Float
        Float[] floatNums = {10.2F, 20.9F, 30.001F, 40.85F};
        Stats<Float> floatStats = new Stats<>(floatNums);
        System.out.println("Float average: " + floatStats.average());
    }
}
