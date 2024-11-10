package Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class arrayListConsumerForEach {
    public static void main (String[] args){

    // Create an ArrayList of strings
    List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

    // Call the method to apply the Consumer action
    printNames(names);
}

public static void printNames(List<String> names) {
    // Define a Consumer action
    Consumer<String> printAction = name -> System.out.println(name);

    // Use forEach to iterate over the names list with the defined Consumer
    names.forEach(printAction);

    //USE LAMBDA EXPRESSION
    System.out.println("LAMBDA = ");
    names.forEach(s -> System.out.println(s));

    //printed out using a method reference:
    System.out.println("reference = ");
    names.forEach(System.out::println);
}
}
