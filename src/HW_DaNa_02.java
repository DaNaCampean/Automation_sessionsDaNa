import java.util.Scanner;

public class HW_DaNa_02 {

    public static void main (String[] args) {

       /*multiplicationTable(); //EXERCISE 1 - Multiplication Table
       evenOrOdd(); // EXERCISE 2 - Odd or even
       factorial(); //EXERCISE 3 - Factorial
      */
        primeNumbers();

    }

 /* ASK user for a number. Convert it to int and return it from the method
   */
    public static int askUserInput(Scanner myScanner)
    {
        System.out.println("Please enter a number: ");
        int user_input = Integer.valueOf(myScanner.nextLine());
        System.out.println("My number is = " + user_input);
        return user_input;
    }



/* EXERCISE 1 - Multiplication Table
   Ask the user for a number (use Scanner).
   Print its multiplication table to 12 (ex: 5 * 1 = 5, 5 * 2 = 10 …. 5 * 12 = 60),
   one on each row
*/
    public static void multiplicationTable(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int user_input = Integer.valueOf(myScanner.nextLine());
        System.out.println("My number is = " + user_input);
        System.out.println("Multiplication Table for number " + user_input + " to 12 is: ");
        for (int i=1; i<=12; i++)
        {
            System.out.println(user_input + " * " + i + " = " + user_input*i);
        }
    }

    /* EXERCISE 2 - Even or Odd:
Keep asking the user for a number until they enter 0.
Check if the number is even or odd and print "Even" or "Odd".
*/
    public static void evenOrOdd(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number to see if it is EVEN or ODD. iF you want to exit, enter 0");
        int user_input;
        while ((user_input = Integer.valueOf(myScanner.nextLine())) !=0)
        {
            if (user_input % 2 ==0)
            {
                System.out.println("My number is = " + user_input + " - This is an EVEN Number");
            }
            else
            {
                System.out.println("My number is = " + user_input + " - This is an ODD Number");
            }
        }

        System.out.println("You entered zero. Thank you, bye bye");

    }

    /* EXERCISE 3 - Factorial:
Ask the user for a non-negative number (use Scanner).
Calculate the factorial
Print the calculated factorial.
     */

    public static void factorial()
    {   Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a positive number = ");
        int readNumber = askUserInput(myScanner);
        if (readNumber <= 0)
            System.out.println("you entered a negative number or 0");
        else
        {
            //4! = 4*3*2*1 = 24, 6! = 6*5*4*3*2*1,
            int factorial = 1;
            for (int i=readNumber; i>=1; i--)
            {
                factorial = factorial*i;
            }

            System.out.println("The factorial " + readNumber + "!" + "=" + factorial);

        }

    }

/* EXERCISE 4 - Prime Number Checker:
 Ask the user for a number (use Scanner).
 Check if number is prime
 Print "Prime" or "Not Prime".
*/

    public static void primeNumbers()
    {
        Scanner myScanner = new Scanner(System.in);
        int readNumber = askUserInput(myScanner);
        boolean prim=true;
        if (readNumber == 1 || readNumber ==2)
            prim=true;
        else {
            for (int i = 2; i <= readNumber / 2; i++) {

                if (0 == readNumber % i) {

                    prim = false;

                    break;
                } else {
                    prim = true;


                }

            }
        }
            if (prim)
                System.out.println("The number read , " + readNumber + "is PRIME" );
            else
                System.out.println("The number read, " + readNumber + " is NOT prime");








    }

/* EXERCISE 5 - Fibonacci Sequence:
 Print the Fibonacci Sequence up to a number entered by the user
*/
    public static void fibonacci()
      {

      }


/* EXERCISE 6 - Sum of Digits:
 Ask the user for a positive number (use Scanner).
 Print the sum of all digits.
*/
    public static void sumOfDigits()
    {

    }
/*
 7. Reverse a Number
 Print the reversed number.
 */

    public static void reverseNumber()
    {

    }


}
