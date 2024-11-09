package consolidare2;
/*
Java : String - Exercises
6. Write a program to String comparison using Collator and String classes
*/

/*
The Collator class is used for comparing strings based on their linguistic rules, such as language-specific character order and case sensitivity.
The Locale class is used to specify the language and country of the Collator instance.
The compareTo method of the String class is also used to compare two strings. This method compares strings based on their Unicode values.
rESULT CAN be 0, <0, >0.
less than 0, it means that s1 comes before s2.
reater than 0, it means that s1 comes after s2.
 equal to 0, it means that s1 and s2 are the same strings.

 */

import java.text.CollationKey;
import java.text.Collator;
import java.util.Locale;

public class ex6ComparisonCollator {
    public static void main (String[] args){

        String string1="eâe";
        String string2="eàe";

        // à, Â â
        // "eñe"

        if (string1.equals(string2))
            System.out.println("The strings are identical (equals)");

        boolean equals = string1.equals(string2);
        System.out.println("Comparare EQUALS = " + equals);

        int comparare = 0;

        //compareTo clasic
        comparare = string1.compareTo(string2);
        System.out.println("COMPARARE = "+comparare);

        // compareTo Ignore case
       // comparare = string1.compareToIgnoreCase(string2);

        // Collator foloseste si locale. daca nu e trecut nimic la getInstance, este locale, altfel trebuie pus getInstance(Locale.US)
        Collator myCollator = Collator.getInstance(Locale.FRENCH);
       // comparare = myCollator.compare(string1, string2);

        if (comparare<0)
            System.out.println("Ordinea: "+string1 + "->" + string2);
        else
        if (comparare>0)
            System.out.println("Ordinea: "+string2 + "->" + string1);
        else
            System.out.println("Same order");






    }
}
