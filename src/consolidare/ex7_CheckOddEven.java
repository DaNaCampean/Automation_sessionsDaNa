package consolidare;

import java.util.Scanner;

public class ex7_CheckOddEven {
    public static void main(String args[]) {
        evenOrOdd();
    }


    /*

    7 Write a program called CheckOddEven which prints "Odd Number" if the int variable "number" is odd, or "Even Number" otherwise. The program shall always print "bye!" before exiting.
    */
    public static void evenOrOdd() {
        System.out.println("EVEN OR ODD");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number to see if it is EVEN or ODD. iF you want to exit, enter 0");
        int user_input;
        while ((user_input = Integer.valueOf(myScanner.nextLine())) != 0) {
            if (user_input % 2 == 0) {
                System.out.println("My number is = " + user_input + " - This is an EVEN Number");
            } else {
                System.out.println("My number is = " + user_input + " - This is an ODD Number");
            }
        }

        System.out.println("You entered zero. Thank you, bye bye");

    }
}
