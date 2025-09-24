package advances.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author PhatNguyen
 * @created 06/09/2025 - 21:32
 * @project learn-java-w3school
 */

/*
Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
The lambda expression should have the same number of parameters and the same return type as that method.
Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package) used by lists.
*/
interface StringFunction {
    String run(String str);
}

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        System.out.println("---");
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        System.out.println("---");
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        printFormatted("Hi", exclaim);
        printFormatted("Hi", ask);

    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
