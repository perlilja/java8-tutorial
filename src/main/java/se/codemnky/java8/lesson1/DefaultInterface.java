package se.codemnky.java8.lesson1;


public interface DefaultInterface {

    void hello();

    default void sayHi() {
        System.out.println("Hi");
    }


}
