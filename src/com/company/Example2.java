package com.company;

import java.util.*;

public class Example2 {

    public static void main(String[] args) {

        // HashMap
        // Key(K)-Value(V)
        // "USD" - 1.75
        // String - Double
        Map<String, Double> currencyMap = new HashMap<>();
        currencyMap.put("USD", 1.75);
        currencyMap.put("BAM", 2.00);
        Double value = currencyMap.get("USD");
        System.out.println(value);

        currencyMap.containsKey("USD");
        currencyMap.containsValue(2.00);

        Set<String> setOfKeys = currencyMap.keySet();
        System.out.println(Arrays.toString(setOfKeys.toArray()));

        // Map of Lists
        List<String> naCountries = new ArrayList<>();
        naCountries.add("Mexico");
        naCountries.add("USA");
        naCountries.add("Canada");

        List<String> euCountries = new ArrayList<>();
        euCountries.add("Spain");
        euCountries.add("France");
        euCountries.add("Italy");

        Map<String, List<String>> continents = new HashMap<>();
        continents.put("North America", naCountries);
        continents.put("Europe", euCountries);

        for(String continent : continents.keySet()){
            System.out.println(continent + " = " + Arrays.toString(continents.get(continent).toArray()));
        }

        continents.remove("Europe");
    }
}
