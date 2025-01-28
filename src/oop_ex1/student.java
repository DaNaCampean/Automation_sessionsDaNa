package oop_ex1;
/*1. Create a Student Class
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

public class student {

    String name;
    private int grade;
   // boolean value = true;
// constructorul pt varianta din main cu nota asta:
  public student(String name){
        this.name = name;
        //asta e constructor/ metoda simpla

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
      //  this.grade = grade;
      //  if (grade>0&& grade<=100) - var 1 cu 105 rez prost

        if (grade>0 && grade<=100)
        {
            this.grade = grade;
           // privetul nu se poate modifica in functie si de aia folosim setter, sa il modifica
            // fiind privat nu ai access la gradeul ala. doar in clasa student, nu mai ai in alte clase.
            //this.grade -= private grade de fept. si grade e ala din setter params


        }
        else {
            System.out.println("Grade must to be between 0 and 100");
            // aici nota ramane tot zero
            this.grade =grade;


         //   value= false;

        //    this.grade = -2;

        }
    }

    public void displayStudent()
    {
      //  if (value)
      //  if (grade!=-2)

      if(getGrade() < 0 || getGrade() > 100){
          System.out.println("Numele studentului este " + name + " si nota lui nu este intre 0 si 100!");
      }
      else{

          System.out.println("Numele studentului este " + name + " si nota lui este: " + grade);
      }}

        /*

        if (getGrade()<0&& getGrade()>100)

    {
        System.out.println("Student = "+ name + " Grade =" + grade);
        System.out.println("getter - Student = "+ name + " Grade =" + getGrade());
    }
        else
        {
            System.out.println("Student = "+ name + " Grade =" + " GRADE NU E VALID");
           // System.out.println("getter - Student = "+ name + " Grade =" + getGrade());
        }
        */






        // questions: de ce e zero? int daca nu il initializezi il face zero din start.

    }



