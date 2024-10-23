package consolidare;
//  1 Java program to check whether a string is a Palindrome


import java.util.Scanner;
public class ex1_StringIsPalindrome {


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

