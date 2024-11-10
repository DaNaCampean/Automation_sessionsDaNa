package Learning;

import java.util.Arrays;
import java.util.List;

public class lambdaExpression {
    public static void main(String[] args) {

        // Create an ArrayList of strings
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");
        items.forEach(item -> System.out.println(item));

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.forEach(number -> System.out.println(number * 2));
    }
}
/*
This example prints each string element in the items list. The lambda expression item -> System.out.println(item) is executed for each element.

mport java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaUpperCase {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Use lambda expression to convert each string in the list to uppercase
        List<String> upperCaseList = stringList.stream()
                .map(s -> s.toUpperCase()) // Convert each string to uppercase
                .collect(Collectors.toList()); // Collect the results into a new list

        // Print the results
        System.out.println("Original List: " + stringList);
        System.out.println("Uppercase List: " + upperCaseList);
    }
}
 */