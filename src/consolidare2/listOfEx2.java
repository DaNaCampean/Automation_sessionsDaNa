package consolidare2;

public class listOfEx2 {

    /*



k - 1. problema pusa pe chat deja

k - 2. Write a Java program to find the k largest elements in a given array.
The parameters are: k and the array (both should be read from the console)

k - 3. Write a Java program:
- to read a string formed by digits
- check if the number is a positive number
- repeatedly add all its digits until the result has only one digit

k - Java Collection : ArrayList - Exercises:
4. Write a Java program to trim the capacity of an array list the current list size
5. Write a Java program how to Convert a ArrayList to HashSet

k - Java : String - Exercises
6. Write a program to String comparison using Collator and String classes
7. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement
8. Write a program to separate all tokens (words) using StringTokenizer

Java : DateTime - Exercises
9. Write a Java program to calculate the difference between two dates in days
10. Write a Java program to compute the difference between two datetime (Hours, Minutes, Milliseconds, Seconds and Nanoseconds)
11. Write a Java program to convert a string to date

Java : Lambda Expression - Exercises
12. Write a Java program using Lambda Expression to convert a list of strings to uppercase and lowercase
13. Write a Java program using Lambda Expression to remove duplicates from a list of integers
14. write a Java program using Lambda Expression to sort the strings based on their lengths in ascending order

k - Array List -Practice-IT
15. BJP5 Exercise 10.2: swapPairs:
Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"} your method should switch the first pair, "four", "score", the second pair, "and", "seven", and the third pair, "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}
If there are an odd number of values in the list, the final element is not moved. For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"} It would again switch pairs of values, but the final value, "hamlet" would not be moved, yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}
16. BJP5 Exercise 10.17: interleave:
Write a method called interleave that accepts two ArrayLists of integers a1 and a2 as parameters and inserts the elements of a2 into a1 at alternating indexes. If the lists are of unequal length, the remaining elements of the longer list are left at the end of a1. For example, if a1 stores [10, 20, 30] and a2 stores [4, 5, 6, 7, 8], the call of interleave(a1, a2); should change a1 to store [10, 4, 20, 5, 30, 6, 7, 8]. If a1 had stored [10, 20, 30, 40, 50] and a2 had stored [6, 7, 8], the call of interleave(a1, a2); would change a1 to store [10, 6, 20, 7, 30, 8, 40, 50].

Java : EnumSet Collection - Exercises:
k - 17. Write a Java program to get the size of the EnumSet collection
k - 18. Write a Java program to Remove Elements of an EnumSet collection that does not exist in another EnumSet collection

Java Collection : HashMap - Exercises:
k -19. Write a Java program to test if a map contains a mapping for the specified value

Java Collection : HashSet - Exercises
k - 20. Write a Java program to Check whether a HashSet contains a specified item or not



 1) Write a Java program to find the k largest elements in a given array.
parametrii sunt k (userul poate spune cate elemente vrea sa ii afiseze) si array-ul

2) Write a Java program to accept a positive number and repeatedly add all its digits until the result has only one digit.

3) Cea mai lunga secventa de numere (ramura) dintr-un arbore cu oricate ramuri (nu binar)
- arborele il dai tu intr-un fisier java cu liniute
- daca sunt 2 sau mai multe ramuri egale ca lungime sa se afiseze ramura care are suma tuturor numerelor ca mai mare
- daca sunt 2 sau mai multe ramuri egale ca lungime si ca suma sa se afiseze ramura care are cel mai mare numar ca radacina
- daca sunt 2 sau mai multe ramiri egale ca lungime si ca suma si au acelasi numar ca radacina si e cel mai mare, atunci alege pe cel care are cea mai mare a doua valoare
- pentru 4) e recursiv, daca si a doua valoare e egala in 2 ramuri, ia a treia valoare si vezi daca pe baza ei poti determina care ramura sa o afiseze; daca si a treia e egala, incerci a 4-a si asa mai departe
- daca ajungi la capatul arborelui pe cele 2 ramuri care s-ar putea sa indeplineasca amandoua toate criteriile (adica sunt ramuri cu numere duplicate, afiseaza arborele fara una dintre ramuri (a doua in ordine de la stanga la dreapta

Exemplu pt 1)

                                      3
							/		  | \  \   \   \
							2	      5	8  12  14  1
							|         |
						/   |   \    / | \
					  19    13   2   4 5  8
					                      |
										  3

lista de toate:
3 2 19
3 2 13
3 2 2
3 5 4
3 5 5
3 5 8 3
3 8
3 12
3 14
3 1


se va afisa 3 -> 5 -> 8 -> 3

2) ramuri egale:
                                      3
							/		  | \  \   \   \
							2	      5	8  12  14  1
							|         |
						/   |   \    / | \
					  19    13   2   4 5  8
3 -> 2 -> 19 -> suma e 24
3 -> 2 -> 13 -> suma e 18
3 -> 2 -> 2 -> suma e 7
3 -> 5 -> 4 -> suma e 12
3 -> 5 -> 5 -> suma e 13
3 -> 5 -> 8 -> suma e 16

se va afisa 3 -> 2 -> 19

3) sume egale si recursivitatea.
3.1)
                                      3
							/		  | \  \   \   \
							2	      5	8  12  14  1
							|         |
						/   |   \    / | \
					  19    13   2   16 5  8

se va afisa ramura care are radacina cea mai mare
3 -> 2 -> 19 -> suma e 24
3 -> 2 -> 13 -> suma e 18
3 -> 2 -> 2 -> suma e 7
3 -> 5 -> 16 -> suma e 24
3 -> 5 -> 5 -> suma e 13
3 -> 5 -> 8 -> suma e 16

sunt doua ramuri cu suma egala 24 si cea mai mare
3 -> 2 -> 19 -> suma e 24
3 -> 5 -> 16 -> suma e 24

3 e identica ca radacina, dar 2 < 5 si deci afisezi 3 -> 5 -> 16

3.2) negative testing: ai sume identice, dar nu e cea mai mare
                                      3
							/		  | \  \   \   \
							2	      5	8  12  14  1
							|         |
						/   |   \    / | \
					  19    20   2   16 5  8
3 -> 2 -> 19 -> suma e 24
3 -> 2 -> 2 -> suma e 7
3 -> 2 -> 20 -> suma e 25
3 -> 5 -> 16 -> suma e 24
3 -> 5 -> 5 -> suma e 13
3 -> 5 -> 8 -> suma e 16

Fara sa intre in codul de verificat care radacina e cea mai mare iti va afisa: 3->2->20

3.3) arbore cu 2 ramuri identice care sunt cele mai lungi si sunt duplicate
                                      3
							/		  | \  \   \   \
							2	      5	8  12  14   2
							|         |             |
						/   |   \    / | \
					  19    13   2   6 5  8        19
3 -> 2 -> 19 -> suma e 24
3 -> 2 -> 13 -> suma e 18
3 -> 2 -> 2 -> suma e 7
3 -> 5 -> 6 -> suma e 14
3 -> 5 -> 5 -> suma e 13
3 -> 5 -> 8 -> suma e 16
3 -> 2 -> 19 -> suma e 24

deci 3 -> 2 -> 19 e duplicata si are cea mai mare suma
afisezi arborele
									  3
							/		  | \  \   \
							2	      5	8  12  14
							|         |
						/   |   \    / | \
					  19    13   2   6 5  8

nota: nu am scris dar si 3 -> 8 si 3 -> 12 si 3 -> 14 sunt ramuri numai ca nu le-am mai scris mai sus

3.4) duplicate dar fara suma cea mai mare:
                                      3
							/		  | \  \   \   \
							2	      5	8  12  14   2
							|         |             |
						/   |   \    / | \
					  19    20   2   6 5  8        19

aici va afisa 3 -> 2 -> 20 si nu va scoate ramura duplicata.



     */
}
