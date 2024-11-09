package consolidare2;
//2. Write a Java program to find the k largest elements in a given array.
//The parameters are: k and the array (both should be read from the console)

import java.util.*;

public class ex2LargestElements {
public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);

    scannerRead readInteger = new scannerRead();

    System.out.println("Enter K:");
    int k = scannerRead.readInteger(myScanner);

    System.out.println("Enter the length of the Array:");
    int len = scannerRead.readInteger(myScanner);

    System.out.println("k = " +k);
    System.out.println("len = " + len);

    //int[] myArray = new int[len];
    Integer[] myArray = new Integer[len];
    for (int i=0;i<len;i++)
    {
        System.out.println("Enter element " + i);
        int element = scannerRead.readInteger(myScanner);
        myArray[i] = element;

    }

    System.out.print("My Array is: ");
    for (int s:myArray)
        System.out.print(s+" ");

    List<Integer> list = Arrays.asList(myArray);
    Collections.sort(list);
    list.sort(Comparator.reverseOrder());
    /*System.out.println("sorted = " + list);
    for (int s:list)
        System.out.println(s);

     */
    System.out.print("\nthe "+ k + " largest elements in a given array = ");
    for(int i=0;i<k;i++)
    {
        System.out.print(list.get(i)+ " ");
    }






    myScanner.close();
}

}
