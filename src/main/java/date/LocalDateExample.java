package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 09:00
 * @project learn-java-w3school
 */
public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current date and time formatted: " + now.format(fmt));
    }
}
