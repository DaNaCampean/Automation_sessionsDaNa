import java.sql.SQLOutput;
import java.util.Scanner;

public class HW_DaNa_02 {
//edited from Hexagon
    public static void main (String[] args) {

       /*multiplicationTable(); //EXERCISE 1 - Multiplication Table
       evenOrOdd(); // EXERCISE 2 - Odd or even
       factorial(); //EXERCISE 3 - Factorial
      */
       // primeNumbers();
        //fibonacci();
         sumOfDigits();

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
          Scanner myScanner = new Scanner(System.in);
          int userinput = askUserInput(myScanner);
          // Numerele Fibonacci sunt numere naturale care fac parte din următorul șir,
          // in care fiecare număr este egal cu suma celor două de dinainte:
          // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
          int fibonacciNR;
          if (userinput == 0)
              System.out.println(" Fibonacci string cannot be shown. Your number is zero!");
          else
          {   System.out.println("Fibonacci string, until your number is: ");
              int first=0; int second=1;

              do
                {
                  System.out.print(second + " ");
                  fibonacciNR = first +second;
                  first = second;
                  second = fibonacciNR;

                }while(second<=userinput);
          }

      }


/* EXERCISE 6 - Sum of Digits:
 Ask the user for a positive number (use Scanner).
 Print the sum of all digits.
*/
    public static void sumOfDigits()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
       // int user_input = Integer.valueOf(myScanner.nextLine());

        String numberString = myScanner.nextLine();
        int numberInt = Integer.valueOf(numberString);

        if (numberInt<=0)
            System.out.println("Your number is zero or Negative.");
        else
        {
            System.out.println("Your number is: " + numberString);
            char[] numberChar = numberString.toCharArray();
            int[] intarray = new int[numberString.length()];
            int numberSum=0;
            for (int i = 0; i < numberString.length(); i++) {
                System.out.println("char = " + numberChar[i]);
                intarray[i] = numberChar[i];
               numberSum = numberSum + intarray[i];
                System.out.println("Sum of digits for " + numberString + " is: " + numberSum);
            }
            System.out.println("The sum of all digits is: " + numberSum);

        }



        /*
        void intToArray(int num){
        if( num != 0){
            int temp = num %10;
            num /= 10;
            intToArray(num);
            al.add(temp);
        }*/
    }



/*
 7. Reverse a Number
 Print the reversed number.
 */

    public static void reverseNumber()
    {

    }


}
