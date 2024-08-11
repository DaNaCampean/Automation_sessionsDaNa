package Session4_Array_ArrayList_HashMap;

/*
ArrayList
1. All the exercises from the Arrays section should be redo using ArrayList.

1.1. Write a Java program to find the index of a specific array element.
    1. The element should be the parameter of the method.
    2. Return the index found.
1.2. Write a program to calculate the average value of array elements.
    1. The array should be the parameter of the method.
    2. Return the average.
1.3. Write a Java program to insert an element at a specific position into an array.
    1. The specific position should be the parameter of the method.
    2. Return the new array.
1.4. Write a Java program to find the minimum value of an array.
    1. The array should be the parameter of the method.
    2. Return the min value found.
1.5. Write a Java program to find duplicate values in an array of String.
    1. The array of strings should be the parameter of the method.
    2. Return the duplicated values as array.
1.6. Write a Java program to check if an array of integers does not contain x and y.
    1. x, y and the array should be the parameters of the method
    2. Return true or false.

2. Write a Java program to join two array lists.
    1. The array lists should be the parameters of the methods
    2. Return the new list.


 */

import java.util.Scanner;

public class HashMap {
}
/*
    public class ArrayList {

        public static void main(String[] args)
        {
            arrayListExercises();
        }
        public static void arrayExercise1()
        {
            /*
            Write a Java program to find the index of a specific array element.
                1. The element should be the parameter of the method.
                2. Return the index found.
             */

  /*          System.out.println("-------EXERCISE 1------");
            Scanner myScanner = new Scanner(System.in);
            String user_input;
            int array_len=-1;

            String[] array_string = new String[100]; //array original, to be able to calculate the length.
            System.out.println("Enter an array. After Every word(element), press enter.\n When you want to end the array, please press enter -");
            do {
                user_input =  myScanner.nextLine();
                array_len++;
                array_string[array_len] = user_input;
            }while(!user_input.equals("-"));
            System.out.println("Array length = "+ array_len);
            String[] copy_array = new String[array_len];// I created a new array, where I will copy the first one, to eliminate empty indexes
            for (int i=0;i<array_len;i++)
            {
                copy_array[i] = array_string[i];
            }
            System.out.println("ARRAY LENGTH IS = "+ copy_array.length);
            System.out.println("Enter the element for finding it's index/position:");
            String array_element = myScanner.nextLine();
            int index_element =findIndexOfArrayElement(copy_array,array_element);
            if (index_element==-1)
                System.out.println("YOUR element is not in the array.");
            else
                System.out.println("The index of the specified element is = " + index_element);

        }
        public static int findIndexOfArrayElement(String[] myArray, String element)
        {
            int indexElement = -1;
            for (int i=0;i<myArray.length;i++)
            {

                if (myArray[i].equals(element))
                {
                    System.out.println("pozitia este = "+ i);
                    indexElement = i;
                    break;
                }



            }
            return indexElement;
        }

        public static void arrayExercise2()
        {
//           exercise 2. Write a program to calculate the average value of array elements.
//                1. The array should be the parameter of the method.
//                2. Return the average.
            System.out.println("EXERCISE 2 - Average value of array elements");
            Scanner myScanner = new Scanner(System.in);
            System.out.println("What length you want the array to have?");
            int array_len = myScanner.nextInt();
            int[] array_int = new int[array_len];
            System.out.println("Enter an array of int, separated by enter.");
            for(int i=0;i<array_len;i++)
                array_int[i]=myScanner.nextInt();

            System.out.println("THE AVERAGE IS = " + average_array(array_int));

        }

        public static int average_array(int[] array_int)
        {
            int average_array=0;
            for (int i=0; i<array_int.length;i++)
            {
                average_array = average_array + array_int[i];

            }

            return average_array/array_int.length;
        }
        public static void arrayExercise3()
        {
//           exercise 3. Write a Java program to insert an element at a specific position into an array.
//                1. The specific position should be the parameter of the method.
//                2. Return the new array.
            System.out.println("EXERCISE 3\n ");
            int[] array_int = {1,2,3,5};
            int[] array_new = new int[array_int.length+1];
            array_new = insertMethode(array_int,4,3);
            System.out.println("NEW ARRAY =");
            for (int i=0;i<array_new.length;i++)
                System.out.print(array_new[i] + " ");





        }

        public static int[] insertMethode(int[] array_int, int element, int position)
        {
            int[] array_int_new = new int[array_int.length+1];
            int j=0;

            for (int i=0;i<(array_int.length+1);i++)
            {
                if (i == position)
                {

                    array_int_new[i]=element;

                }
                else {
                    //if (found_pozition)
                    //  System.out.println("found poz");
                    array_int_new[i] = array_int[j];
                    j++;
                }
            }

            return array_int_new;
        }


        public static void arrayExercise4()
        {
            //           exercise 4. Write a Java program to find the minimum value of an array.
//               1. The array should be the parameter of the method.
//               2. Return the min value found.

            System.out.println("EXERCISE 4: Write a Java program to find the minimum value of an array.\n" +
                    "//               1. The array should be the parameter of the method.\n" +
                    "//               2. Return the min value found.");

            System.out.println("Please enter a list of numbers, to find out the minimum of the elements.\n Separate the numbers by space.");
            Scanner myScanner = new Scanner(System.in);
            String user_input = myScanner.nextLine();
            System.out.println("You entered: " + user_input);
            String[] myArray = user_input.split("[\\s]"); // where the "[\\s]" is the regex for space. split syntax is split(regex)
           /* Another variant of the for below
            for (String str : myArray) {
               System.out.println(str);
            }
            */
   /*         for (int i=0;i<myArray.length;i++)
            {
                System.out.println(myArray[i] + " ");
            }
            System.out.println("lungimea array = "+ myArray.length);
            System.out.println("The minimum value is: " + minimumOfArray(myArray));

        }
        public static int minimumOfArray(String[] myArray)
        {
            int min = Integer.parseInt(myArray[0]);
            for (int i=1;i<myArray.length;i++)
            {
                if (min>Integer.parseInt(myArray[i]))
                    min = Integer.parseInt(myArray[i]);


            }
            return min;
        }
        public static void arrayExercise5()
        {
//           exercise 5. Write a Java program to find duplicate values in an array of String.
//                1. The array of strings should be the parameter of the method.
//               2. Return the duplicated values as array.
            String[] myArray = {"dana", "didi", "dana", "dana", "didi","Conan", "Conan"};
            String[] duplicates = duplicateValues(myArray);

            System.out.print("DUPLICATE array is:");
            for (String s:duplicates)
                System.out.print(s+ " ");


        }
        public static String[] duplicateValues(String[] myString)
        {
            System.out.print("MyArray = ");
            for (String s:myString)
            {
                System.out.print(s + " ");
            }
            System.out.println("");
            String[] newArray = new String[myString.length];


            for (int k=0;k<myString.length;k++)
            {
                String isDuplicate = myString[k];

                if (isDuplicate==null)
                    continue;
                else
                {
                    for (int i=k+1;i<myString.length;i++)
                    {
                        if (isDuplicate.equals(myString[i]))
                        {
                            newArray[k] = isDuplicate;
                            myString[i] = null;

                            //  j++;

                        }
                        else
                        {
                            continue;
                        }
                    }
                }


            }

            // for(String s: myString)
            // System.out.println("\nold = "+ s);
            int newArray_length=0;
            for(String s: newArray)
            {
                //System.out.println("NEW = "+ s);
                if (s!=null)
                    newArray_length ++;
            }


            String[] duplicate_array = new String[newArray_length];
            int j=0;
            for(int i=0;i<newArray.length;i++)
            {
                if (newArray[i]!=null)
                {duplicate_array[j] = newArray[i];
                    j++;}
            }

            for(String s:duplicate_array)
                System.out.println("THIS = "+s);
            return duplicate_array;
        }

        public static String readString ()
        {
            Scanner myScanner = new Scanner(System.in);
            String user_input_string = myScanner.nextLine();
            myScanner.close();
            return user_input_string;

        }

        public static void arrayExercise6()
        {
//          exercise  6. Write a Java program to check if an array of integers does not contain x and y.
//               1. x, y and the array should be the parameters of the method
//               2. Return true or false.
            System.out.println("exercise  6:" +
                    " Write a Java program to check if an array of integers does not contain x and y.\n" +
                    "               1. x, y and the array should be the parameters of the method\n" +
                    "               2. Return true or false.");
            int[] myArray = {1,2,3,4,5,6,7};
            int x=8,y=1;
            boolean doesNotContain = doesNotContain(myArray, x,y);

            if (doesNotContain ==true)
                System.out.println(" The array contain " + x + " and " + y);
            else
                System.out.println(" The array does NOT contain " + x + " and " + y);



        }

        public static boolean doesNotContain(int[] myArray, int x, int y)
        {
            boolean finalResult = false;
            boolean containX = false;
            boolean containY = false;
            for(int s:myArray)
            {
                if (x==s) containX = true;
                if (y==s) containY = true;


            }

            if (containY && containX == true)
                finalResult = true;


            return finalResult;

        }
        /*Array


       4. Write a Java program to find the minimum value of an array.
           1. The array should be the parameter of the method.
           2. Return the min value found.
       5. Write a Java program to find duplicate values in an array of String.
           1. The array of strings should be the parameter of the method.
           2. Return the duplicated values as array.


           */

 /*       public static void arrayListExercises()
        {
            // arrayListExercise7(); // EX7: Write a Java program to join two array lists; 1. The array lists should be the parameters of the methods; 2. Return the new list.
            //arrayListExercise6(); //6. Write a Java program to check if an array of integers does not contain x and y.
            // 1. x, y and the array should be the parameters of the method
            //    2. Return true or false.
            // arrayListExercise5();
            // arrayListExercise4();
            //arrayListExercise3(); //3. Write a Java program to insert an element at a specific position into an array.
            //    1. The specific position should be the parameter of the method.
            //    2. Return the new array.
            //arrayListExercise2(); // EX2: Write a program to calculate the average value of array elements;
            // 1. The array should be the parameter of the method;
            // 2. Return the average.
            //arrayListExercise1(); // 1. Write a Java program to find the index of a specific array element.
            //           1. The element should be the parameter of the method.
            //           2. Return the index found.

            // HashMap
            //1. Write a Java program to add a specific value with a specific key in a HashMap
            // 1. The key and value should be the parameters of the method.
            //2. Return the hasp map.
            hashMapExercise1();

        }

        public static void hashMapExercise1()
        {
            // Create a HashMap object called capitalCities
            HashMap<String, String> capitalCities = new HashMap<String, String>();

            // Add keys and values (Country, City)
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");
            System.out.println(capitalCities);

            System.out.println("GET = "+ capitalCities.get("England"));
            System.out.println("GET = "+ capitalCities.get("London"));

        }

        public static void arrayListExercise6()
        {
            java.util.ArrayList<String> myArray = new java.util.ArrayList<String>();
            for (int i=0;i<5;i++)
                myArray.add("dana"+i);

            System.out.println("\nfor EACH () : ");
            //  numbers.forEach( (n) -> { System.out.println(n); } );
            myArray.forEach( (n) ->
            {
                System.out.print(n + " ");

            } );
            if ((myArray.contains("dana1")) && (myArray.contains("dana29")))
                System.out.println("\nCONTAINSSSSSSS");
            else
                System.out.println("\nNU LE CONTINE BOTH");

        }


        public static void arrayListExercise1()
        {
            java.util.ArrayList<String> myArray = new java.util.ArrayList<String>();
            for (int i=0;i<5;i++)
                myArray.add("dana"+i);
            System.out.println("OLD STRING IS:");
            for (String s: myArray)
                System.out.print(s + " ");

            System.out.println("ESTE SAU NU: "+ myArray.contains("dana1"));

            myArray.add(1, "TEXT");
            System.out.println("\nNEW STRING IS:");
            for (String s: myArray)
                System.out.print(s + " ");

            System.out.println("\nINDEX OF: "+ myArray.indexOf("dana1"));

            System.out.println("\nfor EACH () : ");
            myArray.forEach((n) -> System.out.print(n + " "));





        }
        public static void arrayListExercise2()
        {
//           exercise 2. Write a program to calculate the average value of array elements.
//                1. The array should be the parameter of the method.
//                2. Return the average.
            System.out.println("EXERCISE 2 - Average value of arrayList elements");
            Scanner myScanner = new Scanner(System.in);
            java.util.ArrayList<Integer> myArrayList = new java.util.ArrayList<>();
            System.out.println("Enter two numbers to find the average.\n Press y when asked, if you want to enter more numbers. ");
            myArrayList.add(myScanner.nextInt());
            myArrayList.add(myScanner.nextInt());
            myScanner.nextLine();
            boolean addMore= true;
            String yesNo;
            while (addMore)
            {
                System.out.println("Do you want to add more numbers? Enter y if you want, anything else if you don't");
                yesNo = myScanner.nextLine();
                if (yesNo.equalsIgnoreCase("y")) {
                    System.out.println("Please enter a number:");
                    myArrayList.add(myScanner.nextInt());
                    myScanner.nextLine();
                }
                else
                    addMore = false;
            }

            System.out.println("THE AVERAGE IS = " + average_arrayList(myArrayList));


        }

        public static double average_arrayList(java.util.ArrayList<Integer> array_list)
        {
            int average_arrayList=0;
            for (int i=0; i<array_list.size();i++)
            {
                average_arrayList = average_arrayList + array_list.get(i);

            }

            double arrayListSize = array_list.size();
            return average_arrayList/arrayListSize;
        }

        public static void arrayListExercise3()
        //3. Write a Java program to insert an element at a specific position into an array.
        //    1. The specific position should be the parameter of the method.
        //    2. Return the new array.

        {
            java.util.ArrayList<String> myArray = new java.util.ArrayList<String>();
            for (int i=0;i<5;i++)
                myArray.add("dana"+i);
            System.out.println("OLD STRING IS:");
            for (String s: myArray)
                System.out.print(s + " ");

            myArray.add(1, "TEXT");
            System.out.println("\nNEW STRING IS:");
            for (String s: myArray)
                System.out.print(s + " ");




        }
        public static void arrayListExercise7()
        {
            java.util.ArrayList<String> myArray1 = new java.util.ArrayList<String>();
            java.util.ArrayList<String> myArray2 = new java.util.ArrayList<String>();

            for (int i=1;i<11;i++)
            {
                myArray1.add("dana"+i);
                myArray2.add("second"+i);
            }
            System.out.println("Array1:");
            for (String i : myArray1) {
                System.out.println(i);
            }
            System.out.println("Array2:");
            for (String i : myArray2) {
                System.out.println(i);
            }

            java.util.ArrayList<String> finalJoinedArrayList = new java.util.ArrayList<String>();
            finalJoinedArrayList = joinNewArrayList(myArray1, myArray2);
            System.out.print("\nThe joined array List is: ");
            for (String s: finalJoinedArrayList)
                System.out.print(s+ " ");



        }
        public static java.util.ArrayList<String> joinNewArrayList(java.util.ArrayList<String> myArray1, java.util.ArrayList<String> myArray2)
        {

            //Variant 1
            java.util.ArrayList<String> finalArrayList = new java.util.ArrayList<String>();
          /*
           for (String i : myArray1)
               finalArrayList.add(i);
           for (String i: myArray2)
               finalArrayList.add(i);

            System.out.println("Final ArrayList:");
            for (String i : finalArrayList)
                System.out.print(i + " ");
            return finalArrayList;
            */
            //Variant 2:
   /*         myArray1.addAll(myArray2);
            for (String i : myArray1)
                System.out.print(i + " ");
            return  myArray1;


        }


     /*   public static void arrayListExercise1()
        {
            /*
            Write a Java program to find the index of a specific array element.
                1. The element should be the parameter of the method.
                2. Return the index found.


            System.out.println("-------EXERCISE 1------");
            Scanner myScanner = new Scanner(System.in);
            String user_input;
            int array_len=-1;

            String[] array_string = new String[100]; //array original, to be able to calculate the length.
            System.out.println("Enter an array. After Every word(element), press enter.\n When you want to end the array, please press enter -");
            do {
                user_input =  myScanner.nextLine();
                array_len++;
                array_string[array_len] = user_input;
            }while(!user_input.equals("-"));
            System.out.println("Array length = "+ array_len);
            String[] copy_array = new String[array_len];// I created a new array, where I will copy the first one, to eliminate empty indexes
            for (int i=0;i<array_len;i++)
            {
                copy_array[i] = array_string[i];
            }
            System.out.println("ARRAY LENGTH IS = "+ copy_array.length);
            System.out.println("Enter the element for finding it's index/position:");
            String array_element = myScanner.nextLine();
            int index_element =findIndexOfArrayElementList(copy_array,array_element);
            if (index_element==-1)
                System.out.println("YOUR element is not in the array.");
            else
                System.out.println("The index of the specified element is = " + index_element);

        }
        public static int findIndexOfArrayElementList(String[] myArray, String element)
        {
            int indexElement = -1;
            for (int i=0;i<myArray.length;i++)
            {

                if (myArray[i].equals(element))
                {
                    System.out.println("pozitia este = "+ i);
                    indexElement = i;
                    break;
                }



            }
            return indexElement;
        }


        public static void arrayListExercise2()
        {
//           exercise 2. Write a program to calculate the average value of array elements.
//                1. The array should be the parameter of the method.
//                2. Return the average.
            System.out.println("EXERCISE 2 - Average value of arrayList elements");
            Scanner myScanner = new Scanner(System.in);
            ArrayList<Integer> myArrayList = new ArrayList<>();
            System.out.println("Enter two numbers to find the average.\n Press y when asked, if you want to enter more numbers. ");
            myArrayList.add(myScanner.nextInt());
            myArrayList.add(myScanner.nextInt());
            myScanner.nextLine();
            boolean addMore= true;
            String yesNo;
            while (addMore)
            {
                System.out.println("Do you want to add more numbers? Enter y if you want, anything else if you don't");
                yesNo = myScanner.nextLine();
                if (yesNo.equals("y")) {
                    System.out.println("Please enter a number:");
                    myArrayList.add(myScanner.nextInt());
                    myScanner.nextLine();
                }
                else
                    addMore = false;
            }

            System.out.println("THE AVERAGE IS = " + average_arrayList(myArrayList));


        }

        public static double average_arrayList(ArrayList<Integer> array_list)
        {
            int average_arrayList=0;
            for (int i=0; i<array_list.size();i++)
            {
                average_arrayList = average_arrayList + array_list.get(i);

            }

            double arrayListSize = array_list.size();
            return average_arrayList/arrayListSize;
        }
        public static void hashMapExercises()
        {

        }

    }


}
*/


