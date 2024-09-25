package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExampleMap {
    public static void main(String[] args) {
        // Example without Generics
        Map mapWithoutGenerics = new HashMap();
        mapWithoutGenerics.put("key1", "value1");
        mapWithoutGenerics.put(10, "value2"); // Allows adding any type of key-value pair

        // Example with Generics
        Map<String, String> genericMap = new HashMap<>();
        genericMap.put("key1", "value1");
        genericMap.put("key2", "value2");

        // Iterating over key-value pairs in generic map
        for (Map.Entry<String, String> entry : genericMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Iterating over key-value pairs in map without generics (mandatory to explicit cast type, may throw errors during execution)
        for (Object entry : mapWithoutGenerics.entrySet()) {
            Map.Entry<String, String> mapEntry = (Map.Entry<String, String>) entry;
            String key = mapEntry.getKey();
            String value = mapEntry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
