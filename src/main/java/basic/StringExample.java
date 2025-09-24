package basic;

/**
 * @author PhatNguyen
 * @created 30/08/2025 - 23:37
 * @project learn-java-w3school
 */
public class StringExample {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("String length is " + str.length());

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // count from 0, and return the first index, -1 in case no match
        System.out.println("Index of \"l\" is: " + str.indexOf("l"));
        System.out.println("Index of \"k\" is: " + str.indexOf("k"));

        // concatenate strings
        System.out.println("Text is:" + str);
        System.out.println("Text is:".concat(str));

        // string concatenation with numbers, always returns string concatenation result
        System.out.println("10" + 20);
        System.out.println(10 + "20");
    }
}
