package consolidare2;

/*
Java : String - Exercises

7. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement


 */
public class ex7ReplaceSubString {
    public static void main (String[] args){

        String myString = "Aloha. today is a beautiful day";
        String mySubString = "day";
        String newString = myString.replaceAll(mySubString, "X");
        System.out.println("Original string: "+ myString);
        System.out.println("NEW String is: " + newString);

        myString ="A list of 1 numbers 3 hahaha 123d";
        mySubString = "[0-9]"; //regex for any digit. same as "\d"
        newString = myString.replaceAll(mySubString, "X");
        System.out.println("Original string: "+ myString);
        System.out.println("NEW String is: " + newString);


    }


}
