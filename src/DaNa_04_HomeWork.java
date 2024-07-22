


    /*Array
1. Write a Java program to find the index of a specific array element.
    1. The element should be the parameter of the method.
    2. Return the index found.
2. Write a program to calculate the average value of array elements.
    1. The array should be the parameter of the method.
    2. Return the average.
3. Write a Java program to insert an element at a specific position into an array.
    1. The specific position should be the parameter of the method.
    2. Return the new array.
4. Write a Java program to find the minimum value of an array.
    1. The array should be the parameter of the method.
    2. Return the min value found.
5. Write a Java program to find duplicate values in an array of String.
    1. The array of strings should be the parameter of the method.
    2. Return the duplicated values as array.
6. Write a Java program to check if an array of integers does not contain x and y.
    1. x, y and the array should be the parameters of the method
    2. Return true or false.
 */

    import java.sql.Array;
    import java.util.Objects;
    import java.util.Scanner;
    public class DaNa_04_HomeWork {

        public static void main(String[] args)
        {
           // arrayExercise1(); //index of an element from Array String
           // arrayExercise2(); // average of the elements of an Array Int
            //arrayExercise3();
            //arrayExercise4();
            arrayExercise5();
           // arrayExercise6();

        }
        public static void arrayExercise1()
        {
            /*
            Write a Java program to find the index of a specific array element.
                1. The element should be the parameter of the method.
                2. Return the index found.
             */

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
            for (int i=0;i<myArray.length;i++)
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
        }

        public static void arrayListExercises()
        {

        }
        public static void hashMapExercises()
        {

        }
    }

