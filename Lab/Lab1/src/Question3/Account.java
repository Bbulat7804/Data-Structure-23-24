package Question3;

import java.util.Date;

class main{
    public static void main(String[] args) {
        Account simpananPerkahwinan = new Account(1122,20000,0.045);
        simpananPerkahwinan.withdraw (2500);
        simpananPerkahwinan.deposit(3000);
        System.out.println("Monthly interest: "+ simpananPerkahwinan.getMonthlyInterest());
        System.out.println("Date created: "+ simpananPerkahwinan.getDateCreated());
    }
}

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    Account () {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    
    Date getDateCreated () {
        return dateCreated;
    }
    
    double getMonthlyInterestRate () {
        return annualInterestRate / 12;
    }
    
    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate(); 
    }
    
    void withdraw(double amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Your balance: "+balance);
        }
        else 
            System.out.println("You broke!");
    }
    
    void deposit (int deposit) {
        balance += deposit;
        System.out.println("Your balance :"+balance);
    }
}
