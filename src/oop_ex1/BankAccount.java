package oop_ex1;

/*
4. Define a class BankAccount with the following properties:
accountNumber (String)

balance (double)

Use getters and setters for balance.


Create methods:

deposit(double amount) to add money to the balance.

withdraw(double amount) to subtract money, ensuring the balance doesn’t go negative.

In a main method:

Create an account with an initial balance.

Deposit and withdraw money using the methods.

Print the final balance using the getter.
 */
public class BankAccount {
    String accountNumber;
   private double balance;

   //creem constrictor:
    public BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

 public BankAccount(String accountNumber)
 {
    this.accountNumber = accountNumber;
 }

    public BankAccount( double balance)
    {
        this.balance = balance;
    }

    public BankAccount()
    {}



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depozit(double amount){

        balance = balance+amount;
       //var 2    -    balance += amount;

    }
    public void withdraw(double amount)
    {
       if (amount<=balance)
      {
           balance = balance-amount;

      }
       else
           System.out.println("Nu ai atatia bani!");


    }



}
