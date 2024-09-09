import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;


public class DaNa_05_hw {
 /*   Part 5

    Where to learn? Varianta 1 ( part 3.4) Varianta 2 (curs Alex Prodan)
    Varianta 3 (Udemy &ndash; chapters - Primitive Types Recap and the String Data Type)
    Java Strings & Java String Methods String class & String builder Java Regular Expressions & Pattern class

    Requirements:

            - String operations

    Checkpoint exercise(s) to be solved during meeting:
  OK -   1. Write a method reverseString(String str) that takes a string and returns it reversed.


OK - 2. Write a method countVowels(String str) that counts the number of vowels (a, e, i, o, u) in a given string.

OK - 3. Write a method areAnagrams(String str1, String str2) that checks if two given strings are anagrams
(contain the same characters in a different order).


ok - 4. Write a method replaceCharacter(String str, char oldChar, char newChar) that replaces all occurrences of oldChar with newChar in the given string.


ok - 5. Write a method isPalindrome(String str) that checks if a given string is a palindrome (reads the same forwards and backwards).

ok -  6. Write a method charFrequency(String str, char c) that takes a string and a character
             as input and returns the number of times the character appears in the string.

ok - 7. Write a method isTermInList(List<String> list, String term) that checks if the list has an
            element containing the provided term.

ok - 8. Write a method areTermsInList(List<String> list, List<String> searchedTerms) that checks if the list has
elements containing the provided terms.

ok ???? 9. Write a method getFirstInteger(String text) that retrieves the first sequence of digits from a string.

ok  - 10. Write a method checkIfTextContainsTerms(String text, boolean ignoreCase, List<String> termsList)
            that checks if text contains all specified terms with an option to ignore case sensitivity.

ok ???? 11. Write a method insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance) that will
insert the given string in the specified text at every specified interval (distance).

 12. Write a method that checks if the given text contains any of the specified terms, with an option
            to ignore case sensitivity.

 13. Write a method that will return a specified number of random elements from a given list.

  */

public static void main(String[] args) {

// 1. Write a method reverseString(String str) that takes a string and returns it reversed.

  //  System.out.println("Char method - REVERSE STRING IS: " + reverseStringChar("DaNa"));
  //  System.out.println("StringBuilder Method - REVERSE STRING IS: " + reverseString("dana") );

// 2. Write a method countVowels(String str) that counts the number of vowels (a, e, i, o, u) in a given string.
   // String danaString = "danutzika";
   // System.out.println("Number of Vowels = " + countVowels(danaString));


  //  3. Write a method areAnagrams(String str1, String str2) that checks if two given strings are anagrams
    //  (contain the same characters in a different order).

  //  areAnagrams("danutzika", "danutziak");
   // areAnagramsVar2("danutzika", "danutziak");


   // 4. Write a method replaceCharacter(String str, char oldChar, char newChar)
    // that replaces all occurrences of oldChar with newChar in the given string.
      // replaceCharacter("Danutzika", 'n','N' );

 //   5. Write a method isPalindrome(String str) that checks if a given string is a palindrome (reads the same forwards and backwards).
    // isPalindrome("Lupul");



   // 6. Write a method charFrequency(String str, char c) that takes a string and a character
   // as input and returns the number of times the character appears in the string.
       // charFrequency("danutaazika", 'a');



   // 7. Write a method isTermInList(List<String> list, String term) that checks if the list has an
  //  element containing the provided term.
    //List<String> list = Arrays.asList("dana", "conan", "didi","conan", "dana");
   // isTermInList(list , "conan");

    //8. Write a method areTermsInList(List<String> list, List<String> searchedTerms) that checks if the list has
    // elements containing the provided terms.

   // List<String> list = Arrays.asList("dana", "conan", "didi","conan", "figaro", "dana");
    //List<String> terms = Arrays.asList("conan", "dana");
    //areTermsInList(list, terms);

    //????????????
    // 9. Write a method getFirstInteger(String text) that retrieves the first sequence of digits from a string.
       // String text = "dana 123 dana 0154 j";
     // String text = "dana123dana";
       // String firstInt = getFirstInteger(text);
       // System.out.println("F INT = " + Integer.parseInt(firstInt));
       // System.out.println("FFF int = " + firstInt);


    //10. Write a method checkIfTextContainsTerms(String text, boolean ignoreCase, List<String> termsList)
    // that checks if text contains all specified terms with an option to ignore case sensitivity.
   // String text = "Dana conan didI coNan dana";
   // boolean ignoreCase = false;
   // List<String> termsList = Arrays.asList("didi", "dana");
    //checkIfTextContainsTerms(text, ignoreCase,termsList);


    // ??????????????????    am creeat un nou string cu adaugiurile...
    // 11. Write a method insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance) that will
    // insert the given string in the specified text at every specified interval (distance).

    String text = "123123123 123 123";
    String stringToBeInserted = " HAHAHA ";
    int distance = 3;

    insertStringInTextRepeatedly(text, stringToBeInserted, distance);


    //12. Write a method that checks if the given text contains any of the specified terms, with an option
    // to ignore case sensitivity.
              //   checkTermInText (List<String> list, String term)


    //13. Write a method that will return a specified number of random elements from a given list.
            // randomNumberOfRandomElements (List<String> list, String term)
}

public static void areTermsInList(List<String> list, List<String> searchedTerms)
{
    //8. Write a method areTermsInList(List<String> list, List<String> searchedTerms) that checks if the list has
    // elements containing the provided terms.
   // List<String> list = Arrays.asList("dana", "conan", "didi","conan", "dana");
    //List<String> terms = Arrays.asList("didi","conan", "dana");

    System.out.println("LIST = " + list);
    System.out.println("SEARCHED Terms = " + searchedTerms);
    if (list.containsAll(searchedTerms))
        System.out.println("The List contains the Searched Terms: " + searchedTerms);
    else
        System.out.println("The List DOES NOT contain the Searched Terms: " + searchedTerms);


}

public static String getFirstInteger(String text)
    {
//9. Write a method getFirstInteger(String text) that retrieves the first sequence of digits from a string.
        //String text = "dana 123 dana";
        // String text = "dana123dana";

        String[] arrayStr = text.split(" ");
        System.out.println("ARRAY = ");
        String firstInteger="";
        for (String s: arrayStr)
        {
            System.out.println(s);
           /* if (s.matches("\\d+"))
                System.out.println(s + " is INT");
            else System.out.println(s + " NOT int");

            */

            if (s.matches("[0-9]\\d+")) {
                System.out.println(s + " is INT");
                firstInteger = s;

              break;
           }

        }
      //  System.out.println("FirstInterger = " + firstInteger);

          return firstInteger;



    }

public static void checkIfTextContainsTerms(String text, boolean ignoreCase, List<String> termsList) {
//10. Write a method checkIfTextContainsTerms(String text, boolean ignoreCase, List<String> termsList)
    // that checks if text contains all specified terms with an option to ignore case sensitivity.
      /*
        String text = "Dana conan didI coNan dana";
        boolean ignoreCase = true;
        List<String> termsList = Arrays.asList("didi", "dana"); */

    System.out.println("String = " + text);
    System.out.println("SEARCHED Terms = " + termsList);
    System.out.println("IgnoreCase = " + ignoreCase);
    boolean containsTerm = true;

    for (int i=0;i<termsList.size();i++)
        if (ignoreCase) {
            if (!text.toLowerCase().contains(termsList.get(i).toLowerCase()))
                containsTerm = false;
        }
        else {
            if (!text.contains(termsList.get(i)))
                containsTerm = false;
        }

    if (containsTerm)
            System.out.println("The String Text contains the Searched Terms: " + termsList);
    else
            System.out.println("The String Text DOES NOT contain the Searched Terms: " + termsList);

    }

public static void insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance)
    {
       //11. Write a method insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance) that will
        // insert the given string in the specified text at every specified interval (distance).

       // String text = "123123123 123 123";
       // String stringToBeInserted = " hahaha ";
       // int distance = 3;

        int iteration = 0;
        String finalStr = "";

        System.out.println("Text = " + text);

        for (int i=0;i<text.length();i++)
        {
            System.out.println("char = " + text.charAt(i));

            if (iteration == distance-1) {
                System.out.println("if");
                finalStr = finalStr.concat(String.valueOf(text.charAt(i)));
                finalStr = finalStr.concat(stringToBeInserted);
                System.out.println("final = " + finalStr);
                iteration = 0;

            }
            else
            {           iteration++;
                System.out.println("else");
                finalStr = finalStr.concat(String.valueOf(text.charAt(i)));         
            }






       }
        System.out.println("STRING FINAL = " + finalStr);

        
    }

public static void checkTermInText (List<String> list, String term)
    {
//12. Write a method that checks if the given text contains any of the specified terms, with an option
        // to ignore case sensitivity.

            //8. Write a method areTermsInList(List<String> list, List<String> searchedTerms) that checks if the list has
            // elements containing the provided terms.

           // List<String> list = Arrays.asList("dana", "conan", "didi","conan", "figaro", "dana");
            //List<String> terms = Arrays.asList("conan", "dana");
            //areTermsInList(list, terms);

        //10. Write a method checkIfTextContainsTerms(String text, boolean ignoreCase, List<String> termsList)
        // that checks if text contains all specified terms with an option to ignore case sensitivity.
       // String text = "Dana conan didI coNan dana";
        // boolean ignoreCase = false;
        // List<String> termsList = Arrays.asList("didi", "dana");
        //checkIfTextContainsTerms(text, ignoreCase,termsList);



    }

public static void randomNumberOfRandomElements (List<String> list, String term)
    {
        //13. Write a method that will return a specified number of random elements from a given list.
    }

public static void isTermInList(List<String> list, String term)
{

        if (list.contains(term))
            System.out.println("The list CONTAINS the element: \""+ term + "\"");
        else
            System.out.println("The element: \""+ term + "\" is NOT in the list");

}

public static void charFrequency(String str, char c)
{
    System.out.println("String = " + str);
    System.out.println("Char = "+ c);
    int numberOfApparence = 0;
    for (int i=0;i<str.length();i++)
        if (str.charAt(i) == c) {
           numberOfApparence = ++numberOfApparence;
        }
    System.out.println("The character \"" + c+ "\" appears " + numberOfApparence + " times in \"" + str + "\"" );


}
public static void isPalindrome(String str)
{
    StringBuilder myStrBuilder = new StringBuilder(str);
    StringBuilder revBuilder = new StringBuilder(str).reverse();
    System.out.println("mysTRbuILDER = " + myStrBuilder);
    System.out.println("Reverse Builder = "+ revBuilder);
    String reverseString = revBuilder.toString();

    if (str.equalsIgnoreCase(reverseString))
        System.out.println("IS PALINDROME (equals)");
    else
        System.out.println("NOT PALINDROME (equals)");

    if (str.compareToIgnoreCase(reverseString) == 0)
        System.out.println("IS PALINDROME (compareTo)");
    else
        System.out.println("NOT PALINDROME (compareTo)");

    




}
public static void replaceCharacter (String str, char oldChar, char newChar) {
    System.out.println("My string is: " + str + "OLD char = " + oldChar + " New Char = " + newChar);
    String afterReplace = str.replace(oldChar, newChar);
    System.out.println("New String is: " + afterReplace);
    System.out.println("New String is: " + str.replace('a', 'X'));
}

public static void areAnagramsVar2(String str1, String str2)
{
    // Convert strings to character arrays
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    // Sort the character arrays
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    System.out.println("STR1 ===");
    for (int i=0; i<str1.length(); i++)
        System.out.println(charArray1[i]);


    // Compare the sorted character arrays
    if (Arrays.equals(charArray1, charArray2))
        System.out.println("TTRUE");
    else System.out.println("FFalse");

}
public static void areAnagrams(String str1, String str2)
{

    HashMap<Character, Integer> hash4 = new HashMap<>();
    HashMap<Character, Integer> hash5 = new HashMap<>();

    for (int i=0;i<str1.length();i++)
    {
        hash4.put(str1.charAt(i),hash4.getOrDefault(str1.charAt(i),0)+1);

    }
    System.out.println("hash4 = " +hash4);

    for (int i=0;i<str2.length();i++)
    {
        hash5.put(str2.charAt(i),hash5.getOrDefault(str2.charAt(i),0)+1);

    }
    System.out.println("hash5 = " +hash5);


    if (hash4.equals(hash5))
        System.out.println("TRUE ");
    else
        System.out.println("FALSE");


}


   public static String reverseStringChar(String danaString)
   {
       String myString = "";

       for (int i=danaString.length()-1;i>=0;i--)
       {
           myString = myString.concat(String.valueOf(danaString.charAt(i)));

       }
       return myString;
   }

   public static String reverseString(String danaString)
   {
       StringBuilder danaStringBuilder = new StringBuilder("dana");
       return danaStringBuilder.reverse().toString();

   }

   public static int countVowels(String danaString)
   {
       int numberOfVawels = 0;
       for (int i=0;i<danaString.length();i++)
       {
           switch (danaString.charAt(i)) {
               case 'a':
                   numberOfVawels = numberOfVawels+1;
                   break;
               case 'e':
                   numberOfVawels = numberOfVawels+1;
                   break;
               case 'i':
                   numberOfVawels = numberOfVawels+1;
                   break;
               case 'o':
                   numberOfVawels = numberOfVawels+1;
                   break;
               case 'u':
                   numberOfVawels = numberOfVawels+1;
                   break;
               default:
                  // System.out.println("default " + danaString.charAt(i));
           }
       }
       System.out.println("Number Of Vowels is: " +numberOfVawels);

       //Varianta 2:

       int numberOfV = 0;
       String vowelsList = "aeiou";

       for (int i=0;i<danaString.length();i++)
       {
           if (vowelsList.contains(String.valueOf(danaString.charAt(i))))
               numberOfV = numberOfV+1;
       }
       System.out.println("Varianta 2 - number of Vowels = " + numberOfV);
       return numberOfVawels;
   }


}

