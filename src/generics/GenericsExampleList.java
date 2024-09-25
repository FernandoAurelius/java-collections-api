package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {
        // Example without Generics
        List listWithoutGenerics = new ArrayList();
        listWithoutGenerics.add("Element nº1");
        listWithoutGenerics.add(10); // Allows adding any type of element

        // Example with Generics
        List<String> genericList = new ArrayList<>();
        genericList.add("Element nº1");
        genericList.add("Element nº2");

        // Iterating over generic list
        for (String element : genericList) {
            System.out.println(element);
        }

        // Iterating over list without generics (mandatory to explicit cast type, may throw errors during execution
        for (Object element : listWithoutGenerics) {
            String str = (String) element;
            System.out.println(str);
        }
    }
}
