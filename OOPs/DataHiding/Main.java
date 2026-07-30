// package OOPs.DataHiding;

class Account {
    
    // private double balance; // private variable to store account balance
    static double balance; // private variable to store account balance

    public static double getBalance() {
        return balance; // public method to access the private variable
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // public method to modify the private variable
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Account account = new Account();

        System.out.println("Balance: " + Account.balance);
        // account.deposit(1000); // Deposit money
        Account.balance = 1000; // Directly accessing the balance variable (not recommended)
        System.out.println("Current Balance: " + Account.getBalance()); // Access balance using getter method
    }
}

// user can not access the internal data without validation or authentication. 
// It is a way to restrict access to the internal data 
// we can achieve data hiding or Encapsulation by using access modifiers like private, protected and public.

// we achieve security through data hiding or encapsulation by restricting direct access to the internal data of a class.


// Encapuslation = data hiding + abstraction
