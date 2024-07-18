/*
Interactive Calculator
Write a Java method that simulates a calculator allowing the user to perform arithmetic
operations until the user decides to exit.

The method should accept a double parameter representing the initial sum.

The program will first ask for the operation and then repeatedly
ask for numbers until the user enters “=”, applying the chosen operation to each new number
entered.

● Create a method called performCalculation to execute basic arithmetic operations: (+,
-, *, /) between two numbers and to handle division by zero by displaying a warning
message.






● Implement an exit command that will allow the user to exit the program.

● Manage the current sum: display the current sum after each operation.
● Manage operations history: add a history command that will display the history of
operations performed
● Reset the current sum: add a reset command that will reset the current sum to its initial
value and will also reset the operations history

Dupa egal...da rezultatul si try again? shoose alt operator si numere

metoda principala care sa ia param o var double...suma initial

apelati calculation de 10.... apoi intrebati de operatie...el ne va da numere...
de la 10 plecati cu acele noi numere:
suma inin 10...adumi 5 + 7 la 10
istoric: 10+ 5+ 7



 */


import java.util.Scanner;

public class DaNa_03_LiveSession {

/*
    Interactive Calculator
    Write a Java method that simulates a calculator allowing the user to perform arithmetic
    operations until the user decides to exit.

    The method should accept a double parameter representing the initial sum.

    The program will first ask for the operation and then repeatedly
    ask for numbers until the user enters “=”, applying the chosen operation to each new number
    entered.

● Create a method called performCalculation to execute basic arithmetic operations: (+,
            -, *, /) between two numbers and to handle division by zero by displaying a warning
    message.
*/

public static void main(String[] args)
{
    System.out.println("Please enter starting sum:");
    Scanner myScanner = new Scanner(System.in);
    double sum = myScanner.nextDouble();
    performCalculation(sum);

}

public static void performCalculation(double sum)
{
    System.out.println("Please enter the operation you want:");

    String operation = read_user_inputString();

    System.out.println("Please enter numbers you want, until you enter = ");
    System.out.println("Enter number:");

    String  number = read_user_inputString();


    double final_opoeration = sum;
    String history = "";

    history = history.concat(Double.toString(sum));
    history = history.concat(operation);
    history = history.concat(number);
    System.out.println("history = " + history);



    while ( !number.equals("=")) {
        switch (operation) {
            case "+":
                System.out.println("The operation chosen is: +");
                double new_number =  Double.parseDouble(number);
               // System.out.println("NEW NUMBER = "+ new_number);
                //System.out.println("SUM = " + sum);
                //System.out.println("final op = "+ final_opoeration);
                final_opoeration = final_opoeration + new_number;


                //System.out.println("In case final = "+ final_opoeration);
                break;
            case "-":
                System.out.println("The operation chosen is: -");
                break;
            case "*":
                System.out.println("The operation chosen is: *");
                break;
            case "/":
                System.out.println("The operation chosen is: /");
                break;
            default: {
                System.out.println("Sorry default?");
            }
        }

        System.out.println("Please enter numbers you want, until you enter =");
        number = read_user_inputString();
        history = history.concat(operation);
        history = history.concat(number);
        System.out.println("history = " + history);
    }

    System.out.println(" THE FINAL STUFF = " + final_opoeration);
    System.out.println("History = " + history.concat(final_opoeration));



}

    public static int read_user_inputInt()
    {
        Scanner myScanner = new Scanner(System.in);
        return Integer.parseInt(myScanner.nextLine());

    }

    public static String read_user_inputString() {
        Scanner myScanner = new Scanner(System.in);
        return myScanner.nextLine();
    }


}
