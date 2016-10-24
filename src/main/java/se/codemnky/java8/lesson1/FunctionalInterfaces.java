package se.codemnky.java8.lesson1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Stockholm");
        map.put(2, "Göteborg");
        map.put(3, "Malmö");

        BiConsumer<Integer, String> bi = (key, value) -> System.out.println(key + ":" + value);

        map.forEach(bi);

        List<String> cities = Arrays.asList("Stockholm","Göteborg","Malmö");
        Consumer<String> consumer = (key) -> System.out.println(key);

        cities.stream().forEach(consumer);

        BiFunction<Integer, String, String> biFunction = (k, v) -> {return k + ":" + v;};

        map.replaceAll(biFunction);
        System.out.println(map);

    }

}
