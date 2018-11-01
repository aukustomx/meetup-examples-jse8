package io.augusto.adefaultstaticmethods;

import java.time.LocalDate;
import java.time.Month;

public class ACar implements BVehicle {

    private String brand;
    private LocalDate year;

    public ACar(String brand, int year) {
        this.brand = brand;
        this.year = LocalDate.of(year, Month.JANUARY, 1);
    }

    @Override
    public LocalDate getYear() {
        return year;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}
