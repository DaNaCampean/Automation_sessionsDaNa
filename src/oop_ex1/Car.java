package oop_ex1;
/*
3.Define a class Car with the following properties:
brand (String)
model (String)
year (int)

Create a constructor to initialize all properties.

Write a method displayDetails() that prints:

"This car is a [year] [brand] [model]."

Create multiple Car objects and call displayDetails() for each.
 */
public class Car {

    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails()
    {
        System.out.println("This car is a " + year + " " + brand + " " + model + ".");

    }


}
