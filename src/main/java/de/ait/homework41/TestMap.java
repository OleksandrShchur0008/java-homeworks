package de.ait.homework41;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    private static Map<String, String> capitalMap = new HashMap<>();

    private static boolean checkCountry(String countryNameKey) {
        return capitalMap.containsKey(countryNameKey);
    }

    private static boolean addNewCounty(String countryNameKey, String countryNameNewValue) {
        if (!checkCountry(countryNameKey)) {
            capitalMap.put(countryNameKey, countryNameNewValue);
            return true;
        } else {
            System.out.println("Country " + countryNameKey + " already in list");
            return false;
        }
    }

    public static void main(String[] args) {

        capitalMap.put("USA", "Washington");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("France", "Paris");
        capitalMap.put("Czech Republic", "Prague");
        capitalMap.put("Germany", "Berlin");

        System.out.println(capitalMap.size());
        capitalMap.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("------");

        capitalMap.replace("USA", "San-Francisco");
        capitalMap.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("-----");

        if(!checkCountry("Spain")) {
            addNewCounty("Spain", "Madrid");
        }

        capitalMap.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
