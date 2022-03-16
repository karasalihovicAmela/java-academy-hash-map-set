package com.company;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        // HashSet
        // ArrayList - Value
        // []
        // Set -> Unique vrijednosti!
        Set<String> monthsSet = new HashSet<>();
        List<String> monthsList = new ArrayList<>();

        monthsList.add("JAN");
        monthsList.add("JAN");
        monthsList.add("JAN");
        monthsList.add("JAN");
        monthsList.add("JAN");
        monthsList.add("JAN");

        monthsSet.add("JAN");
        monthsSet.add("JAN");
        monthsSet.add("JAN");
        monthsSet.add("JAN");
        monthsSet.add("JAN");
        monthsSet.add("JAN");
        monthsSet.add("JAN");
        monthsSet.add("JAN");
        monthsSet.add("JAN");
        monthsSet.add("JAN");

        for (String s : monthsSet) {
            System.out.println(s);
        }

        System.out.println("List: " + Arrays.toString(monthsList.toArray()));
        System.out.println("Set: " + Arrays.toString(monthsSet.toArray()));

        monthsSet.remove("JAN");

    }
}
