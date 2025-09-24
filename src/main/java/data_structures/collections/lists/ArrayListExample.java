package data_structures.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 19:51
 * @project learn-java-w3school
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

        System.out.println(cars);
        System.out.println("Get car in array list with index 0: " + cars.get(0));
        System.out.println("There are " + cars.size() + " car(s).");

        System.out.println("Try to loop through list of cars using for loop");
        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }

        System.out.println("Try to loop through list of cars using for each loop");
        for (String car: cars) {
            System.out.println(car);
        }

        System.out.println("Sorting cars");
        Collections.sort(cars);
        System.out.println(cars);

        System.out.println("Setting car with index");
        cars.set(0, "Opel");
        System.out.println(cars);

        System.out.println("Removing car with index");
        cars.remove(1);
        System.out.println(cars);
        System.out.println("There are " + cars.size() + " car(s).");

        System.out.println("Clearing all cars");
        cars.clear();
        System.out.println(cars);
        System.out.println("There are " + cars.size() + " car(s).");

        // We can declare List<ObjectType> lst = new ArrayList<>();
        // List should come with Reference (Object) Type,
        // when using with primitive types we should use Wrapper Class
        System.out.println("Define and initiate list with List interface");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
    }
}
