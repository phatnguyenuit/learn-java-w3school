package basic;

/**
 * @author PhatNguyen
 * @created 30/08/2025 - 22:03
 * @project learn-java-w3school
 */
public class Numbers {
    public static void main(String[] args) {
        // [-2^7, 2^7 - 1]
        byte byteValue = 127;
        System.out.println("Byte value: " + byteValue);

        // [-2^15, 2^15 - 1]
        short shortValue = 32_767;
        System.out.println("Short value: " + shortValue);

        // [-2^31, 2^31 - 1]
        int intValue = 2_100_100_000;
        System.out.println("Int value: " + intValue);

        // [-2^63, 2^63 - 1]
        long longValue = 9_000_000_000_000_000L;
        System.out.println("Long value: " + longValue);

        // floating point number. 6 to 7 decimal digits
        float floatValue = 9.123456f;
        System.out.println("Float value: " + floatValue);

        // floating point number. 15 to 16 decimal digits
        double doubleValue = 9.123456789123456789;
        System.out.println("Double value: " + doubleValue);
    }
}
