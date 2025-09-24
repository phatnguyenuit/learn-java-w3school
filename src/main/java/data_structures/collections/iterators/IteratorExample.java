package data_structures.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 23:18
 * @project learn-java-w3school
 */
public class IteratorExample {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");

        System.out.println(cars);

        System.out.println("Using Iterator to loop through list of cars:");
        Iterator<String> it = cars.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("We can remove car with iterator:");
        it = cars.iterator();
        while (it.hasNext()) {
            String car = it.next();
            if (car.equals("Volvo")) {
                it.remove();
            }
        }

        System.out.println(cars);
    }
}
