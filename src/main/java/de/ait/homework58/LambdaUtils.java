package de.ait.homework58;

import java.util.Arrays;
import java.util.List;

public class LambdaUtils {

    public static void main(String[] args) {

        System.out.println("Ex1");

        List<String> cars = Arrays.asList("VW", "BMW", "AUDI", "PORSCHE");
        cars.stream().filter(car -> car.startsWith("A") || car.startsWith("P")).forEach(System.out::println);

        System.out.println("Ex2");

        List<Integer> numbers = Arrays.asList(2, 6, 9, 10);
        List<Integer> result = numbers.stream().map(number -> number * number).toList();
        result.forEach(System.out::println);

        System.out.println("Ex3");

        List<Integer> numberToFilter = Arrays.asList(3, 9, 77, 43, 12);
        numberToFilter.stream().filter(filteredNumber -> filteredNumber % 2 == 0).forEach(System.out::println);

        System.out.println("Ex4");

        List<Integer> numbersToPrint = Arrays.asList(1,2,3,4,5,6,7);
        numbersToPrint.stream().forEach(System.out::println);

        System.out.println("Ex5");

        List<String> stringToUpperCase = Arrays.asList("Apple", "Samsung", "Sony", "LG", "Fujitsu");
        stringToUpperCase.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

    }
}
