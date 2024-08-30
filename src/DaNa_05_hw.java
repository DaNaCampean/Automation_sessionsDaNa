public class DaNa_05_hw {
 /*   Part 5

    Where to learn? Varianta 1 ( part 3.4) Varianta 2 (curs Alex Prodan) Varianta 3 (Udemy – chapters - Primitive Types Recap and the String Data Type) Java Strings & Java String Methods String class & String builder Java Regular Expressions & Pattern class

    Requirements:

            - String operations

    Checkpoint exercise(s) to be solved during meeting:

            1. Write a method reverseString(String str) that takes a string and returns it reversed.

            2. Write a method countVowels(String str) that counts the number of vowels (a, e, i, o, u) in a given string.

            3. Write a method areAnagrams(String str1, String str2) that checks if two given strings are anagrams (contain the same characters in a different order).

            4. Write a method replaceCharacter(String str, char oldChar, char newChar) that replaces all occurrences of oldChar with newChar in the given string.

            5. Write a method isPalindrome(String str) that checks if a given string is a palindrome (reads the same forwards and backwards).

            6. Write a method charFrequency(String str, char c) that takes a string and a character as input and returns the number of times the character appears in the string.

            7. Write a method isTermInList(List<String> list, String term) that checks if the list has an element containing the provided term.

8. Write a method areTermsInList(List<String> list, List<String> searchedTerms) that checks if the list has elements containing the provided terms.

            9. Write a method getFirstInteger(String text) that retrieves the first sequence of digits from a string.

            10. Write a method checkIfTextContainsTerms(String text, boolean ignoreCase, List<String> termsList) that checks if text contains all specified terms with an option to ignore case sensitivity.

11. Write a method insertStringInTextRepeatedly(String text, String stringToBeInserted, int distance) that will insert the given string in the specified text at every specified interval (distance).

            12. Write a method that checks if the given text contains any of the specified terms, with an option to ignore case sensitivity.

13. Write a method that will return a specified number of random elements from a given list.
}
 de la daniL
 public static void ex9(){
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

*/
