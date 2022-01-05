// The Date Class in Java
// This Program was created by Yatharth Chauhan

// Date Class In Java :

// Date class in java is available in java.util package.
// This class provides the instant in time with precision of millisecond.

// Constructors of the date class :
// 1. Date(): This constructor is used when we need an object of current date and time.
// 2. Date(long milliseconds): This constructor creates a date object from the number of milliseconds passed since January 1, 1970.

// Methods of date class :

// 1. compareTo() : 
// Checks for the equality of the two dates.
// Returns 0 if the dates are equal; else, returns 1.

// 2. getTime() : 
// This method returns the number of milliseconds passed since the midnight of January 1, 1970.

// 3. getYear() : Prints the current year.
//    getDate() : Prints the current date.

import java.util.Date;

public class _65_Date_class {
    public static void main(String[] args) {
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
