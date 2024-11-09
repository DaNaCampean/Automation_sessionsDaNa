package consolidare2;

import java.util.ArrayList;

/*
Java Collection : ArrayList - Exercises:
4. Write a Java program to trim the capacity of an array list the current list size

*/

/*
Definition and Usage
The trimToSize() method reduces the capacity of a list to fit exactly the number of items that the list contains.

This method does not have a visible effect but it can can be used to reduce the memory usage of the list.

When an ArrayList is created, capacity for 10 items is reserved unless another number is specified in the constructor.
Even if the list does not have 10 items, this space is still reserved. Removing items from a list may leave the space for those items reserved.
When you are not using of the capacity of an ArrayList then there is some wasted memory which can accumulate if your program makes use of many ArrayLists.
You can use the trimToSize() method to recover the unused memory.
 */
public class ex4TrimCapacityArrayList {

    public static void main (String[] args){

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Orient");
        myArrayList.add("Atlantic");
        myArrayList.add("Rolex");
        myArrayList.add("Cornavin");
        myArrayList.add("Swatch");

        System.out.println("My Arraylist is: " + myArrayList);
        myArrayList.trimToSize();
        System.out.println("My Arraylist after Trim is: " + myArrayList);




    }
}
