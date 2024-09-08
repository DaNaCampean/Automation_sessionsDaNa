package Session4_Array_ArrayList_HashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class findDuplicates {

   /* exercise 5. Write a Java program to find duplicate values in an array of String.
//                1. The array of strings should be the parameter of the method.
//               2. Return the duplicated values as array.
// redo: cand dai de al doilea duplicat, compara cu noul array care deja contine ce am gasit ca duplicates!!!!!!!

            // lista pt tii elementele, si apoi doar sa faci un array . lista intorci

            //ALTA VARIANTA: AI UN KEYSET....CARE ELIMINA SINGUR DUPLICATES.....SI APOI IL FACI ARRAY..
            .SO IN 3 LINII DE COD...SE ELIMINAU TOATE DUPS:)

*/
        public static void main(String[] args) {
            String[] myArray = {"Atlantic", "Orient", "Atlantic", "Atlantic", "Rolex", "Orient", "Seiko"};
            System.out.println("The Array to identify the duplicates:");
            for (String str:myArray)
                System.out.print(str+ " ");
            System.out.println();

            //String[] myArray = duplicateArray(myArray);

            System.out.println("ARRAY FINAL DUPS = ");
            for (String s:duplicateArray(myArray))
                System.out.print(s + " ");
            System.out.println();

            System.out.println("EX5  using Array List and compare with new ArrayList the element to be sure is not already dups---------");
            duplicate_compareArrayList(myArray);

            System.out.println("Varianta 3: keyset, add only dups");
            duplicate_addHashMap(myArray);
        }

        public static String[] duplicateArray (String[] myArray)
        {
            //Create a HashMap with keys: array elements. This will not allow duplicates
            // The values for the Hash Map will be the number of occurrences

            HashMap<String, Integer> myHashMap = new HashMap<>();

            //go through the Array elements and check if the element exist in Hash Map or not
            // if the element is not already added to the HashMap, add it with value 1( occurrence)
            // if the element already exist in hashMap as a key, increment the occurrence
            for (String myStr : myArray)
            {
                if (myHashMap.containsKey(myStr))
                  myHashMap.put(myStr, myHashMap.get(myStr) + 1);
                else
                  myHashMap.put(myStr, 1);
            }

            // print the hashMap to check the number of occurrences appears ok
            System.out.println("my hashMap = " + myHashMap);

            // create an ArrayList to add the keys that appears only once, and them remove them from the HashMap
            ArrayList<String> myArrayList = new ArrayList<>();
            for (String myHM : myHashMap.keySet())
            {
                if (myHashMap.get(myHM).equals(1))
                {
                   myArrayList.add(myHM);
                }
            }

            System.out.println("ArrayList = " + myArrayList);
            for (String s:myArrayList)
                myHashMap.remove(s);

           // Create the Array only with the HashMap keys, which are duplicates from the original Array
            String[] duplicatesArray = new String[myHashMap.size()]; // the Array length is the same as the HashMap
            duplicatesArray= myHashMap.keySet().toArray(duplicatesArray);

            return duplicatesArray;
        }

    public static void duplicate_compareArrayList(String[] myString)
    {
        /// redo: cand dai de al doilea duplicat, compara cu noul array care deja contine ce am gasit ca duplicates!!!!!!!
        // lista pt tii elementele, si apoi doar sa faci un array . lista intorci

        ArrayList<String> myArrayListDups = new ArrayList<>();

        for (int k=0;k<myString.length;k++)
        {
            for (int i=k+1;i<myString.length;i++)
                {
                    if (myString[k]==myString[i])
                    {
                       if (myArrayListDups.contains(myString[k]))
                           continue;
                       else
                        myArrayListDups.add(myString[k]);

                    }
                    else
                    {
                        continue;
                    }
                }
            }


        System.out.println("ArrayList = ");
        for(String s:myArrayListDups)
            System.out.println(s + " " );

    }

    public static void duplicate_addHashMap(String[] myString)
    {
        //add duplicates direct in HashMap
        // lista pt tii elementele, si apoi doar sa faci un array . lista intorci

        HashMap<String, Integer> myHashMap = new HashMap<>();

        for (int k=0;k<myString.length;k++)
        {
            for (int i=k+1;i<myString.length;i++)
            {
                if (myString[k]==myString[i])
                {
                    myHashMap.put(myString[k], 1);
                }

            }
        }
        System.out.println("HASHMAP = " + myHashMap);

        System.out.println("ARRAY DUPLICATES HASH TO ARRAY: ");
        String[] returnedDuplicatesArray = new String[myHashMap.size()];
        returnedDuplicatesArray = myHashMap.keySet().toArray(returnedDuplicatesArray);
        for (String s:returnedDuplicatesArray)
            System.out.print(s + " ");

    }


}

