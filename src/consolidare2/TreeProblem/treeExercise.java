package consolidare2.TreeProblem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class treeExercise {

    /* declared a global HashMap, called myHashMap, where I added all the routes that can be formed by the tree:
       - key: string, named "route" + NUMBER. EG: "route1", route2", etc
       - values: an Array list, with all the numbers from the route: root and nodes/ childs
       - eg: "route1" = {3,5,66}
    */

    public static HashMap<String,ArrayList<String>> myHashMap = new HashMap<>();

    public static int charFrequency(String str, char c) {
       /* calculates and return the number of frequency of a char "c", in string "str".
        I am using this for calculating how many "-" I have in the tree, for determine the level from the tree:
         - no "-" means the root.
         - one line "-" means level 1
         - two lines "--" means level 2
         - etc
        */

        int numberOfApparence = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c) {
                numberOfApparence = ++numberOfApparence;
            }

        return numberOfApparence;
    }

    public static void createRoute (ArrayList<String> myArrayList)
    {
        //   System.out.println("my array is: " + myArrayList);

        int listLen = myArrayList.size();
        //  System.out.println("LEN = "+ listLen);
        int hashKeyNr = 0;
        int routesNumber=0;
        while (listLen>2)
        {

            listLen = myArrayList.size();
            System.out.println("my array is: " + myArrayList);
            myArrayList= forMethode(myArrayList,hashKeyNr);
            routesNumber++;
            hashKeyNr++;
        }
        System.out.println("NUmberOfRoutes = " + routesNumber);
    }

    public static ArrayList<String> forMethode (ArrayList<String> myArrayList, int hashKeyNr)
    {
        System.out.println("ENTER FOR METHIOD");


        ArrayList<String> treeRoute = new ArrayList<>();
        ArrayList<String> treeRouteNew = new ArrayList<>();

        int frequency =0;
        int nivele = 0;
        for (String s:myArrayList)
        {
            frequency = charFrequency(s,'-');

            if (frequency==nivele)
            {
                treeRoute.add(s);
                nivele++;
                System.out.println("TREE ROOT = " + treeRoute);
            }
            else
            {
                System.out.println("freq = "+ frequency + " niv = "+ nivele);
                for (int j = frequency; j < nivele; j++)
                {
                    myArrayList.remove(frequency);
                }
                System.out.println("BREAKKKK");
                break;
            }
        }

        for (String s:treeRoute)
        {


            s=s.replace("-","");

            treeRouteNew.add(s);
        }

        myHashMap.put("route"+hashKeyNr, treeRouteNew);


        return myArrayList;

    }

        public static void main (String[] args) {
            System.out.println("The content of the file is:");
            // readFile readFile1 = new readFile();
            ArrayList<String> myArrayList = readFile.readFileMethod();

            System.out.println("Tree Formatted(this is hardcoded. if you edit the file, you need also to edit this): ");
            System.out.println(
                    " \t\t\t\t\t\t\t          3\n" +
                    "\t\t\t\t\t\t\t/\t\t  | \\  \\   \\   \\\n" +
                    "\t\t\t\t\t\t\t2\t      5\t8  12  14  1\n" +
                    "\t\t\t\t\t\t\t|         |\n" +
                    "\t\t\t\t\t\t/   |   \\    / | \\\n" +
                    "\t\t\t\t\t  19    13   2   4 5  4\n" +
                    "\t\t\t\t\t                   |  |\n" +
                    "\t\t\t\t\t                   2  3\n");
            createRoute(myArrayList);
            System.out.println("HASHHHHH = " + myHashMap);


            HashMap<String,Integer> myHashMalLung = new HashMap<>();
            HashMap<String,Integer> myHashMalSuma = new HashMap<>();

            int lung = 0;
            for (int i=0;i<myHashMap.size();i++)
            {
                lung = (myHashMap.get("route"+i)).size();
                myHashMalLung.put("route"+i, lung);
                int sum=0;
                for (int t=0;t<lung;t++)
                {
                    sum= sum+ Integer.parseInt(myHashMap.get("route"+i).get(t));
                }
                myHashMalSuma.put("route"+i, sum);


            }



            System.out.println("HASH original= "+ myHashMap);
            System.out.println("NEW HAS lung= "+ myHashMalLung);
            System.out.println("NEW HAS suma= "+ myHashMalSuma);

            // Cea mai lunga secventa de numere (ramura) dintr-un arbore cu oricate ramuri (nu binar)
            System.out.println("Cea mai lunga secventa de numere (ramura) dintr-un arbore cu oricate ramuri");


            ArrayList<String> rutaEgalaLung = new ArrayList<>();

            String keyForLung="";
            int max=0;
            for (int i=0;i<myHashMalLung.size();i++)
            {
                if (myHashMalLung.get("route"+i)>max)
                {
                    max=myHashMalLung.get("route"+i);
                    keyForLung = "route"+i;
                }

            }

            System.out.println("MAX LEN OF ROUTE IS: " + max);

            for (int i=0;i<myHashMalLung.size();i++)
            {
                if (myHashMalLung.get("route"+i)==max)
                {
                    rutaEgalaLung.add("route"+i);

                }

            }
            System.out.println("Rute Egale = "+rutaEgalaLung );



            // daca sunt 2 sau mai multe ramuri egale ca lungime sa se afiseze ramura care are suma tuturor numerelor ca mai mare
            System.out.println("daca sunt 2 sau mai multe ramuri egale ca lungime sa se afiseze ramura care are suma tuturor numerelor ca mai mare");

            ArrayList<String> rutaEgalaSuma = new ArrayList<>();
            String keyForSum="";
            int sum=0;

            if (rutaEgalaLung.size()>1)
            {

                for (int i=0;i<rutaEgalaLung.size();i++)
                {
                 //   System.out.println("zzzz = " + rutaEgalaLung.get(i));

                    if (myHashMalSuma.get(rutaEgalaLung.get(i))>sum)
                    {
                        sum =myHashMalSuma.get(rutaEgalaLung.get(i));
                        keyForSum = rutaEgalaLung.get(i);
                    }

                }

            }
          //  System.out.println("MAX sum KEY = " + keyForSum);
            System.out.println("MAX sum OF ROUTE IS: " + sum);

            for (int i=0;i<rutaEgalaLung.size();i++)
            {
                if (myHashMalSuma.get(rutaEgalaLung.get(i))==sum)
                {
                    rutaEgalaSuma.add(rutaEgalaLung.get(i));

                }

            }
            System.out.println("Rute Egale SUM = "+rutaEgalaSuma );
        }






}
