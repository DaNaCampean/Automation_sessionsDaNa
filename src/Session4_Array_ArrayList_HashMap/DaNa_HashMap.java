package Session4_Array_ArrayList_HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class DaNa_HashMap {

    /*
HashMap
        1. Write a Java program to add a specific value with a specific key in a HashMap
                1. The key and value should be the parameters of the method.
                2. Return the hasp map.
        2. Write a Java program to test if a HashMap contains a specific key
                1. The key and the map should be the parameters of the method
                2. Return true or false
        3. Write a Java program to retrieve a value associated with a given key from the HashMap
                1. The key and the map should be the parameters of the method
                2. Return the value found
        4. Write a Java program to remove a key-value pair from a HashMap, where key has a given value.
                1. The key and the map should be the parameters of the method
                2. Return the modified HashMap
        5.  Write a Java program to replace a value associated with a given key in the HashMap
                1. The key and the map should be the parameters of the method
                2. Return the modified HashMap
        6. Write a Java program to add multiple values to the same key in a hash map only if the value is not already stored in the map for another key
*/



        public static void main(String args[])
        {
            dups();

            /*

           // hashMapExercise1();

         //   1. Write a Java program to add a specific value with a specific key in a HashMap
                // 1. The key and value should be the parameters of the method.
                //2. Return the hasp map.
            Scanner myScanner = new Scanner(System.in);
            HashMap<String, String> dayWatches = new HashMap<String,String>();
            /*
            System.out.println("Enter a day:");
            String day = myScanner.nextLine();
            System.out.println("Enter a watch");
            String watch = myScanner.nextLine();
            dayWatches.put(day, watch);
            System.out.println("Enter a day:");
            day = myScanner.nextLine();
            System.out.println("Enter a watch");
            watch = myScanner.nextLine();
            dayWatches.put(day, watch);
            System.out.println("Enter a day:");
            day = myScanner.nextLine();
            System.out.println("Enter a watch");
            watch = myScanner.nextLine();
            dayWatches.put(day, watch);

             */
/*
            dayWatches.put("Monday", "Swatch");
            dayWatches.put("Tuesday", "Atlantic");
            dayWatches.put("Wednesday", "Cornavin");
            dayWatches.put("Thursday", "Rolex");
            dayWatches.put("Friday", "Seiko");
            dayWatches.put("Sunday", "Orient");
            dayWatches.put("Saturday", "Citizen");

            System.out.println("MY HashMap is:" + dayWatches);

        //    2. Write a Java program to test if a HashMap contains a specific key
            //  1. The key and the map should be the parameters of the method
            //  2. Return true or false

            if (dayWatches.containsKey("Monday"))
                System.out.println("Exista!!!!!");
            else
                System.out.println("Nu exista!!!");

            // 3. Write a Java program to retrieve a value associated with a given key from the HashMap
                //1. The key and the map should be the parameters of the method
                //2. Return the value found

            System.out.println("Your retrived value for Monday is: " + dayWatches.get("Monday"));


            //4. Write a Java program to remove a key-value pair from a HashMap, where key has a given value.
                // 1. The key and the map should be the parameters of the method
                // 2. Return the modified HashMap
            System.out.println("Remove Friday :))");
            System.out.println("original:" + dayWatches);
            dayWatches.remove("Friday");
            System.out.println("After remove" + dayWatches);

            // 5.  Write a Java program to replace a value associated with a given key in the HashMap
                // 1. The key and the map should be the parameters of the method
                // 2. Return the modified HashMap

            System.out.println("original HashMap: " + dayWatches);
            dayWatches.replace("Saturday", "dana");
            System.out.println("After replace  : " + dayWatches);

            // 6. Write a Java program to add multiple values to the same key in a hash map
            // only if the value is not already stored in the map for another key
            System.out.println("EX6 --------------");
        //    6. Write a Java program to add multiple values to the same key in a hash map only if the value is not already stored in the map for another key
          // TREBUIA SA AM O LISTA CU DANA, ORIENT, ETC....
             //mONDAY = A,B,C
               //     ADAUG C IN mONDAY
                // try THIS!!!!!!!!!!!!!
            System.out.println(dayWatches);
           dayWatches.put("Monday", "dana");
           if (dayWatches.containsValue("Atlantic"))
               System.out.println("Yep. Atlantic is in the list");

            System.out.println("IF ABSENT DANA1 , ADD ON moNDAY");
            dayWatches.computeIfAbsent("Monday", k -> "dana1");
            System.out.println(dayWatches);

            System.out.println("IF ABSENT oRIENT  , ADD ON moNDAY");
            dayWatches.computeIfAbsent("Monday", (k) -> "Orient (" + k + ")");
            System.out.println(dayWatches);

            System.out.println("IF present  orient  , ADD ON moNDAY");
            dayWatches.computeIfPresent("Monday", (k, v) -> "Orient" + "(" + k + ")");
            System.out.println(dayWatches);

*/
        }
        public static void hashMapExercise1() {


        }
/*

// redo: cand dai de al doilea duplicat, compara cu noul array care deja contine ce am gasit ca duplicates!!!!!!!

            // lista pt tii elementele, si apoi doar sa faci un array . lista intorci

            //ALTA VARIANTA: AI UN KEYSET....CARE ELIMINA SINGUR DUPLICATES.....SI APOI IL FACI ARRAY...SO IN 3 LINII DE COD...SE ELIMINAU TOATE DUPS:)

exercise 5. Write a Java program to find duplicate values in an array of String.
//                1. The array of strings should be the parameter of the method.
//               2. Return the duplicated values as array.
            String[] myArray = {"dana", "didi", "dana", "dana", "didi","Conan", "Conan"};
 */

    public static void dups() {
        System.out.println("duplicates exercise");
        String[] myArray = {"dana", "didi", "dana", "dana", "Felix", "didi", "Conan", "Conan", "Otto"};

        //Echo the Array
        System.out.print("My Array = ");
        for (String mystr : myArray)
            System.out.print(mystr + " ");
        System.out.println();

        // Create a HashMap with all Array elements ( this will not add duplicates)
        HashMap<String, Integer> myHashMap = new HashMap<>();

        //Create a HashMap with keys: array elements. This will not allow duplicates
        // The values for the Hash Map will be the number of occurences
        for (String myStr : myArray)
        {
               if (myHashMap.get(myStr) == null) {
                   myHashMap.put(myStr, 1);
               } else
                myHashMap.put(myStr, myHashMap.get(myStr) + 1);
        }

        System.out.println("my hashMap = " + myHashMap);

        ArrayList<String> myArrayList = new ArrayList<>();
       // System.out.println("key = " + myHashMap.keySet());
        //System.out.println("values = " + myHashMap.values());

        for (String myHM : myHashMap.keySet())
        {
            if (myHashMap.get(myHM).equals(1))
              {
                System.out.println("THIS NEED REMOVAL = " + myHM + " - " + myHashMap.get(myHM));
                myArrayList.add(myHM);
            }

        }

        System.out.println("ArrayList = " + myArrayList);
        for (String s:myArrayList)
            myHashMap.remove(s);

        System.out.println("hash lung = " + myHashMap.size());

      //  String[] duplicatesArray = myHashMap.keySet().toArray(new String[myHashMap.size()]);
        String[] duplicatesArray = new String[myHashMap.size()];
              duplicatesArray= myHashMap.keySet().toArray(duplicatesArray);


        System.out.println("my hashMap end = " + myHashMap);

        System.out.println("ARRAY FINAL DUPS = ");
        for (String s:duplicatesArray)
        System.out.print(s + " ");
        System.out.println();







}}






