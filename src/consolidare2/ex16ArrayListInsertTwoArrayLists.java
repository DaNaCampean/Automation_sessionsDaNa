package consolidare2;

import java.util.ArrayList;
import java.util.Arrays;

/*

16. BJP5 Exercise 10.17: interleave:
Write a Java method called interleave that accepts two ArrayLists of integers a1 and a2 as parameters and inserts the elements of a2 into a1 at alternating indexes.
If the lists are of unequal length, the remaining elements of the longer list are left at the end of a1.

For example, if
a1 stores [10, 20, 30] and
a2 stores [4, 5, 6, 7, 8], the call of interleave(a1, a2);
should change a1 to store [10, 4, 20, 5, 30, 6, 7, 8].

If a1 had stored [10, 20, 30, 40, 50]
 and a2 had stored [6, 7, 8], the call of interleave(a1, a2);
 would change a1 to store [10, 6, 20, 7, 30, 8, 40, 50].


 */
public class ex16ArrayListInsertTwoArrayLists {

    public static void main(String[] args){
       // ArrayList<Integer> a1= new ArrayList<>(Arrays.asList(10, 20, 30));
       // ArrayList<Integer> a2= new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));

        ArrayList<Integer> a1= new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> a2= new ArrayList<>(Arrays.asList(6, 7, 8));

        System.out.println("ArrayList a1 = " + a1);
        System.out.println("ArrayList a2 = " + a2);
        interleave(a1,a2);




    }
    public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2)
    {
        int a1Len=a1.size();
        int a2Len = a2.size();
        System.out.println("Len a1 = " + a1Len + " len a2 = " + a2Len);

        int indexA1 = -1;
        for (int i=0;i<a2.size(); i++)
        {
            System.out.println("Element = " + a2.get(i));
            System.out.println("index = " +indexA1);
            int element = a2.get(i);
            System.out.println("pt IF = "+ a1Len*2);
            if (a1Len*2>indexA1+1)
            {
                System.out.println("if");
                indexA1=indexA1+2;
                a1.add(indexA1,element);
                System.out.println("A1 temp = " + a1);

            }
            else
            {
                System.out.println("else");
                a1.add(element);
            }

        }

        System.out.println("Lungime A1 = " + a1.size());
        System.out.println("ArrayList a1 = " + a1);
        System.out.println("ArrayList a2 = " + a2);

    }
}
