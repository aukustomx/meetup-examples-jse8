package io.augusto.blambdafunctionalinterfaces;

import java.util.function.Consumer;

public class TestingInference {

    public static void main(String[] args) {

        //How the inference happens
        /*
        @FunctionalInterface
        public interface Consumer<T> {
            void accept(T t);
        }*/

        //An anonymous class.
        Consumer<String> greeting4 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        //Formal form of a lambda: parameters, curly braces, return and semicolon
        Consumer<String> greeting1 = (String name) -> {
            System.out.println(name);
            return;
        };

        //Parameter and return types inference.
        Consumer<String> greeting2 = name -> System.out.println(name);

        Consumer<String> greeting3 = System.out::println;
    }
}
