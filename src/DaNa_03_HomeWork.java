//test
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
    public static int global_counter;
    public static int digit = 0;
    public static int max_nr = 0;


    public static void main(String[] args)
    {
        // exercise1(); // Write a Java function named greet that takes a single parameter: language and prints "Hello, World!" to the console translated in the specified language. Choose the languages as you please. If no language is selected, English will be used by default. If the language is not recognized, print “Sorry, I don't speak that language.”.
        // exercise2(); //Write a Java program that uses a global variable counter. Create a function named incrementCounter that increments counter by 1 each time it is called.
        // exercise3(); //Write a Java function that takes an integer as its parameter and returns the greatest number that can be formed by moving the first digit to the last position.
        //exercise4(); // Write a function named sumOfDigits that takes an integer parameter n and returns the sum of its digits.
        exercise5(); // Write a function extractNumber that takes a String as a parameter and returns the first number found in the string. If no number is found, return null.
        // exercise6(); // Write a function normalizeSpace that takes a String as a parameter and returns a new string with all leading and trailing spaces removed.
        //exercise7(); // Guessing game from the randomize


    }

    public static int read_user_inputInt()
    {
        Scanner myScanner = new Scanner(System.in);
        return Integer.valueOf(myScanner.nextLine());

    }
    public static String read_user_inputString() {
        Scanner myScanner = new Scanner(System.in);
        return myScanner.nextLine();
    }

    public static void exercise1()
    {
        //Write a Java function named greet that takes a single parameter: language and prints "Hello, World!" to the console translated in the specified language.
        // Choose the languages as you please. If no language is selected, English will be used by default.
        // If the language is not recognized, print “Sorry, I don't speak that language.”.

        System.out.println("Please choose a language for translation\n Your options are:\n RU, RO");
        String user_input = read_user_inputString();
        greet(user_input);
    }
    public static void greet(String language)
    {
        switch (language.toUpperCase()) {
            case "RU":
                System.out.println("Привет, мир! - RU translated");
                break;
            case "RO":
                System.out.println("Salut Lume! - RO translated");
                break;
            default: {
                if (language.isEmpty())
                    System.out.println("Hello World! - EN translated. This is the default language");
                else
                    System.out.println("Sorry, I don't speak that language.");
            }
        }


    }

    public static void exercise2()
    {
        //exercise2(); //Write a Java program that uses a global variable counter.
        // Create a function named incrementCounter that increments counter by 1 each time it is called.

        System.out.println("How many times you want to call incrementCounter?");
        int user_input = read_user_inputInt();
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

    public static void exercise3()
    {
        //exercise 3: Write a Java function that takes an integer as its parameter and returns
        // the greatest number that can be formed by moving the first digit to the last position.

        System.out.println("EXERCISE 3: Write a Java function that takes an integer as its parameter and returns the greatest number that can be formed by moving the first digit to the last position.\n" );
        System.out.println("Please enter a number to receive the greatest number based on specifications above: ");

        //read the number from the console and call the function that form and return the max numbers.
        int max_number = greatest_number(read_user_inputString()); //we need to use as the parameter the string read from the console.
        System.out.println("MAX number formed is = " + max_number);

    }

    public static int greatest_number(String read_number)
    {
        //System.out.println("First Char = " + read_number.charAt(0));
        String new_string_number ="";

        for (int j = 0; j< read_number.length(); j++)    //I used j to make sure all the new numbers can be formed
        {
            for(int i = 1; i< read_number.length(); i++) // this for is used to create a new number from the current number, by matching the request
            {
                //QUESTION: Why cannot use without stringValue Of?????
                new_string_number = new_string_number.concat(String.valueOf(read_number.charAt(i)));
                // System.out.println("new string in for = "+ new_string_number);

            }

            new_string_number = new_string_number.concat(String.valueOf(read_number.charAt(0))); //append to the end the first digit from the original number
            System.out.println("Created number = " + new_string_number);

            //int mmax = Integer.valueOf(new_string_number); //QUESTION: Mi-a dat optiune de parseInt. de ce nu e ok value of?
            int max_formed_number = Integer.parseInt(new_string_number);
            if (max_nr<max_formed_number)
                max_nr = max_formed_number;
            read_number = new_string_number; // we changed the original read number to the previously number formed , to continue with the new numbers created by moveing the first digit to the end
            new_string_number = ""; // reset the variable used to form the number. Otherwise we will have the first formed number + new one

        }

        return max_nr;
    }




    public static void exercise4()
    {
        //EXERCISE 4. Write a function named sumOfDigits that takes an integer parameter n and returns the sum of its digits
        System.out.println("EXERCISE 4. Write a function named sumOfDigits that takes an integer parameter n and returns the sum of its digits.\n");
        System.out.println("Please enter a number to find out the sum of digits:\n");
        System.out.println("SUM of all digits for your number is:" +  sumOfDigits(read_user_inputInt()));

    }

    public static int sumOfDigits(int n)
    {
        System.out.println("Number param = " + n);
        int sum=0;
        System.out.println("modulo = " + n%10);
        System.out.println("/ = " + n/10);
        do {
            sum = sum + n%10;
            n = n/10;
        }while(n!=0);


        return sum;


    }

    public static void exercise5()
    {
        //EXERCISE 5: Write a function extractNumber that takes a String as a parameter and returns the first number found in the string.
        // If no number is found, return null.");
        System.out.println("EXERCISE 5: Write a function extractNumber that takes a String as a parameter and returns the first number found in the string. If no number is found, return null.\n");
        System.out.println("Please enter a string toi find the first number:");
        String user_input = read_user_inputString();
        Integer extractCall = extractNumber(user_input);
        if (extractCall ==null) {
            System.out.println("The string does not contain numbers");
        } else
            System.out.println("The First number is: "+ extractCall);
    }

    public static Integer extractNumber (String parameter)
    {
        int firstNumber= 0;
        boolean existNumber = false;
        System.out.println("The string is = " + parameter);
        int lungime = parameter.length();
        for (int i=0;i<lungime;i++)
        {

            if (Character.isDigit(parameter.charAt(i)))
            {

                //firstNumber = Character.getNumericValue(parameter.charAt(i));
                firstNumber = Integer.parseInt(String.valueOf(parameter.charAt(i)));
                existNumber = true;
                break;
            }
            else
            {

                continue;
            }

        }
        if (existNumber)
            return firstNumber;
        else {
            return null; //QUESTION???? cu int nu merge oare?

        }
    }

    public static void exercise6()
    {
        //EXERCISE 6: Write a function normalizeSpace that takes a String as a parameter
        //and returns a new string with all leading and trailing spaces removed.

        System.out.println("EXERCISE 6: Write a function normalizeSpace that takes a String as a parameter " +
                "and returns a new string with all leading and trailing spaces removed.\n");
        System.out.println("Please enter a string with spaces:");
        // System.out.println("TRIM - The string received, with all leading and trailing spaces removed is-\n" + normalizeSpace(read_user_inputString()));
        System.out.println("NO trim - The string received, with all leading and trailing spaces removed is\n-" + normalizeSpace2(read_user_inputString())+"-");
    }

    public static String normalizeSpace(String string_param)
    {
        return string_param.trim();
    }
    public static String normalizeSpace2(String string_param)
    {
        //remove leading spaces
        String leadingRemoved = removeSpaces(string_param,0,true);
        System.out.println("FIRST STRING="+leadingRemoved+"-");
        System.out.println("LUNGIME NEW="+leadingRemoved.length());
        // remove trailing spaces
        String trailingRemoved = removeSpaces(leadingRemoved,leadingRemoved.length()-1,false);
        // System.out.println("END INDEX = " + (string_param.length() - leadingRemoved.length()));
        System.out.println("SECOND STRING="+trailingRemoved+"-");



        // return newString;
        return trailingRemoved;
    }
    public static String removeSpaces(String removeSpacesString, int index, boolean front)
    {       String newString="";
        if(front==true)
        {
            int index_newString=index;
            for (int i=index;i<removeSpacesString.length();i++)
            {
                System.out.println("String length is "+removeSpacesString.length());
                if (Character.isWhitespace(removeSpacesString.charAt(i)))
                {
                    index_newString = i+1;
                    System.out.println("in while");
                }
                else
                {
                    break;
                }
            }
            //StringBuilder newString = new StringBuilder(removeSpacesString.length()-index_newString);

            System.out.println("NEW STRING L = "+(removeSpacesString.length()-index_newString));
            for (int i=index_newString;i<removeSpacesString.length();i++)
            {

                System.out.println("CHAR["+i+"] = "+ removeSpacesString.charAt(i));
                newString = newString.concat(String.valueOf(removeSpacesString.charAt(i)));
                System.out.println("NEWS pe tRUEEEEEEE =="+newString+"-");
            }
        }
        else
        {
            System.out.println("ENTER IN SECOND CU="+removeSpacesString+"-");
            int index_newString=index;

            for (int i=(removeSpacesString.length()-1);i>0;i--)
            {
                System.out.println("String length is "+removeSpacesString.length());
                if (Character.isWhitespace(removeSpacesString.charAt(i)))
                {
                    index_newString = i-1;
                    System.out.println("in while");
                }
                else
                {
                    break;
                }
            }
            //StringBuilder newString = new StringBuilder(removeSpacesString.length()-index_newString);


            for (int i=0;i<index_newString+1;i++)
            {

                System.out.println("CHAR["+i+"] = "+ removeSpacesString.charAt(i));
                newString = newString.concat(String.valueOf(removeSpacesString.charAt(i)));
                System.out.println("NEWS =="+newString+"-");
            }
        }

        return newString;
    }





}
