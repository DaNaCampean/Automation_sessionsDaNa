package oop_ex1;

public class myMain {

    public static void main( String[] args) {

      // prima varianta fara constructorul de dincolo  student myStudent = new student();
      //        myStudent.name = "DaNa";


        //metoda 2: cu constrictor

        student myStudent = new student("DaNa");
        myStudent.setGrade(101);
        myStudent.displayStudent();

        //PROBLEMA 2:
        // asta e doar pt diferenta de ce nu folosim setter si getter
        /*
        Rectangle myRectangle = new Rectangle();
        myRectangle.width = 5;
        myRectangle.length = 4;
     myStudent.grade = 5; //de fapt grade nu se poate accesa, trebuia setter si getter pt ca e private
        */






       Rectangle myRectangle = new Rectangle(5,4); //creem obientucl, folosind constructorul cu 2 parametrii

       myRectangle.calculateArea();
       myRectangle.calculatePerimetera();

        //problema 4 BANK:

         BankAccount myBankAccount = new BankAccount("123", 100);
         myBankAccount.depozit(50);
         myBankAccount.withdraw(10);


        System.out.println("FINAL BALANCE  = " + myBankAccount.getBalance());
        myBankAccount.setBalance(5000);

        System.out.println("FINAL BALANCE  = " + myBankAccount.getBalance());

        // arianta cu 3 constructori cu same name: oVERLOADING

        BankAccount myAccount = new BankAccount("Dana cont");
        BankAccount myBalance = new BankAccount(89);
        BankAccount myEmptyt = new BankAccount();
        myEmptyt.setBalance(58);
        myAccount.setBalance(45);


        //myAccount care are account number = dana cont si nu are bani iniliati

        // myBallance =  nu are accountNumber dar are 89 bani

        // myEmpty: nu are nici bani initail nici accpunt number , DAR I-AM setat ( adaugat sa am balanta initiala), dar NU adaugat  (depozit)
        // apoi " //myAccount care are account number = dana cont si nu are bani iniliati" -iam setat 45...si acum ii si adaugam:
        myAccount.depozit(45);

        System.out.println("FINAL BALANCE   = " + myAccount.getBalance());

        // cu 105 da rezultat zero

    }

        /*
            In the main method:
Create a Student object.

Set the grade using the setter method.
Display the student details using displayStudent().}
         */


}
