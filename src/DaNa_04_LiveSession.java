//
// exercise 3: Write a Java function that takes an integer as its parameter and returns
//   the greatest number that can be formed by moving the first digit to the last position.
public class DaNa_04_LiveSession {

    public static void main(String[] args)
    {

        System.out.println("MAX = "+ functie(1587));
    }
    public static int functie (int a){
        int max = a;
        int lungime = String.valueOf(a).length();
        System.out.println("lungime = " + lungime);
        int z=1;
        int b;
        int c;
        for (int i=1; i<lungime; i++){
            z=z*10; // in z calulez ce multiplu de 10 am nevoie ca sa scot prima cifra ex. a=4567 -> z=1000
            System.out.println("z= "+ z);
        }
        for (int i=1; i<= lungime; i++){
            b=a%z; // in b tin numarul fara prima cifra ex. a=453 -> b=53
            System.out.println("B = " + b);
            c=a/z;// in c scot prima cifra
            System.out.println("c = " + c);

            a=b*10+c; // reconstruiesc a din b si c
            System.out.println("A = " +a);

            if (a>max) {
                max=a;
                System.out.println("MA  = " +max);
            }
        }

        return max;
    }

}
