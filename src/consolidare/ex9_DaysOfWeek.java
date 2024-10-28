package consolidare;

import java.util.HashMap;
import java.util.Scanner;

// 9 Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]

public class ex9_DaysOfWeek {
    public static void main (String args[]){



        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        HashMap<Integer,String> monthsHash = new HashMap<>();
        monthsHash.put(1, "Monday");
        monthsHash.put(2, "Tuesday");
        monthsHash.put(3, "Wednesday");


        System.out.println("MyHash = " + monthsHash);

        System.out.println("Please enter the number");
        int myYear = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("The choosed day is: " + monthsHash.get(myYear));

    }

}
/*
6 The variables have to be defined, but in this challenge they will be defined for you. All you have to do is check the variables, do some string to integer
conversions, use some if conditions, and apply the arithmetic operation.

7 Write a program called CheckOddEven which prints "Odd Number" if the int variable "number" is odd, or "Even Number" otherwise. The program shall always print "bye!" before exiting.

        8 Write a program which does the following:
Let's think of a real-life example where we need to find out if a person is old enough to vote.
Find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18.
Declare the variables age and voting_age - and initialize them to the values 25 and 18 - i.e. the age and the voting age respectively.
Compare age and voting_age using the syntax given above and output the following
"Old enough to vote!" if age is greater than or equal to voting_age
"Not old enough to vote." if age is lesser than voting_age

9 Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]

        10 Write a program to find out the type of website from the URL:
        .com – commercial website
.org – organization website
.in – Indian website


*/