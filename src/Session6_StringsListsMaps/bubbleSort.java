package Session6_StringsListsMaps;

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



    }
}

