import java.util.Scanner;

public class HW_DaNa_02 {

    public static void main (String[] args) {

       // multiplicationTable(); //EXERCISE 1 - Multiplication Table
          evenOrOdd();
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


}
