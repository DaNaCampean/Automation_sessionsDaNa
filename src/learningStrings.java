import java.util.Arrays;
import java.util.HashMap;

public class learningStrings {

    public static void main(String[] args) {
        //substrings
        //learn_substrings("Danutzika");

        //getOrder
        //areAnagrams("danutzika", "danuzikat");

       /* // Problem 11 from Dani
        String text = "123123123";
        String stringToBeInserted = "--";
        int distance = 3;

        System.out.println("TRY1 = " + try1insertStringInTextRepeatedly(text,stringToBeInserted,distance));
        System.out.println("TRY2 = " + try2insertStringInTextRepeatedly(text,stringToBeInserted,distance));
        System.out.println("TRY3_GOOD = " + insertStringInTextRepeatedly(text,stringToBeInserted,distance));
*/
        String text = "dana123dana45d";
        String firstInteger = getFirstInteger(text);
        System.out.println("The first integer found: " + firstInteger);

    }

    public static String getFirstInteger(String text) {
        StringBuilder numberBuilder = new StringBuilder();

        boolean foundDigit = false;

        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                numberBuilder.append(c);
                foundDigit = true; // Set flag indicating we've found a digit
            } else if (foundDigit) {
                // If we have already found a digit and hit a non-digit, we stop
                break;
            }
        }

        return numberBuilder.toString();
    }
    public static String try1insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance){

        StringBuffer addedstring = new StringBuffer();
        addedstring.append(text);
        for (int i=0; i<text.length(); i=i+distance ) {
            addedstring.insert(distance, stringToBeInserted);
        }

        return addedstring.substring(0);
    }

    public static String try2insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance){

        StringBuffer addedstring = new StringBuffer();
        addedstring.append(text);
        for (int i=0; i<text.length(); i+=distance ) {
            addedstring.insert(i, stringToBeInserted);
        }

        return addedstring.substring(0);
    }

    public static String insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance){

        StringBuffer addedstring = new StringBuffer();
        addedstring.append(text);

        System.out.println("AddedString = " + addedstring);

        int j = text.length()/distance;
        System.out.println("J=" +j);

        j = j*stringToBeInserted.length();
        System.out.println("J=" +j);
        for (int i=0; i<text.length()+j; i+=(distance+stringToBeInserted.length())) {
            addedstring.insert(i, stringToBeInserted);

        }

        return addedstring.substring(0);
    }


    public static void learn_substrings(String myString) {
        String subStr = myString.substring(1, 3); // startIndex=1, but end=3-1. 3 is the index after the last char for substring
        System.out.println("substr between index = " + subStr);
        System.out.println("Substring with startIndex = " + myString.substring(2));
    }

    public static void areAnagrams(String str1, String str2) {

        HashMap<Character, Integer> hash4 = new HashMap<>();
        HashMap<Character, Integer> hash5 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            hash4.put(str1.charAt(i), hash4.getOrDefault(str1.charAt(i), 0) + 1);

        }
        System.out.println("hash4 = " + hash4);

        for (int i = 0; i < str2.length(); i++) {
            hash5.put(str2.charAt(i), hash5.getOrDefault(str2.charAt(i), 0) + 1);

        }
        System.out.println("hash5 = " + hash5);


        if (hash4.equals(hash5))
            System.out.println("TRUE ");
        else
            System.out.println("FALSE");
    }
}
