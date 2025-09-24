package basic;

/**
 * @author PhatNguyen
 * @created 30/08/2025 - 23:15
 * @project learn-java-w3school
 */
public class TypeCasting {
    /*
    Type casting is when you assign a value of one primitive data type to another type.
    In Java, there are two types of casting:

    - Widening Casting (automatically) - converting a smaller type to a larger type size
      byte -> short -> char -> int -> long -> float -> double

    - Narrowing Casting (manually) - converting a larger type to a smaller size type
      double -> float -> long -> int -> char -> short -> byte

    */
    public static void widenCast() {
        System.out.println("===Widening Casting===");
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        System.out.println("========================");
    }

    public static void narrowCast() {
        System.out.println("===Narrowing Casting===");
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        System.out.println("========================");
    }

    public static void realLifeExample() {
        System.out.println("===realLifeExample===");
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /*
        Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate
        */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
        System.out.println("===============================");
    }

    public static void main(String[] args) {
        widenCast();
        System.out.println();
        narrowCast();
        System.out.println();
        realLifeExample();
    }
}
