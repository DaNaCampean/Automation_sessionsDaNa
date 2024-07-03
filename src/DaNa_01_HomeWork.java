import java.util.Scanner;

public class DaNa_01_HomeWork {
    public static void main(String[] args)

    {


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int user_input = Integer.valueOf(myScanner.nextLine());
        System.out.println("My number is = " + user_input);
        System.out.println("Multiplication Table for number " + user_input + " to 12 is: ");
        for (
                int i = 1;
                i <= 12; i++) {
            System.out.println(user_input + " * " + i + " = " + user_input * i);
        }
    }
}