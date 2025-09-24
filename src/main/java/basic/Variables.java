package basic;

/**
 * @author PhatNguyen
 * @created 30/08/2025 - 21:43
 * @project learn-java-w3school
 */
public class Variables {
    public static void main(String[] args) {
        /*
        Primitive types: byte, short, int, long, float, double, boolean, char
        Non-primitive types: String, Array, Class, Interface, Enum

        Non-primitive data types are called reference types because they refer to objects.

        The main differences between primitive and non-primitive data types are:

        - Primitive types in Java are predefined and built into the language,
          while non-primitive types are created by the programmer (except for String).

        - Non-primitive types can be used to call methods to perform certain operations,
          whereas primitive types cannot.

        - Primitive types start with a lowercase letter (like int),
          while non-primitive types typically starts with an uppercase letter (like String).

        - Primitive types always hold a value, whereas non-primitive types can be null.
        */

        String fullName = "Nguyen Tan Phat";
        int year = 1995;
        float avgScore = 8.99f;
        double pi = 3.1415161315;
        boolean isMale = true;
        char firstChar = 'P';

        System.out.printf("My name is %s\n", fullName);
        System.out.printf("My year of birth is %d\n", year);
        System.out.printf("Average score = %.2f\n", avgScore);
        System.out.printf("PI = %.10f\n", pi);
        System.out.printf("Is male is %b\n", isMale);
        System.out.printf("First character is %c\n", firstChar);

        // constant
        final int constant = 100;

        // cannot update value for final variables
        // constant = 200;
        System.out.println(constant);
    }
}
