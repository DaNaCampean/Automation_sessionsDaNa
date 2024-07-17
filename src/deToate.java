public class deToate {


 //   import java.util.Scanner;
/*
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        int i = 5;
        while (i < 10) {
            System.out.println("while i = " + i);
            i++;
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number, 0 to quit");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 0) {
                break;
            }

            System.out.println("You input " + command);
        }

        System.out.println("Done, thank you!");


      //  Scanner scanner1 = new Scanner(System.in);

        //while (true) {
          //  System.out.println("Insert positive integers");
            //int number = Integer.valueOf(scanner1.nextLine());

           // if (number <= 0) {
            //    System.out.println("Unfit number! Try again.");
             //   continue;
           // }

           // System.out.println("Your input was " + number);
        //}


        int iii=1;
        do{
            System.out.println("do w"+iii);
            iii++;
        }while(iii<=10);
    }

/*
        while (true) {
            System.out.println("Input positive numbers.");
            int number = Integer.valueOf(scanner1.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }

            System.out.println("Your input was " + number);
        }*/


}
/*
Automation testing in Java

Student’s book

Cuprins Part 0 .................................................................................................................................................1 Part 1 .................................................................................................................................................2 Part 2 .................................................................................................................................................3

Learning Java – other resources: · https://codegym.cc/java-coding-practice#commands-exercises - basic exercises (includes IDE and Unit tests) · https://codingbat.com/java - basic exercises (includes basic IDE/compiler) · https://learnxinyminutes.com/docs/java/ - Java cheat sheet · https://www.learneroo.com/modules/11/nodes/269 - java course · https://www.youtube.com/watch?v=TBWX97e1E9g&list=PLE7E8B7F4856C9B19&index=1 · https://www.youtube.com/watch?v=grEKMHGYyns · https://www.w3schools.com/java/default.asp

Part 0

IDE setup - IntelliJ - Varianta 1 (curs Alex Prodan) - Varianta 2 (Udemy – chapters: Getting Started, Programming Tools Setup, IntelliJ Basics (primele 7 video-uri)

        GitHub account, installing on Windows and basic GIT commands - https://cognizant.udemy.com/course/basic-git-and-github/ - Basic concepts

Requirements:

        - install IntelliJ Community Edition

- configure it to work with Java

- create a GitHub account

- install GIT and enable it to work with IntelliJ

- create your own project in GitHub – this will be the place where you’ll be committing your code and where other colleagues will review your code

- you need to ask and provide code reviews to your colleagues

Part 1

Where to learn? · Varianta 1 ( part 1 and 2) · Varianta 2 (curs Alex Prodan) · Varianta 3 (Udemy – chapters: Getting Started, Programming Tools Setup, First Steps, IntelliJ Basics, Expressions, Statements & More (primele 4 video-uri)

Requirements:

        - Console output

- variables

- parentheses/parameters - very basic ( () )

        - blocks of code ( {} )

        - basic data types (

        Primitives: Integer (int); Float (double); Character (char); Boolean;

Non-primitives: String

- operators (arithmetic +, -, *, /, %, shorthand +=, -=, ++, ii) (comparative >, <, ==, >=, <=, !=) (logical &&, ||, !) - how these apply to numbers vs how they apply to strings

- conditionals (if, else if, else)

- Math class.

        - reading user input ( Scanner(System.in); scanner.nextLine() ) - this is not very useful in the context of automation testing, but good to know for the purpose of this course;

Exercises:

        1. Is it even or odd? Ask the user for an integer and print whether it's even or odd.

        2. Positive, Negative, or Zero? Ask the user for a number and print if it's positive, negative, or zero.

        3. Leap Year Check (Easy-Medium): Prompt the user for a year. Check if it's a leap year (divisible by 4 and not by 100, or divisible by 400).

        4. Area of a Triangle (Easy-Medium): Ask the user for base and height, calculate and print the area (0.5 * base * height).

        5. Distance Converter (Easy): Ask the user for distance in kilometers. Convert it to miles (1 mile = 1.609 kilometers) and print the result.

        6. Temperature Converter (Easy-Medium): Ask the user for temperature in Celsius. Offer a choice to convert to Fahrenheit (F = (C * 9/5) + 32) or Kelvin (K = C + 273.15).

        7. Simple Commission Calculator (Medium): Ask for the sales amount and commission rate. Calculate and print the commission earned (commission rate * sales amount).

        8. Gross Pay Calculator (Medium): Ask for hours worked and hourly rate. Check for overtime (over 40 hours). Calculate regular pay (hours * rate) and overtime pay (1.5 * rate for overtime hours). Print the total gross pay (regular pay + overtime pay).

        9. Simple Mad Libs (Medium): Ask the user for various words (noun, verb, adjective, etc.) and insert them into a pre-written story template.

10. Simple Quiz (Medium): Prepare a few multiple-choice questions with answers (stored in variables). Ask the user for answers and keep track of the score. Print the final score.

11. Simple Unit Converter (Medium): Ask for a value and a unit (e.g., cm, inches, kg, lbs). Offer options to convert to another unit and print the result.

12. Discount Calculator (Medium): Ask for the original price and discount percentage. Calculate the discounted price (original price * (1 - discount/100)) and print the result.

Part 2

Where to learn? Varianta 1 ( part 2) Varianta 2 (curs Alex Prodan) Varianta 3 (Udemy – chapters: Control Flow ( pana la video-ul “While Loop and Do While Recap” inclusiv)

Requirements:

        - loops (for, while, do..while, break)

Exercises:

        1. Multiplication Table

· Ask the user for a number (use Scanner).

        · Print its multiplication table to 12 (ex: 5 * 1 = 5, 5 * 2 = 10 …. 5 * 12 = 60), one on each row

2. Even or Odd:

        · Keep asking the user for a number until they enter 0.

        · Check if the number is even or odd and print "Even" or "Odd".

        3. Factorial:

        · Ask the user for a non-negative number (use Scanner).

        · Calculate the factorial

· Print the calculated factorial.

        4. Prime Number Checker:

        · Ask the user for a number (use Scanner).

        · Check if number is prime

· Print "Prime" or "Not Prime".

        5. Fibonacci Sequence:

        · Print the Fibonacci Sequence up to a number entered by the user

6. Sum of Digits:

        · Ask the user for a positive number (use Scanner).

        · Print the sum of all digits.

        7. Reverse a Number

· Print the reversed number.

        import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf(" SIMPLE BANKING SYSYEM");
        double x = 28;
        double y = 4;

        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));
        int bankAccount = 700;
        int balance = 700;
        int savings = 700;

        String operatiuni;
        String option1 = "1. Check the Balance";
        String option2 = "2. Deposit money";
        String option3 = "3. Withdraw money if the amount to be withdrawn does not exceed the current" +
                "balance.";
        String option4 = "4. Transfer money to a savings account if the amount does not exceed the current\n" +
                "balance.\n";

        System.out.print("Please choose an option from 1 to 5\n");
        System.out.println (option1 + "\n" + option2 + "\n" + option3 + "\n" + option4 + "\n");
        Scanner myScanner = new Scanner(System.in);
        int user_input = Integer.parseInt(myScanner.nextLine());
        System.out.println("You choosed " + user_input);

        if (user_input >=1 & user_input <=4) {
            System.out.println("Your option was selected");
            if (user_input == 1)
            {  System.out.println(" Your balance is: " + balance); }
            else
            {
                if (user_input == 2)
                {
                    System.out.println(" What ammpount you want to deposit? ");
                    user_input = Integer.parseInt(myScanner.nextLine());
                    balance = balance + user_input;
                    System.out.println(" Deposit money succeeded. NEW Balance is:" + balance );
                }
                else
                {
                    if (user_input == 3)
                    {
                        System.out.println(" What amount you want to withdraw? ");
                        user_input = Integer.parseInt(myScanner.nextLine());
                        if ( user_input > balance)
                            System.out.println("You don't have enought money");
                        else {
                            balance = balance - user_input;
                            System.out.println(" Withdraw money succeeded. NEW Balance is:" + balance );

                        }

                    }
                    else
                    {
                        if (user_input == 4)
                        {
                            System.out.println(" What amount you want to move to savings? ");
                            user_input = Integer.parseInt(myScanner.nextLine());
                            if ( user_input > balance)
                                System.out.println("You don't have enought money");
                            else {
                                balance = balance - user_input;
                                savings = savings + user_input;
                                System.out.println(" yOUR OPERATION Succeeded.");
                                System.out.println(" NEW Balance is:" + balance);
                                System.out.println("New savings is: " + savings);


                            }

                        }

                    }
                }
                System.out.println("not 1");
            }
        }
        else
        {
            System.out.println("Your option is not valid");

        }

        //  int user_input = Integer.valueOf(myScanner.nextLine());



    }
}

*/
//-----------------
/*Requirements: - loops (for, while, do..while, break)

Exercises:
1. Multiplication Table
· Ask the user for a number (use Scanner).
· Print its multiplication table to 12 (ex: 5 * 1 = 5, 5 * 2 = 10 …. 5 * 12 = 60), one on each row

2. Even or Odd:
· Keep asking the user for a number until they enter 0.
· Check if the number is even or odd and print "Even" or "Odd".

3. Factorial:
· Ask the user for a non-negative number (use Scanner).
· Calculate the factorial
· Print the calculated factorial.

4. Prime Number Checker:
· Ask the user for a number (use Scanner).
· Check if number is prime
· Print "Prime" or "Not Prime".

5. Fibonacci Sequence:
· Print the Fibonacci Sequence up to a number entered by the user

6. Sum of Digits:
· Ask the user for a positive number (use Scanner).
· Print the sum of all digits.

7. Reverse a Number
· Print the reversed number.
*/

/*
import java.util.Scanner;

public class Session2_homework {
    public static void main(String[] args) {
        //2. Even or Odd:
        //Keep asking the user for a number until they enter 0.
        //Check if the number is even or odd and print "Even" or "Odd".

        System.out.println("Hello and welcome!");
        // for, while, do..while, break)

        for (int i=1; i<5;i++) {
            System.out.println("sunt in FOR");
        }

        Scanner scanner = new Scanner(System.in);

        int numbersRead = 0;
        int sum = 0;

        while (true) {
            if (numbersRead == 5) {
                break;
            }

            System.out.println("Input number");
            sum = sum + Integer.valueOf(scanner.nextLine());
            numbersRead = numbersRead + 1;
        }

        System.out.println("The sum of the numbers is " + sum);


        int iNumber;
        while(true){ //adica repet tot ce e in while, intre acolade, pana cand pun un break
            System.out.println("Enter a number = ");
            iNumber = scanner.nextInt();
            if (iNumber ==0) {
                System.out.println("You entered zero. Exiting the programm!!!");
                break;
            }
            else {
                if(( iNumber % 2)==0){
                    System.out.println("Cifra " + iNumber + " este o cifra para");
                }else {
                    System.out.println("Cifra " + iNumber + " este o cifra impara");
                }
            }



        }
    }
}
*/


