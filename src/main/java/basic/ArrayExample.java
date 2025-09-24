package basic;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 10:24
 * @project learn-java-w3school
 */
public class ArrayExample {
    public static void calculateAvg() {
        int[] numbers = {10, 9, 6, 1, 5, 9, 2, 5};
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        float avg = (float) total / numbers.length;
        System.out.println("Average is: " + avg);
    }

    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        cars[0] = "Opel";
        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int[][] matrix = { { 1, 2, 3 }, { 5, 6, 7 } };
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j]);

                if (j < matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        calculateAvg();
    }
}
