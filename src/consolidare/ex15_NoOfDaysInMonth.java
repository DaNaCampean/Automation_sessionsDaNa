package consolidare;

import java.util.HashMap;
import java.util.Scanner;

public class ex15_NoOfDaysInMonth {

// 15 Write a Java program to find the number of days in a month

    public static void main (String args[]){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the month you want to find how many days it has. Please use 1 or 01 for January, or January, etc");
        HashMap<String,Integer> monthsHash = new HashMap<>();
        monthsHash.put("January", 31);
        monthsHash.put("February", 28);
        monthsHash.put("March", 31);
        monthsHash.put("April", 30);
        monthsHash.put("May", 31);
        monthsHash.put("June", 30);
        monthsHash.put("July", 31);
        monthsHash.put("August", 31);
        monthsHash.put("September", 30);
        monthsHash.put("October", 31);
        monthsHash.put("November", 30);
        monthsHash.put("December", 31);

        System.out.println("MyHash = " + monthsHash);

        System.out.println("Please enter the year");
        int myYear = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Please enter the month:");
        String myMonth = myScanner.nextLine();
        System.out.println(" year = " +  myYear + "- month = "+ myMonth + "- Days = "+ monthsHash.get(myMonth));

        myScanner.close();

    }
//3. Leap Year Check (Easy-Medium): Prompt the user for a year. Check if it's a leap year (divisible by 4 and not by 100, or divisible by 400).
// A leap year (also known as an intercalary year or bissextile year) is a calendar year that contains an additional day (or, in the case of a lunisolar calendar, a month) compared to a common year. The 366th day (or 13th month) is added to keep the calendar year synchronised with the astronomical year or seasonal year.

}