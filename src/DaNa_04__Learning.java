import java.util.ArrayList;
import java.util.Scanner;

public class DaNa_04__Learning
{
    public static void main (String[] args)
    {
        System.out.println("-------EXERCISE 1------");
        Scanner myScanner = new Scanner(System.in);

        String[] myArray = {"dana1","dana2","dana3"};
        for (int i=0;i<myArray.length;i++)
        {
            System.out.println("element 2 ="+myArray[2]);
            if (myArray[i].equals("dana3"))
                System.out.println("pozitia este = "+ i);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("String is a reference-type variable");
        String integer = "dana";
        list.add(integer);
        // retrieve the value from position 0 of the word list, and print it
        System.out.println(list.get(1));

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add(scanner.nextLine());

        System.out.println("Number of values on the list: " + list.size());
    }

}


