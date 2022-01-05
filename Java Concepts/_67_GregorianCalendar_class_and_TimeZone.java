// GregorianCalendar class & TimeZone in java
// This Program was created by Yatharth Chauhan

// -> GregorianCalendar class is the concrete sub-class of the Calendar class.
// -> This class supports both the Julian and Gregorian calendar systems.

// Difference between Calendar and GregorianCalendar class :
// -> The calendar class is an abstract class. So, the instance of this class
// can
// not be instantiated. Therefore, we need to use the static method
// Calendar.getInstance() to initialize the object of the Calendar class :

// Calendar c = Calendar.getInstance();

// Since the GregorianCalendar class is a concrete subclass, it can be
// initialized as :
// GregorianCalendar gcal = new GregorianCalendar();

// Constructors of the GregorianCalendar class :

// 1. GregorianCalendar(): This constructor is used to initialize an object with
// the current time in the default time zone.

// 2. GregorianCalendar(int year, int month, int day): This constructor is used
// to initialize an object with the date-set specified as parameters in the
// default time zone and default locale.

// 3. GregorianCalendar(int year, int month, int day, int hours, int minutes):
// This constructor initializes an object with the given date and time set in
// the default locale and time zone.

// 4. GregorianCalendar(int year, int month, int day, int hours, int minutes,
// int seconds): This constructor initializes an object with the more specific
// time and date-set passed as a parameter in the default locale and time zone.

// 5. GregorianCalendar(Locale locale): Initializes a GregorianCalendar object
// with the current date and time in the default time zone and the specified
// locale.

// 6. GregorianCalendar(TimeZone timeZone): Initializes a GregorianCalendar
// object with the current date and time in the default locale and the specified
// time zone.

// 7. GregorianCalendar(TimeZone timeZone, Locale locale): Initializes an object
// with the locale and timezone passed as parameters.

// Methods of the Gregorian class :

// 1. isLeapYear(int year) :
// -> Checks if the year passed as a parameter is a leap year or not.
// -> This method returns a boolean value.

// 2. roll(int field, boolean up) :
// -> This method adds/subtracts a single unit of time from the specified time
// field.
// -> true = rolls up the value by 1.
// -> false = rolls down the value by 1.

// 3. hashcode():
// -> This method returns the hashcode of the calendar object.

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class _67_GregorianCalendar_class_and_TimeZone {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}