package consolidare2;

import java.util.ArrayList;
import java.util.Arrays;

/*
Array List -Practice-IT
15. BJP5 Exercise 10.2: swapPairs:
Write a Java method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.

Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on.
For example, if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"}
your method should switch the first pair, "four", "score",
the second pair,"and", "seven",
 and the third pair, "years", "ago",
 to yield this list: {"score", "four", "seven", "and", "ago", "years"}

If there are an odd number of values in the list, the final element is not moved.
For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"}
It would again switch pairs of values, but the final value, "hamlet" would not be moved,
yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}


 */
public class ex15ArrayListSwapPairs {

    public static void main (String[] args){

       //ArrayList<String> myArray = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));

       ArrayList<String> myArray = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));
       // swapPairs(myArray);
        swapPairs1(myArray);

    }
    public static void swapPairs(ArrayList<String> myArray)
    {

        System.out.println("MyArray = " + myArray);
        myArray.trimToSize();
        int len = myArray.size();
        System.out.println("LEN = " + len);

       // if (len%2!=0)
       // {
         //   len = len-1;
       // }
        for (int i=0;i<len-1;i=i+2)
        {
            System.out.println("i = " + i);
            String temp1 = myArray.get(i);
            String temp2 = myArray.get(i+1);

            System.out.println("temp1 = "+temp1);
            System.out.println("temp2 = "+temp2);
            myArray.remove(i);
            myArray.add(i,temp2);
            myArray.remove(i+1);
            myArray.add(i+1,temp1);

            System.out.println("MyArray = " + myArray);

        }
        System.out.println("MyArray = " + myArray);
    }
    public static void swapPairs1(ArrayList<String> myArray)
    {

        System.out.println("MyArray = " + myArray);
        myArray.trimToSize();
        int len = myArray.size();
        System.out.println("LEN = " + len);


        for (int i=0;i<len-1;i=i+2)
        {

            String temp1 = myArray.get(i);


            System.out.println("temp1 = "+temp1);
            myArray.set(i,myArray.get(i+1));
            myArray.set(i+1, temp1);


            System.out.println("MyArray = " + myArray);

        }
        System.out.println("MyArray = " + myArray);
    }
}
