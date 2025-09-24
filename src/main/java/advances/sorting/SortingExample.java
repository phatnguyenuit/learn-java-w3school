package advances.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author PhatNguyen
 * @created 06/09/2025 - 21:43
 * @project learn-java-w3school
 */
public class SortingExample {
    public static List<Car> createCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "X5", 1999));
        cars.add(new Car("Honda", "Accord", 2006));
        cars.add(new Car("Ford", "Mustang", 1970));

        return cars;
    }

    public static void sortCarsWithComparator() {
        System.out.println("==SortingExample.sortCarsWithComparator==");
        List<Car> cars = createCars();

        System.out.println("Initial cars....");
        System.out.println(cars);

        System.out.println("Sorting cars...");
        Comparator<Car> comparator = new SortByYear();
        Collections.sort(cars, comparator);

        System.out.println(cars);
        System.out.println("==============================================");
    }

    public static void sortCarsWithLambdaExpressionComparator() {
        System.out.println("SortingExample.sortCarsWithLambdaExpressionComparator");
        List<Car> cars = createCars();

        System.out.println("Initial cars....");
        System.out.println(cars);

        System.out.println("Sorting cars...");
        Collections.sort(cars, (car1, car2) -> car1.getYear() - car2.getYear());

        System.out.println(cars);
        System.out.println("==============================================");
    }

    public static void sortCarsWithComparable() {
        System.out.println("==SortingExample.sortCarsWithComparable==");
        List<ComparableCar> cars = createComparableCars();

        System.out.println("Initial cars....");
        System.out.println(cars);

        System.out.println("Sorting cars...");
        // it will use ComparableCar::compareTo method automatically.
        Collections.sort(cars);

        System.out.println(cars);
        System.out.println("==============================================");
    }

    public static List<ComparableCar> createComparableCars() {
        List<ComparableCar> cars = new ArrayList<>();

        cars.add(new ComparableCar("BMW", "X5", 1999));
        cars.add(new ComparableCar("Honda", "Accord", 2006));
        cars.add(new ComparableCar("Ford", "Mustang", 1970));
        return cars;
    }

    public static void main(String[] args) {
        sortCarsWithComparator();
        sortCarsWithLambdaExpressionComparator();
        sortCarsWithComparable();
    }
}
