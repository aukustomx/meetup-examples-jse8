package io.augusto.adefaultstaticmethods;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public interface BVehicle {

    LocalDate getYear();

    String getBrand();

    String speedUp();

    String slowDown();

    //--------We extend the functionality with default methods ----
    default String turnAlarmOn() {
        return "The vehicle alarm is on.";
    }

    default String turnAlarmOff() {
        return "The vehicle alarm is off.";
    }

    //Implementar calculo de antigüedad del auto
    default long yearsOld() {
        return getYear().until(LocalDate.now(), ChronoUnit.YEARS);
    }
}
