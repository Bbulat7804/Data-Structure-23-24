package Question5;

public interface Account {
    int deposit (int ammount);
    boolean withdraw (int ammount);
}

class BankAccount implements Account {

    int balance;
    
    BankAccount (int balance) {
        this.balance = balance;
    }
    
    @Override
    public int deposit(int ammount) {
        balance += ammount;
        return balance;
    }

    @Override
    public boolean withdraw(int ammount) {
        System.out.println("You want to withdraw RM " + ammount);
        if (ammount <= balance){
            System.out.println("you withdrawed RM " + ammount);
            balance -= ammount;
            return true;
        }
        else
            return false;
    }
}

class tester {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(200);
        System.out.println("Your balance after deposit is RM " + a.deposit(100));
        
        if (a.withdraw(200))
            System.out.println("Your balance is RM " + a.balance);
        else
            System.out.println("YOU BROKE!");
    }
}
