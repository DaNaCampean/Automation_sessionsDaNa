package consolidare2;

import java.util.EnumSet;

/*
Java : EnumSet Collection - Exercises:
17. Write a Java program to get the size of the EnumSet collection
18. Write a Java program to Remove Elements of an EnumSet collection that does not exist in another EnumSet collection
 */
public class ex17_18_EnumSetCollection {

    enum watches {Atlantic, Orient, Rolex};
    enum cars {Mercedes, Logan, Mustang};

    public static void main(String[] args){

        // Creating an EnumSet using allOf()
          EnumSet< watches > myEnumSet = EnumSet.allOf(watches.class);

        // Printing EnumSet elements to the console
        System.out.println("EnumSet: " + myEnumSet);

        EnumSet < cars > myEnumSetCars = EnumSet.noneOf(cars.class);
        myEnumSetCars.add(cars.Mercedes);
        //myEnumSetCars.add(cars.Mustang);
        myEnumSetCars.add(cars.Logan);

        System.out.println("Size of EnumSet : " + myEnumSetCars.size());
        System.out.println("EnumSet: " + myEnumSetCars);

        //17. Write a Java program to get the size of the EnumSet collection
        int size = myEnumSet.size();
        System.out.println("The size of the EnumSet collection of WATCHES is: " + size);

        //18. Write a Java program to Remove Elements of an EnumSet collection that does not exist in another EnumSet collection

        //create a new EnumSet, with only Atlantic and Rolex Watches
        EnumSet<watches> secondEnumWatches = EnumSet.of(watches.Orient,watches.Rolex);
        System.out.println("NEW enumSet is: " + secondEnumWatches);
        //myEnumSet.remove(watches.Atlantic);
        //System.out.println("Enum after remove: " + myEnumSet);
        EnumSet<watches> newNewEnum = EnumSet.complementOf(secondEnumWatches);
        System.out.println("NEW NEW: " + newNewEnum);

        EnumSet<cars> newNewCars = EnumSet.complementOf(myEnumSetCars);
        System.out.println("NEW NEW: " + newNewCars);

        System.out.println("Enum1:" + myEnumSet);
        System.out.println("Enum2:" + secondEnumWatches);
        myEnumSet.retainAll(secondEnumWatches);
        System.out.println("Enum1:" + myEnumSet);
        System.out.println("Enum2:" + secondEnumWatches);






    }
}
