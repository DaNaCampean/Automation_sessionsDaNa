package Session5_DaNa_and_solutii;

import java.util.Scanner;

public class solutia_05_isPalindrome {

    //Write a method isPalindrome(String str) that checks if a given string is a palindrome
    // (reads the same forwards and backwards).

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a String");
        String myString = myScanner.nextLine();
        System.out.println("Check if " + myString + " is palindrome: " + isPalindrome(myString));
        myScanner.close();
    }

    public static boolean isPalindrome(String str) {
        StringBuffer myStrBuffer = new StringBuffer(str);
        return str.equals(myStrBuffer.reverse().toString());
    }
}
