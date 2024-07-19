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
    }

}


