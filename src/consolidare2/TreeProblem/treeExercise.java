package consolidare2.TreeProblem;


import java.util.ArrayList;
import java.util.HashMap;

public class treeExercise {

    public static HashMap<String,ArrayList<String>> myHashMap = new HashMap<>();
        public static void main (String[] args) {
            System.out.println("The content of the file is:");
            // readFile readFile1 = new readFile();
            ArrayList<String> myArrayList = readFile.readFileMethod();

            System.out.println("Tree Formatted: ");
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


          //  System.out.println("keys:");
          //  System.out.println(myHashMap.keySet());
         //   System.out.println("values = "+myHashMap.values());

            HashMap<String,Integer> myHashMalLung = new HashMap<>();
            HashMap<String,Integer> myHashMalSuma = new HashMap<>();

            int lung = 0;
            for (int i=0;i<myHashMap.size();i++)
            {
                lung = (myHashMap.get("route"+i)).size();
              //  System.out.println("LUNG = "+lung);
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
          //  System.out.println("MAX KEY = " + keyForLung);
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
                myArrayList= forMethode(myArrayList,hashKeyNr);
                routesNumber++;
                 hashKeyNr++;
             }
            System.out.println("NUmberOfRoutes = " + routesNumber);










         /*   ArrayList<Integer> nrNiveleList = new ArrayList<>();
            nrNiveleList = nrNivele(myArrayList);
            System.out.println("ARRAY LIST NIVELE = " +nrNiveleList);
            ArrayList<Integer> route1 = null, route2, route3, route4,route5,route6,route7 = new ArrayList<>();
            int listLen = nrNiveleList.size();
            System.out.println("LEN = "+ listLen);
            int i1,i2,i3, radacina;
            radacina=nrNiveleList.get(0);
            route1.add(radacina);
            for (int i=1;i<listLen;i++)
            {

              if (nrNiveleList.get(i)==1)
                {
                    route1.add(nrNiveleList.get(i));
                }
              else
              {
                  if (nrNiveleList.get(i)>nrNiveleList.get(i-1))
                  {
                      route1.add(nrNiveleList.get(i));
                  }
                  else
                  {

                  }
              }

            }*/





        }
        public static ArrayList<Integer> nrNivele (ArrayList<String> myArrayList)
        {
            ArrayList<Integer> nrNiveleList = new ArrayList<>();
           // System.out.println("Suntem in nivele");
            for (String s:myArrayList)
            {
               // System.out.println("avem nivelele: " + charFrequency(s,'-'));
                nrNiveleList.add(charFrequency(s,'-'));
            }

        return nrNiveleList;
        }


    public static ArrayList<String> forMethode (ArrayList<String> myArrayList, int hashKeyNr)
    {

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
                }
                else {
            //        System.out.println("String = " + s);
            //        System.out.println("Freq = " + frequency);
            //        System.out.println("nivele = " + nivele);

                    for (int j = frequency; j < nivele; j++)
                    {
                        myArrayList.remove(frequency);
                    }

                    break;
                }
            }
          //  System.out.println("route="+treeRoute);
            for (String s:treeRoute)
            {

            //    System.out.println("s===" +s);
                s=s.replace("-","");
            //    System.out.println("s replaced?=" +s);
                treeRouteNew.add(s);
            }
          //  System.out.println("new array = " + myArrayList);
            myHashMap.put("route"+hashKeyNr, treeRouteNew);


return myArrayList;

    }
    public static int charFrequency(String str, char c) {
        //System.out.println("String = " + str);
       // System.out.println("Char = " + c);
        int numberOfApparence = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c) {
                numberOfApparence = ++numberOfApparence;
            }
        //System.out.println("The character \"" + c + "\" appears " + numberOfApparence + " times in \"" + str + "\"");
        return numberOfApparence;
    }



/*
// 6. Write a method charFrequency(String str, char c) that takes a string and a character
                // as input and returns the number of times the character appears in the string.
                // charFrequency("danutaazika", 'a');
          //  System.out.println(data);
           // System.out.println("SPLIT = ");
            //charFrequency(data,'-');


            String[][] matrice;
            matrice = new String[2][2];

            int maxNivele = 0;
            for (String s:myArrayList)
            {
                System.out.println("d= "+ s);
                if (maxNivele<s.length())
                {
                    maxNivele = s.length();
                }

            }
            System.out.println("NR niveluri = " + maxNivele);
        }

        public static void charFrequency(String str, char c)
        {
            System.out.println("String = " + str);
            System.out.println("Char = "+ c);
            int numberOfApparence = 0;
            for (int i=0;i<str.length();i++)
                if (str.charAt(i) == c) {
                    numberOfApparence = ++numberOfApparence;
                }
            System.out.println("The character \"" + c+ "\" appears " + numberOfApparence + " times in \"" + str + "\"" );
*/





}
