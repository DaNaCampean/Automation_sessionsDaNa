package Learning;

import java.util.Arrays;

public class LearningStrings {
    public static void main(String[] args) {
        String str1 = "I";
        String str2 = "love";
        String str3 = "Java";

        // join strings with space/ -  between them
        String joinedStr = String.join(" ", str1, str2, str3);
        System.out.println(joinedStr);
        char[] charArray = joinedStr.toCharArray();
        for (char c:charArray)
        {
            System.out.println("Char Array = " + c);
        }
        System.out.println("char array" + Arrays.toString(charArray));

        String convertCharToString = Arrays.toString(charArray);
        System.out.println("convert = " + convertCharToString);
        Arrays.sort(charArray);
        System.out.println("ordered?");
        System.out.println(charArray);
        String str = "Java Programming";

        // creating a char array
        char[] result;
        result = str.toCharArray();
        System.out.println(result); // Java Programming
        System.out.println("sort? = ");
        Arrays.sort(result);
        System.out.println("Result = ");
        System.out.println(result);


    }
}
