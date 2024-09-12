package Session5_DaNa_and_solutii;

import java.util.Scanner;

public class solutia_01_ReverseString {
    //1. Write a method reverseString(String str) that takes a string and returns it reversed.

    public static void main(String[] args) {
        // Ask the user for the string to be reversed
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the string to find out the reverse of it: ");
        String myString = myScanner.nextLine();
        // call the function/ methode for reverse string and print the result
        System.out.println("Reverse string is: " + reverseString(myString));
        myScanner.close();
    }

    public static StringBuffer reverseString(String myString) {
        // we want to use StringBuffer, which is like String, but with more built-in methods
        // with it, the strings can be  manipulated more easily

        StringBuffer myStrBuffer = new StringBuffer(myString);
        System.out.println("Str Buff before = "+myStrBuffer);
        myStrBuffer.reverse();
        System.out.println("StrBuff after = "+ myStrBuffer);
        return myStrBuffer;
    }





}
