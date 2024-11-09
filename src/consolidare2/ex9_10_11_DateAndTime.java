package consolidare2;
/*
Java : DateTime - Exercises
9. Write a Java program to calculate the difference between two dates in days
10. Write a Java program to compute the difference between two datetime (Hours, Minutes, Milliseconds, Seconds and Nanoseconds)
11. Write a Java program to convert a string to date
*/
/*
Java Dates
Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:

Class	Description
LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class ex9_10_11_DateAndTime {
    public static void main(String[] args){

        //Display Current Date
        LocalDate myLocalDate = LocalDate.now(); // Create a date object
        System.out.println(myLocalDate); // Display the current date

        //Display Current Time
        LocalTime myLocalTime = LocalTime.now();
        System.out.println(myLocalTime);

        //Display current Date and time
        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println(myLocalDateTime);

        //9. Write a Java program to calculate the difference between two dates in days

        String date1 = "November 9, 2024";
        String date2 = "November 3, 2024";

        // 10. Write a Java program to compute the difference between two datetime (Hours, Minutes, Milliseconds, Seconds and Nanoseconds)


        //11. Write a Java program to convert a string to date
        String dateToConvert = "November 9, 2024";


    }

}
