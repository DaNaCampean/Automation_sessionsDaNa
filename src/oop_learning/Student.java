package oop_learning;

public class Student {

   String name;
   private int grade;

   public Student(String n)
   {
       name = n;

   }

   public int getGrade()
   {
       System.out.println("Getting the stdents grade:" + grade);
       return grade;
   }
// daca pui /** si dai enter, iti creeaza frumos un pic de documentatie, cu anumite hinturi ca sa pun eu info acolo.
    /**
     * Set the grade of the Student
     * @param g - the actual grade
     */
   public void setGrade(int g)
   {
       if (g<=10 && g>=1)
       {
           grade = g;
       }
      else
           System.out.println("Invalid grade");

   }


   public void displayStudent()
   {
       System.out.println("Student = " + name + "\nGrade = " + grade);
   }





}

