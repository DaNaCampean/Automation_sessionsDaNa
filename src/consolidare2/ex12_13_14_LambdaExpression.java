package consolidare2;

import java.util.*;
import java.util.stream.Collectors;

/*
Java : Lambda Expression - Exercises
12. Write a Java program using Lambda Expression to convert a list of strings to uppercase and lowercase
13. Write a Java program using Lambda Expression to remove duplicates from a list of integers
14. write a Java program using Lambda Expression to sort the strings based on their lengths in ascending order


//USE LAMBDA EXPRESSION
    System.out.println("LAMBDA = ");
    names.forEach(s -> System.out.println(s));

    //printed out using a method reference:
    System.out.println("reference = ");
    names.forEach(System.out::println);
 */
public class ex12_13_14_LambdaExpression {
    public static void main (String[] args){
    /*   //String myLambda = () -> System.out.println("Lambdas are great");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        System.out.println("MyArray List = ");
        numbers.forEach( (n) -> { System.out.println(n); } );
        numbers.forEach( (n) -> System.out.println(n));
*/

        List<String> myWatches = Arrays.asList("Atlantic", "Orient", "Rolex", "Cornavin", "Pobeda");
        List<Integer> myNumbers = Arrays.asList(1,1,7,2,77,345,0,1);
       // 12. Write a Java program using Lambda Expression to convert a list of strings to uppercase and lowercase
        convertUpperLower(myWatches);

        //13. Write a Java program using Lambda Expression to remove duplicates from a list of integers
       removeDups(myNumbers);

        // 14. write a Java program using Lambda Expression to sort the strings based on their lengths in ascending order
        sortString(myWatches);

    }

    public static void convertUpperLower(List<String> myWatches)
    {
        // 12. Write a Java program using Lambda Expression to convert a list of strings to uppercase and lowercase


        System.out.println("print list with Lambda = ");
        myWatches.forEach(item -> System.out.println(item));

        System.out.println("Print list with Refference methode:");
        myWatches.forEach(System.out::println);




        System.out.println("sorted = " );
        myWatches.stream()
                .sorted()
                .forEach((p) -> System.out.println(p));

        System.out.println("LIST WITH UPPERCASE: ");
        myWatches.stream()
                .map((p) -> p.toUpperCase())
                .forEach((p) -> System.out.println(p));

        System.out.println("LIST WITH lowercase: ");
        myWatches.stream()
                .map((p) -> p.toLowerCase())
                .forEach((p) -> System.out.println(p));

        System.out.println("ALTA METODA DE UPPER, cu create new list");

        List<String> newList = myWatches.stream()
                .map(item -> item.toUpperCase(Locale.UK))
                .collect(Collectors.toList());
        System.out.println(newList);





    }

    public static void removeDups(List<Integer> myNumbers)
    {
        //13. Write a Java program using Lambda Expression to remove duplicates from a list of integers

        System.out.println("REMOVE DUPS: ");
        myNumbers.stream()
                .distinct()
                .forEach((p) -> System.out.println(p));

        System.out.println("just DUPS: ");
        myNumbers.stream()
                .filter(p -> Collections.frequency(myNumbers,p)>1)
                .forEach((p) -> System.out.println(p));

    }

    public static void sortString(List<String> myWatches)
    {
        // 14. write a Java program using Lambda Expression to sort the strings based on their lengths in ascending order

        System.out.println("SORT BASED ON LENGTH");
        myWatches.stream()
                .map((p) -> p.length())
                .sorted()
                .forEach((p) -> System.out.println(p));

        Collections.sort(myWatches, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(myWatches);
    }
}
