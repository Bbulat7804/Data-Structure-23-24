package Question4;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public String toString(){
        return "Date : " + date + "\n"+
               "Type : " + type + "\n"+
               "Amount : " + amount + "\n"+
               "Balance : " + balance + "\n" + 
               "Description : " + description;
    }
    
    
}
