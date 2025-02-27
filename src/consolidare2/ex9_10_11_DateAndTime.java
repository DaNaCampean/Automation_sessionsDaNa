package consolidare2;
/*
Java : DateTime - Exercises
9. Write a Java program to calculate the difference between two dates in days
10. Write a Java program to compute the difference between two datetime (Hours, Minutes, Milliseconds, Seconds and Nanoseconds)
11. Write a Java program to convert a string to date
*/
/*
Java Dates
Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
The package includes many date and time classes. For example:

Class	Description
LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
*/

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class ex9_10_11_DateAndTime {
    public static void main(String[] args) throws ParseException {
// simpledate format info: https://www.digitalocean.com/community/tutorials/java-simpledateformat-java-date-format
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
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("TEMA = " + date);

        // Define the input string
        String dateString = "2023-10-05";

        // Define the date format that matches the input string
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Parse the string to create a Date object
            Date dateD = formatter.parse(dateString);
            System.out.println("Date converted from string: " + dateD);
        } catch (ParseException e) {
            // Handle the exception in case of an invalid format
            System.out.println("Error parsing date: " + e.getMessage());
        }



/*
        String dateInString = "Tue, 12 Nov 2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy", Locale.ENGLISH);
        LocalDate dateTime = LocalDate.parse(dateInString, formatter);
        System.out.println("DATE = " + dateTime);
/*
        System.out.println("TEST");
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("en", "US"));
        SimpleDateFormat simpleDateFormatuk = new SimpleDateFormat(pattern, new Locale("uk", "UK"));
        String date11 = simpleDateFormat.format(new Date());
        String date111 = simpleDateFormatuk.format(new Date());
        System.out.println("USA = " + date11);
        System.out.println("uk = " + date111);


       // LocalDate date = LocalDate.parse("2018-05-05");

        //A similar approach to the above can be used to convert a String to a java.time.LocalDateTime:

        LocalDateTime dateTime1 = LocalDateTime.parse("2018-05-05T11:50:55");
        System.out.println("DATE = " + dateTime1);
        DateTimeFormatter formatter1= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2015-05-05 10:15:30 Europe/Paris", formatter1);
        System.out.println("DATE = " + zonedDateTime);

//conversie la timezone.

    /*    //simpleDate format use that. ctrl+click pt documentatie..
        // calendar- e cel mai complex/ check diferente intre ele.
        //day offset stufff........
    read ovveride vs overload - read             about it


                aia din calculator overide e ca am acelasi nume, aia cu action stuff...nu e predefinit e numele ales de mine........
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        regex101.com vezi ce e cu groups...
        shift shift
        ctrl+ click
 */






        /*
       // By Using the Scanner Class
       // In Java, the Scanner class is a helpful resource for receiving user input. It may read data from files, the keyboard, or other input devices. You can do the following actions to accept a date that use the Scanner class:

        //Step 1: Create an instance of the Scanner class.

        Scanner sc = new Scanner(System.in);
        //Step 2: Prompt the user to enter a date.

                System.out.print("Enter a date (dd/mm/yyyy): ");
        //Step 3: Read the input using the next() method of the Scanner class.

        String dateStr = sc.next();
       // Step 4: Parse the input string into a Date object using the SimpleDateFormat class.

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dateStr);
        System.out.println("DATE = " + date);
      //  The dd/mm/yyyy format of a date will be accepted by the snippet of code above. A ParseException will be thrown by the code if the user has entered an invalid date. You can include the parser code inside a try-catch block to handle this exception.

      //          Using the LocalDate Class
      //  The Java 8 Date-Time API includes the LocalDate class. The symbol stands for a date without the need for a time zone.
        //  The steps below can be used to accept a date that use the LocalDate class:

      //  Step 1: Create an instance of the Scanner class.

        Scanner sc1 = new Scanner(System.in);
     //   Step 2: Prompt the user to enter a date.

                System.out.print("Enter a date (dd/mm/yyyy): ");
     //   Step 3: Read the input using the next() method of the Scanner class.

        String dateStr1 = sc1.next();
    //    Step 4: Parse the input string into a LocalDate object using the DateTimeFormatter class.

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate mydate2 = LocalDate.parse(dateStr1, formatter);
    //    The dd/mm/yyyy format of a date will be accepted by the snippet of code above.
        //    A DateTimeParseException will be thrown by the code if the user has entered an invalid date.
        //    You can include the parsing code inside a try-catch block to handle this exception.
        System.out.println("date2 = " + mydate2);

*/
    }

}
