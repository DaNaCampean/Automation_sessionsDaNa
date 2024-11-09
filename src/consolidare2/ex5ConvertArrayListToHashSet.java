package consolidare2;
/*
Java Collection : ArrayList - Exercises:
5. Write a Java program how to Convert a ArrayList to HashSet
 */

/*
ArrayList allows duplicate values while HashSet doesn't allow duplicates values.
Ordering : ArrayList maintains the order of the object in which they are inserted while HashSet is an unordered collection and doesn't maintain any order.
 */
import java.util.ArrayList;
import java.util.HashSet;

public class ex5ConvertArrayListToHashSet {

    public static void main (String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Orient");
        myArrayList.add("Atlantic");
        myArrayList.add("Rolex");
        myArrayList.add("Cornavin");
        myArrayList.add("Swatch");
        myArrayList.add("Swatch");

        myArrayList.trimToSize();
        System.out.println("My Arraylist after Trim is: " + myArrayList);

        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Orient");
        myHashSet.add("Atlantic");
        myHashSet.add("Rolex");
        myHashSet.add("Cornavin");
        myHashSet.add("Swatch");
        myHashSet.add("Swatch");

        System.out.println("My HashSet is: " + myHashSet);

        //convert ArrayList to HashSet

        HashSet<String> newHashSet = new HashSet<>(myArrayList.size());
        newHashSet.addAll(myArrayList);
        System.out.println("My HashSet formed by Array List converted is: " + newHashSet);

        //convert HashSet To ArrayList
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(newHashSet);
        System.out.println("My ArrayList formed by HashSet converted is: " + newArrayList);
    }

}
