/*
Exercises:
1. Write a Java function named greet that takes a single parameter: language and prints "Hello, World!" to the console translated in the specified language. Choose the languages as you please. If no language is selected, English will be used by default. If the language is not recognized, print “Sorry, I don't speak that language.”.
2. Write a Java program that uses a global variable counter. Create a function named incrementCounter that increments counter by 1 each time it is called.
3. Write a Java function that takes an integer as its parameter and returns the greatest number that can be formed by moving the first digit to the last position.
4. Write a function named sumOfDigits that takes an integer parameter n and returns the sum of its digits.
5. Write a function extractNumber that takes a String as a parameter and returns the first number found in the string. If no number is found, return null.
6. Write a function normalizeSpace that takes a String as a parameter and returns a new string with all leading and trailing spaces removed.
7. Guessing game from the randomize
 */


import java.util.Scanner;

public class DaNa_03_HomeWork {
   public static int global_counter=0;
   public static int digit = 0;
   public static int max_nr = 0;


    public static void main(String[] args)
    {

     // exercise2(); //Write a Java program that uses a global variable counter. Create a function named incrementCounter that increments counter by 1 each time it is called.
        // exercise3(); //Write a Java function that takes an integer as its parameter and returns the greatest number that can be formed by moving the first digit to the last position.
     // exercise4(); // Write a function named sumOfDigits that takes an integer parameter n and returns the sum of its digits.
     // exercise5(); // Write a function extractNumber that takes a String as a parameter and returns the first number found in the string. If no number is found, return null.
      exercise6(); // Write a function normalizeSpace that takes a String as a parameter and returns a new string with all leading and trailing spaces removed.
        //exercise7(); // Guessing game from the randomize


    }
    public static void exercise6()
    {
        System.out.println("EXERCISE 6: Write a function normalizeSpace that takes a String as a parameter " +
                "and returns a new string with all leading and trailing spaces removed.\n");
        String dana = read_user_inputScanner();


        System.out.println("char = " + dana.charAt(0));
        String newd="";


for (int j=0;j<dana.length();j++)
{
        for(int i=1;i<dana.length();i++)
        {
            newd = newd.concat(String.valueOf(dana.charAt(i)));
            System.out.println("newd = " + newd);


        }

        newd = newd.concat(String.valueOf(dana.charAt(0)));
        System.out.println("FINAL = " + newd);

        int mmax = Integer.valueOf(newd);
        if (max_nr<mmax)
            max_nr = mmax;
    System.out.println("newd dupa for = " +newd);
    dana = newd;
    newd = "";

    }
        System.out.println("cel mai mare ne = " + max_nr);
    }
    public static void exercise5()
    {
        System.out.println("EXERCISE 3: Write a function extractNumber that takes a String as a parameter and returns the first number found in the string. If no number is found, return null.\n");

    }

    public static void exercise4()
    {
        System.out.println("EXERCISE 4. Write a function named sumOfDigits that takes an integer parameter n and returns the sum of its digits.\n");

    }

    public static void exercise3()
    {
        System.out.println("EXERCISE 3: Write a Java function that takes an integer as its parameter and returns the greatest number that can be formed by moving the first digit to the last position.\n" );
        //Write a Java function that takes an integer as its parameter
        // and returns the greatest number that can be formed by moving the first digit to the last position.
        System.out.println("Please enter a number to receive the greatest number based on specifications above: ");

        //String greatest_number = String.valueOf(greatest_number(read_user_inputString()));
        String myScanner = read_user_inputScanner();
        String greatest_number_string = String.valueOf(myScanner);
        int greatest_number_int = Integer.valueOf(greatest_number_string);
        int length_number = greatest_number_string.length();
        System.out.println("User input length = "+ length_number);
        int first_number=0;
        for (int i=1;i<length_number;i++)
        {
            //int last_number = greatest_number_int % 10;
            //System.out.println("LAST NR = " + last_number);
            first_number = greatest_number_int / 10;
            digit = first_number *100;
            System.out.println("first NR = " + first_number);
            greatest_number_int = first_number;
            System.out.println( "gr NR = " + greatest_number_int);
            digit = greatest_number_int * 10 + digit;
            System.out.println("MUTARE = " + digit);

        }
        System.out.println("First number is " + first_number);
        System.out.println("FIRTS SI LAST = " + greatest_number_int % 100 + "and " + greatest_number_int/100);

    }

    public static String greatest_number(String param)
    {
        System.out.println("Initial NUmber is " + param);
        return param;
    }

    public static void exercise2()
    {
        System.out.println("How many times you want to call incrementCounter?");
        int user_input = read_user_input();
        for (int i=1;i<=user_input;i++)
            incrementCounter();
        System.out.println("You called incrementCounter function "+ user_input + " times");
        System.out.println("the global variable global_counter is " + global_counter);
    }
    public static void incrementCounter()
    {
        // Write a Java program that uses a global variable counter.
        // Create a function named incrementCounter that increments counter by 1 each time it is called.
        global_counter = global_counter +1;

    }

    public static int read_user_input()
    {
        Scanner myScanner = new Scanner(System.in);
        return Integer.valueOf(myScanner.nextLine());

    }
    public static String read_user_inputScanner()
    {
        Scanner myScanner = new Scanner(System.in);
        return myScanner.nextLine();

    }

}
