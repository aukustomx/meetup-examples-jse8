package io.augusto.gdatetime;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OldWayDate {

    public static void main(String[] args) {

        /** /
        //Getting current time------------------------------------------
        Date nowOld = new Date(); //Old way
        ZonedDateTime nowNew = ZonedDateTime.now(); //New way
        /**/

        /** /
        //Representing specific time------------------------------------
        Date birthDayOld = new GregorianCalendar(1990, Calendar.DECEMBER, 15).getTime(); // Old
        LocalDate birthDayNew = LocalDate.of(1990, Month.DECEMBER, 15); // New
        /**/

        /** /
        //Extracting specific fields------------------------------------
        int monthOld = new GregorianCalendar().get(Calendar.MONTH); // Old
        Month monthNew = LocalDateTime.now().getMonth(); // New
        /**/

        /** /
        //Adding and subtracting time-----------------------------------
        // Old
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.HOUR_OF_DAY, -5);
        Date fiveHoursBeforeOld = calendar.getTime();

        // New
        LocalDateTime fiveHoursBeforeNew = LocalDateTime.now().minusHours(5);
         /**/

        /** /
        //Truncating ----------------------------------------------------
        // Old
        Calendar now = Calendar.getInstance();
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);
        Date truncatedOld = now.getTime();

        // New
        LocalTime truncatedNew = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
        /**/

        /** /
        //Getting time span between two points in time --------------------
        // Old
        GregorianCalendar calendarSpanOld = new GregorianCalendar();
        Date nowSpanOlds = new Date();
        calendarSpanOld.add(Calendar.HOUR, 1);
        Date hourLaterOld = calendarSpanOld.getTime();
        long elapsedOld = hourLaterOld.getTime() - nowSpanOlds.getTime();

        // New
        LocalDateTime nowSpanNew = LocalDateTime.now();
        LocalDateTime hourLaterNew = LocalDateTime.now().plusHours(1);
        Duration spanNew = Duration.between(nowSpanNew, hourLaterNew);
        /**/

        /** /
        //Number of days in a month ------------------------------------------
        // Old
        Calendar calendarOld = new GregorianCalendar(1990, Calendar.FEBRUARY, 20);
        int daysInMonthOld = calendarOld.getActualMaximum(Calendar.DAY_OF_MONTH);

        // New
        int daysInMonthNew = YearMonth.of(1990, Month.FEBRUARY).lengthOfMonth();
         /**/

        /** /
        //Adding Temporal amount (Duration, Period) to a LocalDateTime---------
        LocalDateTime addedLdt = LocalDateTime.now().plusDays(2).plusHours(1).plusMinutes(10).plusSeconds(10);
        System.out.println(addedLdt);
         /**/
    }
}
