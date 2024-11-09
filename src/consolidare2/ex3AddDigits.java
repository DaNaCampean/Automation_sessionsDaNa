package consolidare2;

/*
3. Write a Java program:
- to read a string formed by digits
- check if the number is a positive number
- repeatedly add all its digits until the result has only one digit

2) Write a Java program to accept a positive number and repeatedly add all its digits until the result has only one digit.

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex3AddDigits {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a string formed by digits: ");
        String myString = scannerRead.readString(myScanner);

        System.out.println("My String is: "+ myString);

        int myNumber=0;
        try {
            myNumber = Integer.parseInt(myString);



        } catch (Exception e) {
            System.out.println("You did not used Integers in String");
        }


        if (myNumber>0)
        {
            System.out.println("The number is Positive");
            while (myString.length()>1)
            {
                int sum=0;
                for (int i=0;i<myString.length();i++) {
                    sum = sum + Integer.parseInt(String.valueOf(myString.charAt(i)));
                }
                myString=String.valueOf(sum);
                System.out.println("SUM = " + sum);
                System.out.println("new Number is: " + myString);
            }

        }
        else System.out.println("You entered a negative number");





        myScanner.close();
    }

}
