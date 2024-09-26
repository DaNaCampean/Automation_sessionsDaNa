package Session6_StringsListsMaps;
/*
Exercise:
For this exercise we need a Map<String, String> that will contain names of persons and their genres (boy or girl).
Create the following methods:
1. Method that allows you to populate a Map with keys and values (use Map since we need duplicates) the method
should return the Map and parameters should be number of inputs :
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



// scanner next...daca primim "hellow word" va lua doar hello fata de nextLine.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Persons_StringsListsMaps {

    public static void main(String[] args) {

        Scanner readFromKeyboard = new Scanner(System.in);
        Map<String, String> personsMap = new HashMap<>();
        int noOfElements = readNoOfMapItems(readFromKeyboard); // read the number of elements for the Map

       // 1. Create a new Map<String, String> using method (1)
        personsMap = addElementsToMap_method1(readFromKeyboard,noOfElements );


        //2. Print the Map (using println)
        System.out.println("My Map is: " + personsMap);

        //3. Print the names from the map using method(2)
        printNames_method2(personsMap);

        //4. Print the genres from the map using method(3)
        printGenders_method3(personsMap);

        //5. Create a list of all the names using method(4)
        ArrayList<String> namesArrayList = createArrayListNames_method4(personsMap);

        //6. Create a list of all the genres using method(5)
        ArrayList<String> gendersArrayList = createArrayListGenders_method5(personsMap);

       // 7. Print the number of boys from the list using method 6
        System.out.println("There are " + countNoGirlsBoys_method6(gendersArrayList, "boy") + " boys in the Map");


       // 8. Print the number of girls from the list using method 6
        System.out.println("There are " + countNoGirlsBoys_method6(gendersArrayList, "girl")+ " girls in the Map");

        // 9. Print the number of girls from the list using method 7
        endsWithCertainLetter_method7(namesArrayList,"a");

        //10. Print the sorted alphabetically list of names using method 8


        //11. Print the names list without a given name

        readFromKeyboard.close();

    }


//Method for reading the number of Elements in the Map


    public static int readNoOfMapItems (Scanner readInt)
    {

        int noOfElements=0;

       while (noOfElements<=0) {
               System.out.println("Please add the number of elements you want to use in the Map. The number cannot be zero or negative:");
               try {
                   noOfElements = readInt.nextInt();


               } catch (Exception e) {
                   System.out.println("The entered item is not a number!!! ");
                 readInt.nextLine();
                   noOfElements = 0;

               }
           }
       readInt.nextLine();

        return noOfElements;

    }

    /*
For this exercise we need a Map<String, String> that will contain names of persons and their genres (boy or girl).
Create the following methods:
1. Method that allows you to populate a Map with keys and values (use Map since we need duplicates) the method should return the Map
and parameters should be number of inputs :
public static Map<String, String> addElementsToMap(int noOfElements)
Where you insert each value + key from the keyboard.
*/
    public static Map<String, String> addElementsToMap_method1(Scanner readInput, int noOfElements)
    {

        Map<String, String> personsMap = new HashMap<>();
        System.out.println("Instructions: You will need to add names and values, where values can be boy or girl." +
                "You are requested to add "+ noOfElements + " pairs of names and gender");

        String name="";
        String gender="";
        //String myNumber1= readInput.nextLine();

        System.out.println("Number = "+noOfElements);
        for (int i=0;i<noOfElements;i++)
        {
            System.out.println("Please enter the name for person " + (i+1) + " :");
            name = readInput.nextLine();
            System.out.println("Please enter the gender (girl or boy) for person " + (i+1) + " :");
            gender = readInput.nextLine();
            //check if the gender match the requirement: boy or girl, IgnoreCase
            while (!gender.equalsIgnoreCase("girl") && !gender.equalsIgnoreCase("boy"))
            {
                System.out.println("The gender is not valid." +
                        "Please enter the gender (girl or boy) for person " + (i+1) + " :");
                gender = readInput.nextLine();

            }
            personsMap.put(name, gender);

        }


        return personsMap;
    }



    // 2. Method that prints the names from a Map
    public static void printNames_method2(Map<String, String> personsMap)
    {
        System.out.println("All persons from the Map are: " + personsMap.keySet());
    }

    // 3. Method that prints the genres from a Map
    public static void printGenders_method3(Map<String, String> personsMap)
    {
        System.out.println("All genders from the Map are: " + personsMap.values());
    }

    // 4. Method that takes all the names from the Map and adds them to an arrayList - return  the array list

    public static ArrayList<String> createArrayListNames_method4(Map<String, String> personsMap)
    {
        ArrayList<String> myListNames = new ArrayList<>();
        myListNames.addAll(personsMap.keySet());
        System.out.println("My List Names = " + myListNames);
        return myListNames;

    }

    // 5. Method that takes all the genres from the Map and adds them to an arrayList - return the array list
    public static ArrayList<String> createArrayListGenders_method5(Map<String, String> personsMap)
    {

        ArrayList<String> myListGenders = new ArrayList<>();
        myListGenders.addAll(personsMap.values());

        //sugestie: ArrayList<String> myListGenders = new ArrayList<>(personsMap.values());
        System.out.println("My List genders = " + myListGenders);
        return  myListGenders;
    }

    // 6. Method that counts the number of girls or boys from a list
    public static int countNoGirlsBoys_method6 (ArrayList<String> myListGenders, String gender)
    {
        int noBoys = 0;
        int noGirls = 0;
        for (String s: myListGenders)
        {
            if (s.equals("girl"))
                noGirls++;
            else
                ++noBoys;
        }
        if (gender == "boy")
            return noBoys;
        else
            return noGirls;
    }

// 7. Method that verifies if a name ends with a certain letter
public static void endsWithCertainLetter_method7 (ArrayList<String> myListNames, String myChar) {

    for (String s : myListNames) {
        if (s.endsWith(myChar))
            System.out.println(s + " ends with " + myChar);
    }
}

// 8. Method that counts the number of girls from a list (we will be using romanian names,
    //so the rule would be, any name that ends with the letter “a”) - use method 7 inside this method


//9. Method that sorts a list alphabetically (returns sorted list)


//10. Method that removes a name from a list (paramters: name to remove, list from which to remove name from)


}

/*



      //  8. Method that counts the number of girls from a list (we will be using romanian names,
      //      so the rule would be, any name that ends with the letter “a”) - use method 7 inside this method


      //  9. Method that sorts a list alphabetically (returns sorted list)

        //myListNames.sort(null);
        //Collections.sort(myListNames);
        //System.out.println("My sorted list of names is: " + myListNames);
        //Collections.sort(myListNames,Collections.reverseOrder());
        //System.out.println("My sorted list of names is: " + myListNames);

        System.out.println("My list of Names : " + myListNames);
       // StringBuffer myStrBuffer = new StringBuffer(myListNames);


        System.out.println(myListNames.getFirst());

        char[] startWithChars;
        Map<String, Character> mySortedMap = new HashMap<>();
        String firstLetterStr = "";

        for (int i=0;i<myListNames.size();i++)
        {
            //System.out.println("Name = " + myListNames.get(i));
            //System.out.println("litera = " + myListNames.get(i).charAt(0));
            mySortedMap.put(myListNames.get(i), myListNames.get(i).charAt(0));
            firstLetterStr = firstLetterStr+myListNames.get(i).charAt(0);

        }
        System.out.println("new Hash = " + mySortedMap);
        System.out.println("str = " + firstLetterStr);
        char[] myChar = firstLetterStr.toCharArray();
        Arrays.sort(myChar);







        myListNames.sort(String::compareTo);
        System.out.println("sorted list - myListNames.sort(String::compareTo): " + myListNames);

        myListNames.sort(null);
        System.out.println("Sorted list using myListNames.sort(null) =         " + myListNames);
        Collections.sort(myListNames);
        System.out.println("Sorted list using Collections.sort(myListNames) =  " + myListNames);

        // Sorting in natural order (alphabetical)
        myListNames.sort(Comparator.naturalOrder());
        System.out.println("Sorted in natural order: " + myListNames);

        // Sorting in reverse order
        myListNames.sort(Comparator.reverseOrder());
        System.out.println("Sorted in reverse order: " + myListNames);

        // Sorting by length of names
        myListNames.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted by length: " + myListNames);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(22);
        list.add(33);
        list.add(1);
        list.add(3);

        list.sort(null);
        System.out.println("Sorted list using myListNames.sort(null) =         " + list);
        Collections.sort(list);
        System.out.println("Sorted list using Collections.sort(myListNames) =  " + list);

        // Sorting in natural order (alphabetical)
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted in natural order: " + list);

        // Sorting in reverse order
        list.sort(Comparator.reverseOrder());
        System.out.println("Sorted in reverse order: " + list);


        String str1 = "";
        String str2 = "";
        ArrayList<String> newList = new ArrayList<>();

        Map<String, Integer> danaMap = new HashMap<>();
        int count1=0;
        int count2=0;
        for (int i=0;i<myListNames.size();i++)
        {
            str1 = myListNames.get(i);
            for (int j=i+1;j<myListNames.size();j++)
            {
                str2 = myListNames.get(j);
                if (str1.compareTo(str2) <0)
                {
                    danaMap.put(str1,danaMap.getOrDefault(str1,0)-1);
                    danaMap.put(str2,danaMap.getOrDefault(str2,0)+1);

                }
                else
                {

                    danaMap.put(str2,danaMap.getOrDefault(str2,0)+1);
                    danaMap.put(str1,danaMap.getOrDefault(str1,0)-1);

                }
            }

        }
        System.out.println("NEW HASH = " + danaMap);
        System.out.println("new hash values" + danaMap.values());













      //  10. Method that removes a name from a list (paramters: name to remove, list from which to remove name from)
    }

}
*/