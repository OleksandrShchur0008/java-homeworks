package de.ait.homework38;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesApp {

    private static Set<String> uniqueNames;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        uniqueNames = new HashSet<>();
        System.out.println("Enter names. Enter \"Stop\" to exit.");

        while (true) {
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("stop")) {
                scanner.close();
                break;
            }

            if (uniqueNames.add(name)) {
                System.out.println(name + " has added.");
            } else {
                System.out.println(name + " hasn't added");
            }
        }

        if (uniqueNames.isEmpty()) {
            System.out.println("List is Empty.");
        } else {
            System.out.println("UniqueNames:");
            for (String name : uniqueNames) {
                System.out.println(name);
            }
        }
    }
}
