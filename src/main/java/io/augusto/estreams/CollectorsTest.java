package io.augusto.estreams;

import io.augusto.student.Student;
import io.augusto.student.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest {

    public static void main(String[] args) {

        List<ECountry> countries = Arrays.asList(
                new ECountry("Mexico", EContinent.AMERICA),
                new ECountry("Uganda", EContinent.AFRICA),
                new ECountry("Argentina", EContinent.AMERICA),
                new ECountry("Brasil", EContinent.AMERICA),
                new ECountry("USA", EContinent.AMERICA),
                new ECountry("Chile", EContinent.AMERICA),
                new ECountry("France", EContinent.EUROPE),
                new ECountry("Spain", EContinent.EUROPE),
                new ECountry("Colombia", EContinent.AMERICA)
        );

        //Printing comma separated country names using for
        //Mexico, Argentina, ... Colombia

        //Printing comma separated country names using joining

        //Map using country's Continent as key
    }

    /**
     * Generating a list old way
     * @return List of uppercase names
     */
    private static List<String> upperListOldWay() {

        //Option1 - for loop
        List<String> newList = new ArrayList<>();
        for (Student student : Students.defaultStudents()) {
            String uppername = student.getName().toUpperCase();
            newList.add(uppername);
        }
        return newList;
    }

    /**
     * Generating a list using collectors
     * @return List of uppercase names
     */
    private static List<String> upperListCollectors() {
        return Students.defaultStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
