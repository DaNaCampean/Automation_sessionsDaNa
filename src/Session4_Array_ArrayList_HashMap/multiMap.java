package Session4_Array_ArrayList_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class multiMap {
    public static void main (String[] args)
    {
        HashMap<String, ArrayList<String>> myMultiMap = new HashMap<>();
        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("10:00", "19:00"));

       myMultiMap.put("Monday", myArrayList);
        System.out.println("MultiMap = " + myMultiMap);


        System.out.println("Value = " + myMultiMap.get("Monday"));
        for (String s:myMultiMap.keySet())
        {
            System.out.println("Key = " + s);
            System.out.println("value = " + myMultiMap.get(s));
        }


    }


}
