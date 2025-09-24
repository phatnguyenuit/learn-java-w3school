package advances.annotations.custom;


/**
 * Demonstrates the use of custom annotations for JSON serialization.
 * <p>
 * This class creates a {@link Person} object and uses an {@link ObjectToJsonConverter}
 * to serialize it to a JSON string. The converter's behavior is likely guided by
 * custom annotations on the {@code Person} class.
 */
public class CustomAnnotationsExample {
    public static void main(String[] args) {
        Person person = new Person("Fast", "Nguyen", 30);
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.toJson(person);

        System.out.println(jsonString);
    }
}
