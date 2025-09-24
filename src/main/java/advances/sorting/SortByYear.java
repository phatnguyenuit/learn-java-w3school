package advances.sorting;

import java.util.Comparator;

/**
 * @author PhatNguyen
 * @created 07/09/2025 - 10:52
 * @project learn-java-w3school
 */
public class SortByYear implements Comparator<Car> {
    /*
       The Comparator interface allows you to create a class with a compare() method
       that compares two objects to decide which one should go first in a list.

       The compare() method should return a number which is:

           - Negative if the first object should go first in a list.
           - Positive if the second object should go first in a list.
           - Zero if the order does not matter.
    */
    @Override
    public int compare(Car a, Car b) {
        return a.getYear() - b.getYear();
    }
}
