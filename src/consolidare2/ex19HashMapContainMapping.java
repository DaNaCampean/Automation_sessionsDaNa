package consolidare2;

/*
Java Collection : HashMap - Exercises:
19. Write a Java program to test if a map contains a mapping for the specified value
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class ex19HashMapContainMapping {

    public static void main(String[] args){

        HashMap<String,String> myHashMap = new HashMap<>();
        myHashMap.put("Atlantic", "manual");
        myHashMap.put("Orient", "automatic");
        myHashMap.put("Swatch", "battery");

        System.out.println("HashMap: " + myHashMap);

        if (myHashMap.containsKey("Atlantic"))
            System.out.println("DA");
        else System.out.println("NOPE");

        if (myHashMap.containsValue("automatic"))
            System.out.println("DA");
        else System.out.println("NOPE");
    }
}
