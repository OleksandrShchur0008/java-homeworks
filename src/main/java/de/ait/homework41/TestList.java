package de.ait.homework41;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    private static List<String> countriesList = new ArrayList<>();

    private static void showAllCountries() {
        for (String country : countriesList) {
            System.out.println(country);
        }
    }

    private static void removeDuplicates() {
        List<String> uniqueCountries = new ArrayList<>();

        for (String country : countriesList) {
            if (!uniqueCountries.contains(country)) {
                uniqueCountries.add(country);
            }
        }

        countriesList = new ArrayList<>(uniqueCountries);
    }

    public static void main(String[] args) {

        countriesList.add("USA");
        countriesList.add("Great Britain");
        countriesList.add("France");
        countriesList.add("Czech Republic");
        countriesList.add("Germany");
        countriesList.add("France");

        System.out.println(countriesList.size());

        showAllCountries();

        System.out.println("---------");

        /*
        Set<String> uniqueCountries = new HashSet<>(countriesList);
        countriesList.clear();
        countriesList.addAll(uniqueCountries);
         */
        removeDuplicates();
        showAllCountries();
    }
}
