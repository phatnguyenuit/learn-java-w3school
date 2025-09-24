package advances.annotations.custom;

import advances.annotations.custom.annotations.Init;
import advances.annotations.custom.annotations.JsonElement;
import advances.annotations.custom.annotations.JsonSerializable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author PhatNguyen
 * @created 02/09/2025 - 20:26
 * @project learn-java-w3school
 */
public class ObjectToJsonConverter {
    public String toJson(Object obj) throws JsonSerializationException
    {
        try {
            checkIfSerializable(obj);
            initializeObject(obj);
            return getJsonString(obj);
        } catch (Exception e) {
            throw new JsonSerializationException(e.getMessage());
        }
    }

    private void checkIfSerializable(Object object) {
        if (Objects.isNull(object)) {
            throw new JsonSerializationException("The object to serialize is null");
        }

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new JsonSerializationException("The class " + clazz.getSimpleName() + " is not annotated with JsonSerializable");
        }
    }

    private void initializeObject(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Init.class)) {
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }

    private String getJsonString(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        Map<String, Object> jsonElementsMap = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                String preferredKey = field.getAnnotation(JsonElement.class).key();
                String key = preferredKey.length() > 0 ? preferredKey : field.getName();
                Object value = field.get(obj);

                if (value instanceof String) {
                    value = String.format("\"%s\"", value);
                }

                jsonElementsMap.put(key, value);
            }
        }

        String jsonString = jsonElementsMap.entrySet().stream()
                .map(entry -> String.format("\"%s\": ", entry.getKey()) + entry.getValue())
                .collect(Collectors.joining(","));

        return String.format("{%s}", jsonString);
    }
}
