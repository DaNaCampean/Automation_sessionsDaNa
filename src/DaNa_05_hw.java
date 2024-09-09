import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



public class DaNa_05_hw {
 /*   Part 5

    Where to learn? Varianta 1 ( part 3.4) Varianta 2 (curs Alex Prodan)
    Varianta 3 (Udemy – chapters - Primitive Types Recap and the String Data Type)
    Java Strings & Java String Methods String class & String builder Java Regular Expressions & Pattern class

    Requirements:

            - String operations

    Checkpoint exercise(s) to be solved during meeting:
    1. Write a method reverseString(String str) that takes a string and returns it reversed.


2. Write a method countVowels(String str) that counts the number of vowels (a, e, i, o, u) in a given string.

3. Write a method areAnagrams(String str1, String str2) that checks if two given strings are anagrams
(contain the same characters in a different order).


4. Write a method replaceCharacter(String str, char oldChar, char newChar) that replaces all occurrences of oldChar with newChar in the given string.


5. Write a method isPalindrome(String str) that checks if a given string is a palindrome (reads the same forwards and backwards).

            6. Write a method charFrequency(String str, char c) that takes a string and a character as input and returns the number of times the character appears in the string.

            7. Write a method isTermInList(List<String> list, String term) that checks if the list has an element containing the provided term.

8. Write a method areTermsInList(List<String> list, List<String> searchedTerms) that checks if the list has elements containing the provided terms.

            9. Write a method getFirstInteger(String text) that retrieves the first sequence of digits from a string.

            10. Write a method checkIfTextContainsTerms(String text, boolean ignoreCase, List<String> termsList) that checks if text contains all specified terms with an option to ignore case sensitivity.

11. Write a method insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance) that will insert the given string in the specified text at every specified interval (distance).

            12. Write a method that checks if the given text contains any of the specified terms, with an option to ignore case sensitivity.

13. Write a method that will return a specified number of random elements from a given list.

  */

public static void main(String[] args) {

// 1. Write a method reverseString(String str) that takes a string and returns it reversed.

  //  System.out.println("Char method - REVERSE STRING IS: " + reverseStringChar("DaNa"));
  //  System.out.println("StringBuilder Method - REVERSE STRING IS: " + reverseString("dana") );

// 2. Write a method countVowels(String str) that counts the number of vowels (a, e, i, o, u) in a given string.
   // String danaString = "danutzika";
    //System.out.println("Number of Vowels = " + countVowels(danaString));
  //  3. Write a method areAnagrams(String str1, String str2) that checks if two given strings are anagrams
    //  (contain the same characters in a different order).

    areAnagrams("danutzika", "danutziak");

    String str1 = "danutzika";
    String str2 = "danutziak";

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

   // 4. Write a method replaceCharacter(String str, char oldChar, char newChar)
    // that replaces all occurrences of oldChar with newChar in the given string.
  StringBuilder strB = new StringBuilder("dana");
    System.out.println("STR B = " + strB);
   // Char[] charD = new Char[3];
    //strB.getChars(0,3,charD,0);

   // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
    //Characters are copied from this sequence into the destination character array dst.
//strBuilderGetChar();
strBuilderGetCharListDana();
}

    public static void strBuilderGetCharListDana()
    {
        // creating an object of the StringBuilder class
        StringBuilder sb = new StringBuilder("DaNuTzIkA");
        System.out.println("The given string value is: " + sb);
        //create an array of character
        ArrayList<Character> dst =new ArrayList<>();

        //initialize the srcBegin, srcEnd, dstBegin
        int srcBegin = 0;
        int srcEnd = sb.length();
        int dstBegin = 0;
        System.out.println("\nThe values of srcBegin, srcEnd, and dstBegin are: " + srcBegin + " , " + srcEnd + " and " + dstBegin);

        //using the getChars() method
       // sb.getChars(srcBegin, srcEnd, dst, dstBegin);
        System.out.print("The new copied character array elements are: ");

       // for(int i = 0; i<dst.length; i++) {
       //     System.out.print(dst[i] + " ");
     //   }
    }
public static void strBuilderGetChar()
{
    // creating an object of the StringBuilder class
    StringBuilder sb = new StringBuilder("Welcome to TutorialsPoint");
    System.out.println("The given string value is: " + sb);
    //create an array of character
    char dst[] = {'A','B','z'};
    System.out.print("The characrer array elements are: ");
    for(int i = 0; i<dst.length; i++) {
        System.out.print(dst[i] + " ");
    }
    //initialize the srcBegin, srcEnd, dstBegin
    int srcBegin = 3;
    int srcEnd = 6;
    int dstBegin = 0;
    System.out.println("\nThe values of srcBegin, srcEnd, and dstBegin are: " + srcBegin + " , " + srcEnd + " and " + dstBegin);
    //using the getChars() method
    sb.getChars(srcBegin, srcEnd, dst, dstBegin);
    System.out.print("The new copied character array elements are: ");
    for(int i = 0; i<dst.length; i++) {
        System.out.print(dst[i] + " ");
    }
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
                   System.out.println("default " + danaString.charAt(i));
           }
       }
       System.out.println("Number Of Vowels is: " +numberOfVawels);

       int numberOfV = 0;
       ArrayList<Character> vowelsList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o','u'));
     //  ArrayList<String> stringArray = new ArrayList<>(danaString);
     

       for (Character c: vowelsList)
       {
           System.out.println("c = " +c);
           if (danaString.contains(c.toString()))
               numberOfV = numberOfV+1;

       }


       return numberOfV;
   }


}

