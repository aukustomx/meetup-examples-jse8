package io.augusto.adefaultstaticmethods;

import java.time.LocalDate;

/**
 * Diamond problem.
 */
public class DBus implements BVehicle , CAlarm {

    @Override
    public LocalDate getYear() {
        return null;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String speedUp() {
        return null;
    }

    @Override
    public String slowDown() {
        return null;
    }

    @Override
    public String turnAlarmOn() {
        return "The vehicle alarm is on.";
    }

    @Override
    public String turnAlarmOff() {
        return "The vehicle alarm is off.";
    }
}
