package se.codemnky.java8.lesson1;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


// 1. Static method
// 2. Instance method on class
// 3. Instance method on object
// 4. Constructor

public class MethodReference {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> myInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Consumer<String> consumer = String::valueOf;

        myInt.stream().map(String::valueOf).forEach(System.out::println);

        myInt.stream().map((i) -> String.valueOf(i)).forEach(System.out::println);


        myInt.stream().map((i) -> new Person(i)).forEach(System.out::println);

        Function<Person,Integer> f1 = Person::getAge;
        Function<Person,Integer> f4 = (Person p) -> p.getAge();



        Person p1 = new Person(1);
        Supplier<Integer> f2 = p1::getAge;

        Supplier<Integer> f3 = () -> p1.getAge();

        f1.apply(new Person(2));

        Person.class.getMethod("getAge").invoke(p1);
    }
}
