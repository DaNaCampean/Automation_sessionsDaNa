package oop_learning;
/*
1. Create a Student Class

Define a class Student with the following properties:

name (String)

grade (int, private)

Use getters and setters for grade to ensure only valid grades (0 to 100) are allowed.

Write a method displayStudent() to print:

"Student: [name], Grade: [grade]"

In the main method:

Create a Student object.

Set the grade using the setter method.

Display the student details using displayStudent().



 */
//propreitati = variabile, metode = functii
/*
chestia de baza la oop este clasa.
clasa este cum se creeaza un obiect - blueprint
cand il instantiati , devine un obiect. cand instantiati iar, se creeaza alt obiect
o instanta se creeaza cu NEW

MYcAR ESTE OBIECTUL. OBIECTUL ESTE O INSTANTA A CLASEI car
clasa my car
instanta ai un cont, unde vrei sa poti baga bani, dar sa nu vezi cat are omul...folosesti doar setter, fara getter....
daca vrei sa vezi onctul numarul cuiva folosesti doar getter, ca nu vrei sa poti modifica ceea ce ai face cu setterul
nu trebe folosite ambele impreuna all time


daca
 */
/*

public class Car {
//properties
String make;
String model;
int gears;
int highestSpeed;
String color;
boolean leftHandSide;
String transmission;
//methods
//this method displays all the properties listed above of a Car object
public void displayCharacteristics() {
System.out.println("The car is a: " + make);
System.out.println("Color of the " + make + " is: " + color);
System.out.println("Model of the " + make + " is: " + model);
System.out.println("Number of gears of the " + make + " is: " + gears);
System.out.println("Highest speed of the " + make + " is: " + highestSpeed);
System.out.println("Is the " + make + " left hand sided: " + leftHandSide);
System.out.println("Transmission of the " + make + " is: " + transmission);
} /
/this method displays the initial color of the car, makes it brown, prints the new color, and
prints the new speed (+1) of the car
public void addOneToMaxSpeedAndMakeTheColorBrown() {
System.out.println("The color of the car is: " + color);
color = "brown";
System.out.println("The new color of the car is: " + color);
System.out.println("The new highest speed of the car is " + highestSpeed + 1);
} /
/a basic constructor
public Car() {
} /
/a custom constructor that only sets some of the properties
public Car(String constructor_make, String constructor_model, String constructor_color, boolean
constructor_leftHandSide) {
make = constructor_make;
model = constructor_model;
color = constructor_color;
leftHandSide = constructor_leftHandSide;
} /
/a different constructor that we will use in the 'addOneToMaxSpeedAndMakeTheColorBrown' method
public Car(String constructor_color, int constructor_highestspeed) {
color = constructor_color;
highestSpeed = constructor_highestspeed;
}
}public class CarTest {
public static void main (String[] args) {
//we make a Car object and initialize all its properties
Car Toyota = new Car();
Toyota.color = "blue";
Toyota.gears = 6;
Toyota.highestSpeed = 150;
Toyota.model = "Camry";
Toyota.leftHandSide = true;
Toyota.transmission = "Automatic";
//we use the display all characteristics method on the created car
Toyota.displayCharacteristics();
//we use the second constructor that only has some characteristics to
initialize a car object
Car BMW = new Car("BMW", "i5", "red", true);
//in order to use the method and see that only the initialized
characteristics are displayed, rest are 0 or null
BMW.displayCharacteristics();
//we use the third constructor that only needs the color and the high
speed, to change the color and the high speed of the car
Car someCar = new Car("red", 150);
someCar.addOneToMaxSpeedAndMakeTheColorBrown();
}
}



 */