package de.ait.testLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaUtil {
    //arguments -> { body }
    //Runnable, Callable, Comparator, Consumer, Supplier, Function
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");

        //typical for-each
        for (String e : list) {
            System.out.print(e + " ");
        }
        System.out.println();

        //lambda for-each
        list.forEach(element -> System.out.print(element + " "));
        System.out.println();

        List<Integer> numbers = Arrays.asList(4,12,54,9,7,22,76,34,5,3,9);
        List<Integer> numbersSelected = numbers.stream().filter(number -> number > 10).toList();
        numbersSelected.forEach(number -> System.out.print(number + " "));    }
}
