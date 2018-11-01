package io.augusto.estreams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AStreamTest {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Mexico", "Argentina", "Brasil", "USA", "Chile", "Colombia");

        //Printing the countries' list using for

        //Printing the countries' list using foreach

        //Printing the countries' list using external iterator
        Iterator<String> iterator = countries.iterator() ;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Printing the countries' list using build-in foreach on Iterables
        //with anonymous Consumer

        //Printing the countries' list using build-in foreach on Iterables
        //with full lambda

        //Printing the countries' list using build-in foreach on Iterables
        //with Lamda Type Inference

        //Printing the countries' list using build-in foreach on Iterables
        //with Method referece
        //countries.forEach(System.out::println);
    }
}
