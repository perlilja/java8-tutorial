package se.codemnky.java8.lesson1;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OptionalExample {

    public static void main(String[] args) {
        Predicate<Integer> filter = (i) -> i % 2 == 0;

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        myList.stream().filter(filter).findFirst().ifPresent(i -> {
            System.out.println(i);
        });

    }

}
