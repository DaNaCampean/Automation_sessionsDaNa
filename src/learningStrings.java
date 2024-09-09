import java.util.Arrays;
import java.util.HashMap;

public class learningStrings {

    public static void main(String[] args) {
        //substrings
        learn_substrings("Danutzika");

        //getOrder
        areAnagrams("danutzika", "danuzikat");

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
