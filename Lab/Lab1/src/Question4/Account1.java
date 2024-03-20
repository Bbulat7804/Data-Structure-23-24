package Question4;

import java.util.ArrayList;
import java.util.Date;

class main{
    public static void main(String[] args) {
        Account1 simpananPerkahwinan = new Account1("George", 1122, 1000, 0.015);
        simpananPerkahwinan.deposit(30);
        simpananPerkahwinan.deposit(40);
        simpananPerkahwinan.deposit(50);
        simpananPerkahwinan.withdraw (5);
        simpananPerkahwinan.withdraw (4);
        simpananPerkahwinan.withdraw (2);
        simpananPerkahwinan.accountSummary();
    }
}

public class Account1 {
    String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    public Account1(String name, int id, double balance, double annualInterestRate) {
        dateCreated = new Date();
        this.name = name;
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
            transactions.add(new Transaction('W',amount, balance, "You withdraw RM" +amount));
        }
        else 
            System.out.println("You broke!");
    }
    
    void deposit (int deposit) {
        balance += deposit;
        System.out.println("Your balance :"+balance);
        transactions.add(new Transaction ('D', deposit, balance, "You deposited RM " + deposit));
    }
    
    void accountSummary(){
        
        System.out.println("\n\u001B[34mAccount Summary\n");
        System.out.println("Name : " + name);
        System.out.println("Interest Rate : " + annualInterestRate);
        System.out.println("Balance : " + balance);
        
        for(int i=0 ; i<transactions.size() ; i++){
            System.out.println("\n\u001B[36mTransaction " + (i+1));
            System.out.println(transactions.get(i));
        }
    }
}
