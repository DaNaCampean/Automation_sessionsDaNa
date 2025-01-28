package oop_ex1;

/*
2. Define a class Rectangle with the following properties:

length (double)
width (double)

Create a constructor to initialize the dimensions.

Write methods:
calculateArea() to return the area of the rectangle.

calculatePerimeter() to return the perimeter.

In the main method:

Create a Rectangle object with specific dimensions.

Print its area and perimeter by calling the methods.
 */


//SETTER SI GETTER SE FOLOSESTE DOAR PT PRIVATE STUFF

public class Rectangle {
    double length;
    double width;

 // CREEZI constructor
  public Rectangle (double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public void calculateArea()
    {
        double area = length * width;
        System.out.println(" Aria = " + area);
    }

    public void calculatePerimetera()
    {
        double perimeter = 2* (length + width);
        System.out.println(" Primeter  = " + perimeter);
    }

}
