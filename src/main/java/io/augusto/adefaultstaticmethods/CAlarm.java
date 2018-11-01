package io.augusto.adefaultstaticmethods;

public interface CAlarm {

    default String turnAlarmOn() {
        return "The vehicle alarm is on.";
    }

    default String turnAlarmOff() {
        return "The vehicle alarm is off.";
    }
}
