package generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {
    public static void main(String[] args) {
        // Example without Generics
        Set setWithoutGenerics = new HashSet();
        setWithoutGenerics.add("Element nº1");
        setWithoutGenerics.add(10); // Allows adding any type of element

        // Example with Generics
        Set<String> genericSet = new HashSet<>();
        genericSet.add("Element nº1");
        genericSet.add("Element nº2");
        genericSet.add("Element nº1"); // Duplicate elements are ignored in a set

        // Iterating over generic set
        for (String element : genericSet) {
            System.out.println(element);
        }

        // Iterating over set without generics (mandatory to explicit cast type, may throw errors during execution)
        for (Object element : setWithoutGenerics) {
            String str = (String) element;
            System.out.println(str);
        }
    }
}
