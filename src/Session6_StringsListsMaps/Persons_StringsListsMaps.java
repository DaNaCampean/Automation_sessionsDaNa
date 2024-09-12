package Session6_StringsListsMaps;
/*
Exercise:
For this exercise we need a Map<String, String> that will contain names of persons and their genres (boy or girl).
Create the following methods:
1. Method that allows you to populate a Map with keys and values (use Map since we need duplicates) the method should return the Map and parameters should be number of inputs :
public static Map<String, String> addElementsToMap(int noOfElements)
Where you insert each value + key from the keyboard.

2. Method that prints the names from a Map
3. Method that prints the genres from a Map
4. Method that takes all the names from the Map and adds them to an arrayList - return  the array list
5. Method that takes all the genres from the Map and adds them to an arrayList - return the array list
6. Method that counts the number of girls or boys from a list
7. Method that verifies if a name ends with a certain letter
8. Method that counts the number of girls from a list (we will be using romanian names,
so the rule would be, any name that ends with the letter “a”) - use method 7 inside this method
9. Method that sorts a list alphabetically (returns sorted list)
10. Method that removes a name from a list (paramters: name to remove, list from which to remove name from)

In Main method :
1. Create a new Map<String, String> using method (1)
E.g.
Ioan boy
Alina girl
Vasile boy
Bogdan boy
Dana girl
Maria girl
2. Print the Map (using println)
3. Print the names from the map using method(2)
4. Print the genres from the map using method(3)
5. Create a list of all the names using method(4)
6. Create a list of all the genres using method(5)
7. Print the number of boys from the list using method 6
8. Print the number of girls from the list using method 6
9. Print the number of girls from the list using method 7
10. Print the sorted alphabetically list of names using method 8
11. Print the names list without a given name

Optional :
1. Create a method that removes multiple names from the Map
2. Method that removes any names from a list that start with a lowerCase
3. Method that returns the girls List from the given Map
4. Method that returns the boys List from the given Map
5. Using (3,4) create a method that prints if there are more girls or more boys in the
map (by comparing two lists)
 */

import java.util.*;

public class Persons_StringsListsMaps {
    public static void main(String[] args)
    {
        System.out.println("This is Main");
        Map<String,String> personsMap = new HashMap<>();
        HashMap<String, String> hashMapD = new HashMap<>();

        hashMapD.put("Dana", "girl");
        hashMapD.put("Felix", "boy");
        hashMapD.put("boy", "boy");

        personsMap.put("Dana", "girl");
        personsMap.put("Felix", "boy");
        personsMap.put("boy", "boy");

        System.out.println("Has = " + hashMapD);
        System.out.println("Map = " + personsMap);

    }
}
