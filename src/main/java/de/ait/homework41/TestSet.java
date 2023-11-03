package de.ait.homework41;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    private static Set<String> countriesSet = new HashSet<>();

    public static void main(String[] args) {

        countriesSet.add("USA");
        countriesSet.add("Great Britain");
        countriesSet.add("France");
        countriesSet.add("Czech Republic");
        countriesSet.add("Germany");
        countriesSet.add("France");

        System.out.println(countriesSet.size());

        for(String country : countriesSet) {
            System.out.println(country);
        }

        if(!countriesSet.contains("Spain")) {
            countriesSet.add("Spain");
        }

        System.out.println("----");

        System.out.println(countriesSet.size());

        for(String country : countriesSet) {
            System.out.println(country);
        }
    }
}
