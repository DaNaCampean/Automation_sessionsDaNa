package consolidare2;

import java.sql.Array;
import java.util.StringTokenizer;

/*
Java : String - Exercises
8. Write a program to separate all tokens (words) using StringTokenizer

 */
public class ex8StringTokenizer {

        /* StringTokenizer:
Java String Tokenization
The StringTokenizer class allows an application to break a string into tokens based on delimiters.
It implements the Enumeration interface. To use StringTokenizer, we need to specify an input string and a set of delimiters.
A delimiter is a character or set of characters that separate tokens in the string.

Note: StringTokenizer is a legacy class, and the split() method is preferred for modern applications.

StringTokenizer(String str) - Default delimiters like newline, space, tab, carriage return, and form feed.
StringTokenizer(String str, String delim) - delim is a set of delimiters that are used to tokenize the given string.
StringTokenizer(String str, String delim, boolean flag) - The first two parameters have the same meaning wherein The flag serves the following purpose.

1. If the flag is false, delimiter characters serve to separate tokens
Example:
Input : if string --> "hello geeks" and Delimiter is " ", then
Output:  tokens are "hello" and "geeks".

2. If the flag is true, delimiter characters are considered to be tokens.
Example:
Input : String --> is "hello geeks"and Delimiter is " ", then
Output: Tokens --> "hello", " " and "geeks".

3. Multiple delimiters can be chosen for a single string.
Example:
Syntax: StringTokenizer st1 = new StringTokenizer( "2+3-1*8/4", "+*-/");
Input : String --> is "2+3-1*8/4" and Delimiters are +,*,-,/
Output: Tokens --> "2","3","1","8","4".

Methods Of StringTokenizer Class
countTokens()	Returns the total number of tokens present
hasMoreTokens()	Tests if tokens are present for the StringTokenizer’s string
nextElement()	Returns an Object rather than String
hasMoreElements()	Returns the same value as hasMoreToken
nextToken()	Returns the next token from the given StringTokenizer.
         */
        public static void main (String[] args){

            String myString = "Aloha. Today 1 is a beautiful2 day!";
            System.out.print("\nOroginal String is = "+myString);

            StringTokenizer newString =new StringTokenizer(myString);
            int count = newString.countTokens();
            System.out.println("\nCount =" + count);

            System.out.print("\nStringTokenizer(String str) = ");
            while (newString.hasMoreTokens())
                System.out.println(newString.nextToken());
            System.out.println("\nHow Many Tokens = "+newString.countTokens());
            count = newString.countTokens();
            System.out.println("\nCount =" + count);

            newString =new StringTokenizer(myString,"12");
            count = newString.countTokens();
            System.out.println("\nCount =" + count);
            System.out.println("\nStringTokenizer(String str, [0-9])) = " );
            while (newString.hasMoreTokens())
                System.out.println(newString.nextToken());
            System.out.println("\nHow Many Tokens = "+newString.countTokens());


            //IMPARTE IN tiokens pana la fiecare litera din DAY.
            newString =new StringTokenizer(myString,"day", true);
            count = newString.countTokens();
            System.out.println("\nCount =" + count);
            System.out.println("\nStringTokenizer(String str, day, true) = " );
            while (newString.hasMoreTokens())
                System.out.println(newString.nextToken());
            System.out.println("\nHow Many Tokens = "+newString.countTokens());

            newString =new StringTokenizer(myString,"day", false);
            count = newString.countTokens();
            System.out.println("\nCount =" + count);
            System.out.println("\nStringTokenizer(String str, day, false) = " );
            while (newString.hasMoreTokens())
                System.out.println(newString.nextToken());


            // split() splits a string into an array of substrings, and returns the array:
            myString = "Aloha. Today 1 is a beautiful2 day!";
            System.out.println("Oroginal String is = "+myString);

            String[] danaStr = myString.split(" ");
            System.out.println("SPLIT METHODE (spaces)= ");
            for (String s:danaStr)
                System.out.println(s);


            danaStr = myString.split("[0-9]");
            System.out.println("SPLIT METHODE (digits)= ");
            for (String s:danaStr)
                System.out.println(s);



            danaStr = myString.split("day");
            System.out.println("SPLIT METHODE (day)= ");
            for (String s:danaStr)
                System.out.println(s);



        }
}
