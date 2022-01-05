// DateTimeFormatter in Java
// This Program was created by Yatharth Chauhan

// This class helps us to print and parse date and time in our desired format.
// The format() method of the DateTimeFormatter class is used to format the
// dates using our desired format.

// Syntax :
// public String format(DateTimeFormatter formatter)

// Parameter :
// The object of the formatter to be used is passed, and it can not be null.

// Exception :
// This method throws DateTimeException.

// Return Value :
// Returns the string in the format specified by the user.

// Programs to illustrate some of the predefined formatters of the
// DateTimeFormatter class :

// 1. ISO_LOCAL_DATE :
// Formats the date according to the International Standard for the
// representation of dates.

// 2. ISO_WEEK_DATE :
// Returns the number of weeks and year.

// 3. ISO_ORDINAL_DATE :
// Returns the year and day of the year.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _69_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

    }
}
