package consolidare2;

/*
Java Collection : HashSet - Exercises
20. Write a Java program to Check whether a HashSet contains a specified item or not
*/

import java.util.HashSet;

public class ex20HashSetContainItem {
    public static void main(String[] args){
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Atlantic");
        myHashSet.add("Orient");
        myHashSet.add("Cornavin");

        System.out.println("HashSet: " + myHashSet);
        if (myHashSet.contains("Orient1"))
            System.out.println("DA");
        else System.out.println("NOPE");
    }
}
