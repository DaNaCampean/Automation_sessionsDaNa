package Session6_StringsListsMaps;

import java.util.Scanner;

public class scannerStuff {

    public static void main(String[] args) {
        readNoOfMapItems();
        newReadScanner();
    }

    public static int readNoOfMapItems ()
    {
        Scanner readInt = new Scanner(System.in);
        System.out.println("Enter a number:");
        int noOfElements = readInt.nextInt();

       readInt.close();

        return noOfElements;
    }

    public static void newReadScanner()
    {
        Scanner readStringScanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String readString = readStringScanner.nextLine();
        System.out.println("String = " + readString);
        readStringScanner.close();
    }
}
