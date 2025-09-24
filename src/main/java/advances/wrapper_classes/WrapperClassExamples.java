package advances.wrapper_classes;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 23:25
 * @project learn-java-w3school
 */
public class WrapperClassExamples {
    public static void main(String[] args) {
        // Wrapper classes provide a way to use primitive data types as objects
        // int -> Integer, ..., boolean -> Boolean
        // use .intValue() to get int value from Integer object
        // similar to the rest of data types

        Integer intObj = 10;
        System.out.println(intObj);
        System.out.println(intObj.intValue());
    }
}
