package io.augusto.adefaultstaticmethods;

import io.augusto.student.Catalog;
import io.augusto.student.Students;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DefaultMethodsTest {

    public static void main(String[] args) {


        List<Map<String, String>> catalog = Students.defaultStudents().stream()
                .map(Catalog::asCatalogMap) //asCatalog is a default method within the Catalog interface
                .collect(Collectors.toList());

        //Printing catalog
        System.out.println(catalog);
        /*

        BVehicle car = new ACar("BMW", 1950);
        System.out.println("The car brand is " + car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());

        //yearsOld is a default method within the BVehicle interface
        System.out.println("This car is " + car.yearsOld() + " years old");
        */
    }
}
