package Session6_StringsListsMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class bubbleSort {
    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);


        String[] str = {"Dana", "Ioan", "Carmen", "Felix", "Alina", "Dani", "Rodica", "Adelina", "Bogdan", "Maria"};
        int lung = str.length;
        String temp = "";
        for(int i=0; i < lung; i++){
            for(int j=1; j < (lung-i); j++){
                if(str[j-1].compareTo(str[j])>0){
                    //swap elements
                    temp = str[j-1];
                    str[j-1] = str[j];
                    str[j] = temp;
                }

            }
        }
        System.out.print("My string is: ");
        for (String s:str)
            System.out.print(s + " ");
        System.out.println();

        Map<String,String> personsMap = new HashMap<>();
        personsMap.put("Ioan", "boy");
        personsMap.put("Alina", "girl");
        personsMap.put("Dani", "boy");
        personsMap.put("Bogdan", "boy");
        personsMap.put("Dana", "girl");
        personsMap.put("Maria", "girl");
        personsMap.put("Carmen", "girl");
        personsMap.put("Adelina", "girl");
        personsMap.put("Felix", "boy");
        personsMap.put("Rodica", "girl");

        // 2. Print the Map (using println)
        System.out.println("My Map is: " + personsMap);

        ArrayList<String> myListNames = new ArrayList<>();
        myListNames.addAll(personsMap.keySet());
        System.out.println("My List Names = " + myListNames);

        int arrayListlung = myListNames.size();
        String arrayTemp = "";
        for(int i=0; i < arrayListlung; i++){
            for(int j=1; j < (arrayListlung-i); j++){
                if(myListNames.get(j-1).compareTo(myListNames.get(j))>0){
                    //swap elements
                    arrayTemp = myListNames.get(j-1);
                   // myListNames.remove(j-1);
                    myListNames.set(j-1, myListNames.get(j));
                    //myListNames.remove(j);

                    myListNames.set(j,arrayTemp);
                }

            }
        }
        System.out.println("MY ARRAYLLIST SORTED = " +myListNames);

    }
}

