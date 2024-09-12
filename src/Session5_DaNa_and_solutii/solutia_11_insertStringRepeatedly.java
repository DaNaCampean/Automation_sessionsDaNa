package Session5_DaNa_and_solutii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solutia_11_insertStringRepeatedly {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a String");
        String myString = myScanner.nextLine();
        System.out.println("Enter the iteration string : ");
        String insertString = myScanner.nextLine();
        System.out.println("Enter the distance for insertion : ");
        int distance = myScanner.nextInt();
        System.out.println("Inserting word: " + insertString + " in string " + myString + " results in: " + insertStringInTextRepeatedly(myString, insertString, distance));
        myScanner.close();
    }

    public static String insertStringInTextRepeatedly(String text, String insertString, int distance) {
        String result = "";
        for (int i=0;i< text.length(); i++) {
            result+= (i % distance == 0 ? insertString : "" ) + text.charAt(i);
        }
        result = result.startsWith(insertString) ? result.substring(insertString.length()) : result;
        return result;
    }



}
