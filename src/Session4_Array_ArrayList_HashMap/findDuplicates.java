package Session4_Array_ArrayList_HashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class findDuplicates {




        public static void main(String[] args) {
            String[] myArray = {"dana1", "didi", "dana", "dana", "didi", "Conan", "Conan"};
            String[] duplicates = findDuplicates(myArray);

            //number of dups:
            findDuplicatesNr(myArray);


            // Print the duplicate values
            System.out.println("Duplicate values:");
            for (String duplicate : duplicates) {
                if (duplicate != null) {
                    System.out.println(duplicate);
                }
            }
        }

    public static void findDuplicatesNr(String[] array) {
        HashMap<String, Integer> stringCountMap = new HashMap<>();

        // Count the occurrences of each string
        for (String str : array) {
            System.out.println("STR = " + str);
            System.out.println("stringCountMap.getOrDefault(str, 0) = " + stringCountMap.getOrDefault(str, 0));
            stringCountMap.put(str, stringCountMap.getOrDefault(str, 0) + 1);
            System.out.println("HASHMAP in for = " + stringCountMap);
        }
        System.out.println("HASHMAP = " + stringCountMap);

        // Iterate through the HashMap to find duplicates
        System.out.println("final Hash = "+ stringCountMap);

        System.out.println("Duplicate values:");
        for (String key : stringCountMap.keySet()) {
            System.out.println("stringCountMap.get(key) = " + stringCountMap.get(key));
            if (stringCountMap.get(key) > 1) {
                System.out.println(key + " appears " + stringCountMap.get(key) + " times.");
            }
        }
    }
        public static String[] findDuplicates(String[] array) {
            HashMap<String, Integer> stringCountMap = new HashMap<>();
            ArrayList<String> duplicateList = new ArrayList<>();

            // Count the occurrences of each string
            for (String str : array) {
                stringCountMap.put(str, stringCountMap.getOrDefault(str, 0) + 1);
            }

            // Find duplicates and store them in a list
            for (String key : stringCountMap.keySet()) {
                if (stringCountMap.get(key) > 1) {
                    duplicateList.add(key);
                }
            }

            // Convert the list of duplicates to an array
            String[] duplicateArray = new String[duplicateList.size()];
            return duplicateList.toArray(duplicateArray);
        }
    }

