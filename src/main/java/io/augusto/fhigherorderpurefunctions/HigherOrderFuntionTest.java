package io.augusto.fhigherorderpurefunctions;

import java.util.function.Consumer;

public class HigherOrderFuntionTest {

    public static void main(String[] args) {

        //We van pass function to function
        consumeText("Passing function Hello world Method Reference", System.out::println);
        consumeText("Passing function Hello world", text -> System.out.println(text + " The lenght of text is: " + text.length()));
        System.out.println();

        //We can create function within function
        Consumer<String> printInUpperCase = text -> System.out.println(text.toUpperCase());
        consumeText("Creating function within function", printInUpperCase);
        System.out.println();

        //We can return function from function
        consumerByOperation(Operation.JUST_PRINT).accept("Returning function from function Just printing text");
        consumerByOperation(Operation.PRINT_LENGHT).accept("Returning function from function Printing length of text");
        consumerByOperation(Operation.PRINT_UPPERCASE).accept("Returning function from function Printing text to uppercase");
    }

    private static void consumeText(String text, Consumer<String> consumer) {
        consumer.accept(text);
    }

    private static Consumer<String> consumerByOperation(Operation operation) {
        switch (operation) {
            case JUST_PRINT: return System.out::println;
            case PRINT_LENGHT: return text -> System.out.println(text + " The lenght of text is: " + text.length());
            case PRINT_UPPERCASE: return text -> System.out.println(text.toUpperCase());
            default: return text -> {};
        }
    }
}
