// java.time API - Classes & Methods
// This Program was created by Yatharth Chauhan

// Date and time features in Java is primarily supported by two packages :

// java.util
// java.time

// The package java.time was added with the release of Java 8 with the aim of
// solving problems faced by Java developers while handling date and time with
// java.util package such as representing a date without time, etc.

// Classes of Java.time :

// 1. Clock class:
// -> This class provides access to the current instant, date and time zone
// using a
// time-zone.
// -> Clock class is an abstract class therefore it is not possible to create
// instance of the clock class.

// Some methods of the clock class :

// -> abstract ZoneId getZone() : This methods returns the time zone being used
// to
// create date and time objects.

// -> abstract Instant instant() : This methods returns the current instant of
// the
// clocks.

// 2. Duration class :
// -> This class is used to measure time in seconds and nano seconds.
// -> This class is immutable.

// Some Methods of the duration class :

// -> boolean isNegative() : This method is used to check if the duration is
// negative.

// -> isZero() : This method is used to check if the duration is zero. Returns
// boolean value.

// 3. LocalDate class :
// -> This class is useful for representing the dates in the year-month-day
// format.
// -> With the help of LocalDate class, dates can be represented without time.

// Some methods of the LocalDate class :

// -> compareTo() : This method compares the equality of the two dates. Returns
// boolean value.

// -> withYear(int Year) : This method returns a copy of the LocaleDate but alters
// the year with the value of year passed as argument.

// 4. LocalTime class :
// -> This class helps us to represent the time without the dates.
// -> Instances of LocalTime class are mutable.

// Some methods of the LocalTime class : 

// -> LocalTime plusHours(long hoursToAdd) : This method returns a copy of the
// LocalTime but with the specified number of hours added.

// -> LocalTime minusMinutes(long minutesToSubtract) : This method returns a copy
// of the LocalTime but with the specified number of minutes subtracted.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _68_java_time_API_Classes_and_Methods {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
