package consolidare2;

import java.util.Scanner;

public class scannerReadInteger {
    public static int readInteger(Scanner myScanner){
        System.out.println("I am in scannerReadInteger Class");
        int number = myScanner.nextInt();
        return number;
    }

    public static String readString(Scanner myScanner){
        System.out.println("I am in scannerReadInteger Class");
        String number = myScanner.nextLine();
        return number;
    }
}
