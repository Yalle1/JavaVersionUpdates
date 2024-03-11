package com.yalle1.java9;

import java.util.*;

public class FactoryMethodsDemo {

    public static void main(String[] args) {

        //Creating unmodifiable List before Java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));

        //Creating unmodifiable List after Java9
        List<String> courses2 = List.of("Java","Spring","Agile");

        //Creating unmodifiable Set after Java9
        Set<Integer> set = Set.of(1,2,3,4,5);

        //Creating unmodifiable Map after Java9
        Map<String, Integer> map = Map.ofEntries(
                Map.entry("Amount of items", 10),
                Map.entry("Amount of products", 20),
                Map.entry("Amount of people", 5)
        );






    }
}
