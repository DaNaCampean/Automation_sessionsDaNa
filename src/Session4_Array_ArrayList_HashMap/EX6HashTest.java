package Session4_Array_ArrayList_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// 6. Write a Java program to add multiple values to the same key in a hash map
// only if the value is not already stored in the map for another key
// TREBUIA SA AM O LISTA CU DANA, ORIENT, ETC....
//mONDAY = A,B,C
//     ADAUG C IN mONDAY
// try THIS!!!!!!!!!!!!!

public class EX6HashTest {
   // de la daniL
   public static void main (String[] args)

   {

       //fromDani();
       danaVarianta();



    }
    public static void danaVarianta()
    {

        // 6. Write a Java program to add multiple values to the same key in a hash map

// only if the value is not already stored in the map for another key

// TREBUIA SA AM O LISTA CU DANA, ORIENT, ETC....
//mONDAY = A,B,C
//     ADAUG C IN mONDAY
// try THIS!!!!!!!!!!!!!

        HashMap<String, List> ProdusePiata = new HashMap<>();
        ProdusePiata.put("Fructe", new ArrayList<String>(Arrays.asList("mere", "pere", "prune", "caise")));
        ProdusePiata.put("Legume", new ArrayList<String>(Arrays.asList("cartofi", "morcovi", "patrunjel", "fasole")));
        System.out.println(ProdusePiata);


            checkNewProdus("caise", ProdusePiata);
            checkNewProdus("fasole", ProdusePiata);
            checkNewProdus("dana", ProdusePiata);




    }
    public static void checkNewProdus(String produs, HashMap<String, List> ProdusePiata)
    {
        List<String> arrlist = ProdusePiata.get("Fructe");
        List<String> arrlistLegume = ProdusePiata.get("Legume");

        if (ProdusePiata.containsValue("[mere, pere, prune, caise]")) {
            System.out.println("Produs in HashMap exista deja");
        }

        if (arrlist.contains(produs)) {
            System.out.println("\nprodusul exista deja in piata");
        }
        else {
            arrlist.add(produs);
        }
        System.out.println(ProdusePiata.get("Fructe"));
    }

    public static void fromDani()
    {
        HashMap<String, List> ProdusePiata = new HashMap<>();
        ProdusePiata.put("Fructe", new ArrayList<String>(Arrays.asList("mere", "pere", "prune", "caise")));
        ProdusePiata.put("Legume", new ArrayList<String>(Arrays.asList("cartofi", "morcovi", "patrunjel", "fasole")));
        ProdusePiata.put("Extra", new ArrayList<String>(Arrays.asList("seminte", "ingrasamant", "scule", "obiecte")));

        System.out.println("\nCe produse doriti sa adaugati?: Fructe, Legume, Extra");
        Scanner produsnou = new Scanner(System.in);
        String pn = produsnou.nextLine();
        if (pn.equalsIgnoreCase("Fructe")){
            System.out.println("\nCe fruct doriti sa adaugati?");
            Scanner fructnou = new Scanner(System.in);
            String fructn = fructnou.nextLine();
            List<String> arrlist = ProdusePiata.get("Fructe");
            if (arrlist.contains(fructn)) {
                System.out.println("\nprodusul exista deja in piata");
            }
            else {
                arrlist.add(fructn);
            }
            System.out.println(ProdusePiata.get("Fructe"));}

        else if (pn.equalsIgnoreCase("Legume"))    {
            System.out.println("\nCe leguma doriti sa adaugati?");
            Scanner legumanou = new Scanner(System.in);
            String leguman = legumanou.nextLine();
            List<String> arrlist = ProdusePiata.get("Legume");
            if (arrlist.contains(leguman)) {
                System.out.println("\nprodusul exista deja in piata");
            }
            else {
                arrlist.add(leguman);
            }
            System.out.println(ProdusePiata.get("Legume"));

        } else if (pn.equalsIgnoreCase("Extra")) {
            System.out.println("\nCe produs extra doriti sa adaugati?");
            Scanner extranou = new Scanner(System.in);
            String extran = extranou.nextLine();
            List<String> arrlist = ProdusePiata.get("Extra");
            if (arrlist.contains(extran)) {
                System.out.println("\nprodusul exista deja in piata");
            }
            else {
                arrlist.add(extran);
            }
            System.out.println(ProdusePiata.get("Extra"));

        }
        else {
            System.out.println("\nnu ati ales o optiune valida");
        }
    }

}
