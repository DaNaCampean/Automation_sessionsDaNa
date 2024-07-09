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

import static java.lang.System.out;

public class DaNa_03_HomeWork {
   public static int global_counter=0;
   public static int digit = 0;
   public static int max_nr = 0;


    public static void main(String[] args)
    {
         exercise1(); // Write a Java function named greet that takes a single parameter: language and prints "Hello, World!" to the console translated in the specified language. Choose the languages as you please. If no language is selected, English will be used by default. If the language is not recognized, print “Sorry, I don't speak that language.”.
        // exercise2(); //Write a Java program that uses a global variable counter. Create a function named incrementCounter that increments counter by 1 each time it is called.
        // exercise3(); //Write a Java function that takes an integer as its parameter and returns the greatest number that can be formed by moving the first digit to the last position.
     // exercise4(); // Write a function named sumOfDigits that takes an integer parameter n and returns the sum of its digits.
     // exercise5(); // Write a function extractNumber that takes a String as a parameter and returns the first number found in the string. If no number is found, return null.
      //exercise6(); // Write a function normalizeSpace that takes a String as a parameter and returns a new string with all leading and trailing spaces removed.
        //exercise7(); // Guessing game from the randomize


    }
    public static void exercise1()
    {
        //Write a Java function named greet that takes a single parameter: language and prints "Hello, World!" to the console translated in the specified language.
        // Choose the languages as you please. If no language is selected, English will be used by default.
        // If the language is not recognized, print “Sorry, I don't speak that language.”.

        out.println("Please choose a language for translation\n Your options are:\n RU, RO");
        String user_input = read_user_inputScanner();
        greet(user_input);
    }
    public static void greet(String language)
    {   final String russian = "RU";
        switch (language.toUpperCase()) {
            case russian:
                System.out.println("Привет, мир! - RU translated");
                break;
            case "RO":
                out.println("Salut Lume! - RO translated");
                break;
            default: {
                if (language.isEmpty())
                    out.println("Hello World! - EN translated. This is the default language");
                else
                    out.println("Sorry, I don't speak that language.");
            }
        }


    }
    public static void exercise6()
    {
        out.println("EXERCISE 6: Write a function normalizeSpace that takes a String as a parameter " +
                "and returns a new string with all leading and trailing spaces removed.\n");
        String dana = read_user_inputScanner();


        out.println("char = " + dana.charAt(0));
        String newd="";


for (int j=0;j<dana.length();j++)
{
        for(int i=1;i<dana.length();i++)
        {
            newd = newd.concat(String.valueOf(dana.charAt(i)));
            out.println("newd = " + newd);


        }

        newd = newd.concat(String.valueOf(dana.charAt(0)));
        out.println("FINAL = " + newd);

        int mmax = Integer.valueOf(newd);
        if (max_nr<mmax)
            max_nr = mmax;
    out.println("newd dupa for = " +newd);
    dana = newd;
    newd = "";

    }
        out.println("cel mai mare ne = " + max_nr);
    }
    public static void exercise5()
    {
        out.println("EXERCISE 3: Write a function extractNumber that takes a String as a parameter and returns the first number found in the string. If no number is found, return null.\n");

    }

    public static void exercise4()
    {
        out.println("EXERCISE 4. Write a function named sumOfDigits that takes an integer parameter n and returns the sum of its digits.\n");

    }

    public static void exercise3()
    {
        out.println("EXERCISE 3: Write a Java function that takes an integer as its parameter and returns the greatest number that can be formed by moving the first digit to the last position.\n" );
        //Write a Java function that takes an integer as its parameter
        // and returns the greatest number that can be formed by moving the first digit to the last position.
        out.println("Please enter a number to receive the greatest number based on specifications above: ");

        //String greatest_number = String.valueOf(greatest_number(read_user_inputString()));
        String myScanner = read_user_inputScanner();
        String greatest_number_string = String.valueOf(myScanner);
        int greatest_number_int = Integer.valueOf(greatest_number_string);
        int length_number = greatest_number_string.length();
        out.println("User input length = "+ length_number);
        int first_number=0;
        for (int i=1;i<length_number;i++)
        {
            //int last_number = greatest_number_int % 10;
            //System.out.println("LAST NR = " + last_number);
            first_number = greatest_number_int / 10;
            digit = first_number *100;
            out.println("first NR = " + first_number);
            greatest_number_int = first_number;
            out.println( "gr NR = " + greatest_number_int);
            digit = greatest_number_int * 10 + digit;
            out.println("MUTARE = " + digit);

        }
        out.println("First number is " + first_number);
        out.println("FIRTS SI LAST = " + greatest_number_int % 100 + "and " + greatest_number_int/100);

    }

    public static String greatest_number(String param)
    {
        out.println("Initial NUmber is " + param);
        return param;
    }

    public static void exercise2()
    {
        out.println("How many times you want to call incrementCounter?");
        int user_input = read_user_input();
        for (int i=1;i<=user_input;i++)
            incrementCounter();
        out.println("You called incrementCounter function "+ user_input + " times");
        out.println("the global variable global_counter is " + global_counter);
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
