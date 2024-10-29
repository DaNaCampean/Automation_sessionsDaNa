package consolidare2;
//2. Write a Java program to find the k largest elements in a given array.
//The parameters are: k and the array (both should be read from the console)

import Learning.B;

import java.sql.Array;
import java.util.*;

public class ex2LargestElements {
public static void main(String args[]){
    Scanner myScanner = new Scanner(System.in);

    scannerReadInteger readInteger = new scannerReadInteger();

    System.out.println("Enter K:");
    int k = scannerReadInteger.readInteger(myScanner);

    System.out.println("Enter the length of the Array:");
    int len = scannerReadInteger.readInteger(myScanner);

    System.out.println("k = " +k);
    System.out.println("len = " + len);

    //int[] myArray = new int[len];
    Integer[] myArray = new Integer[len];
    for (int i=0;i<len;i++)
    {
        System.out.println("Enter element " + i);
        int element = scannerReadInteger.readInteger(myScanner);
        myArray[i] = element;

    }

    System.out.println("My Array is: ");
    for (int s:myArray)
        System.out.println(s);

    List<Integer> list = Arrays.asList(myArray);
    Collections.sort(list);
    list.sort(Comparator.reverseOrder());
    System.out.println("sorted = " + list);
    for (int s:list)
        System.out.println(s);






    myScanner.close();
}

}
