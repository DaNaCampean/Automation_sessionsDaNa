package Session4_Array_ArrayList_HashMap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class testVarianta {
        public static void main(String[] args) {
            // Initialize the map with some fruit and vegetable values
            Map<String, List<String>> map = new HashMap<>();
            map.put("Fructe", new ArrayList<>(List.of("mere", "pere", "prune", "caise")));
            map.put("Legume", new ArrayList<>(List.of("cartofi", "morcovi", "patrunjel", "fasole")));

            // Initialize a set to keep track of values added to prevent duplicates
            HashSet<String> existingValues = new HashSet<>();

            // Populate the set with existing values
            for (List<String> values : map.values()) {
                existingValues.addAll(values);
            }

            // Method to add a value to a given key if not already present
            addValue(map, existingValues, "Fructe", "struguri");
            addValue(map, existingValues, "Legume", "morcovi"); // Duplicate value, will not be added
            addValue(map, existingValues, "Legume", "rosii");
            addValue(map, existingValues, "Fructe", "rosii");

            // Print the final content of the map
            printMap(map);
        }

        // Function to add a value to the map if it's not already present in existing values
        public static void addValue(Map<String, List<String>> map, HashSet<String> existingValues, String key, String value) {
            if (!existingValues.contains(value)) {
                map.get(key).add(value);
                existingValues.add(value);
                System.out.println("Added value: " + value + " to key: " + key);
            } else {
                System.out.println("Value: " + value + " already exists, cannot add to key: " + key);
            }
        }

        // Function to print the content of the map
        public static void printMap(Map<String, List<String>> map) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


