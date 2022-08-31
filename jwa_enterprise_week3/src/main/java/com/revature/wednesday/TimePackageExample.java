package com.revature.wednesday;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimePackageExample {
    /*
    Java 8 introduced new APIs for Date and Time to address
    the shortcomings of the older java.util.Date and java.util.Calendar.

    Issues:

    Thread safety – The Date and Calendar classes are not thread safe, leaving developers to
    deal with the headache of hard-to-debug concurrency issues and to write additional code to
    handle thread safety. On the contrary, the new Date and Time APIs introduced in Java 8 are immutable
    and thread safe, thus taking that concurrency headache away from developers.

    API design and ease of understanding – The Date and Calendar APIs are poorly designed with inadequate
    methods to perform day-to-day operations. The new Date/Time API is ISO-centric and follows consistent
    domain models for date, time, duration and periods. There are a wide variety of utility methods that
    support the most common operations.

    ZonedDate and Time – Developers had to write additional logic to handle time-zone logic with the old
    APIs, whereas with the new APIs, handling of time zone can be done with Local and ZonedDate/Time APIs.

     */


    /*
    Local Date
    The LocalDate represents a date in ISO format (yyyy-MM-dd) without time. We can use it to store dates
    like birthdays and paydays.

    We can use the system clock to instantiate it

     */

    public void instantiateLocalDate(){
        LocalDate localDate = LocalDate.now();

        // Or with a specific month, day, or year
        LocalDate date2 = LocalDate.of(2929, 9, 02);

        LocalDate date3 = LocalDate.parse("2929-09-02");

    }

    // Methods that provide us additional utility

    public void localDateUtility(){
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        // This example obtains the current date and subtracts one month.
        // Note how it accepts an enum as the time unit

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);

        // In the following two code examples, we parse the date “2016-06-12” and get the
        // day of the week and the day of the month respectively.
        // Note the return values — the first is an object representing the DayOfWeek,
        // while the second is an int representing the ordinal value of the month:

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();

        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();

        // We can test if a date occurs in a leap year, for example the current date:

        boolean leapYear = LocalDate.now().isLeapYear();


        // We can check the relation between dates

        boolean notBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));

        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));
    }

    /*
    The LocalTime represents time without a date.

    Similar to LocalDate, we can create an instance of LocalTime from the system clock or by using parse and of methods.

    We'll now take a quick look at some of the commonly used APIs.

    An instance of current LocalTime can be created from the system clock:
     */

    public void instantiateLocalTime(){
        LocalTime now = LocalTime.now();

        // We can also parse time
        LocalTime sixThirty = LocalTime.parse("06:30");

        // The factory method of can also be used to create a LocalTime.
        // This code creates LocalTime representing 6:30 a.m. using the factory method

        LocalTime sixThirtyFactory = LocalTime.of(6, 30);

    }

    // LocalTime utility

    public void localTimeUtilityMethods(){
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);

        int six = LocalTime.parse("06:30").getHour();

        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));

        // the below code represents 23:59:59.99
        LocalTime maxTime = LocalTime.MAX;
    }


    /*
    LocalDateTime is used to represent a combination of date and time. This is the most commonly used class
    when we need a combination of date and time.

    The class offers a variety of APIs. Here, we'll look at some of the most commonly used ones.

    An instance of LocalDateTime can be obtained from the system clock similar to LocalDate and LocalTime


     */

    public void instantiateLocalDateTime(){
        LocalDateTime.now();

        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);

        LocalDateTime.parse("2015-02-20T06:30:00");

    }

    // Local Date Time Utility

    public void localDateTimeUtilityMethods(){
        LocalDateTime localDateTime = LocalDateTime.now();

        localDateTime.plusDays(1);
        localDateTime.minusHours(2);
        localDateTime.getMonth();
    }
}
















