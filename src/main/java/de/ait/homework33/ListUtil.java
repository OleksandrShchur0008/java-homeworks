package de.ait.homework33;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    private static List<String> listA, listB;

    public static void main(String[] args) {
        listA = new ArrayList<>();
        listB = new ArrayList<>();

        listA.add("Apple");
        listA.add("Banana");
        //listA.add("Cherry");
        listA.add("Melon");
        //listA.add("Blackberry");

        listB.add("Apple");
        listB.add("Banana");
        listB.add("Kiwi");
        //listB.add("Melon");
        listB.add("Blackberry");

        System.out.println(listA);
        System.out.println(listB);
        System.out.println("---------------");
        //listA.remove("Cherry");
        //listB.add(2,"Mango");
        System.out.println(listA);
        System.out.println(listB);
        System.out.println("---------------");

        String result = compareLists(listA, listB);
        System.out.println(result);
    }

    private static String compareLists (List<String> listA, List<String> listB) {
        if(listA.equals(listB)) {
            return "Lists Equals";
        } else {
            return "Lists Not Equals";
        }
    }
}
