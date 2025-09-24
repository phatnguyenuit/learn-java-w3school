package basic;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 10:15
 * @project learn-java-w3school
 */
public class ForEachLoop {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
