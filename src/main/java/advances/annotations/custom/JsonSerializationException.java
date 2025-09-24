package advances.annotations.custom;

/**
 * @author PhatNguyen
 * @created 02/09/2025 - 20:30
 * @project learn-java-w3school
 */
public class JsonSerializationException extends RuntimeException {
    public JsonSerializationException(String message) {
        super(message);
    }
}
