class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // The 'synchronized' keyword prevents concurrent access to this method
    public synchronized void withdraw(String name, int amount) {
        System.out.println(name + " is checking the balance. Current balance: ₹" + balance);
        
        if (balance >= amount) {
            System.out.println(name + "'s withdrawal of ₹" + amount + " is approved.");
            try {
                // Simulating ATM processing time
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            balance -= amount;
            System.out.println(name + " successfully withdrew ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Transaction failed for " + name + ". Insufficient balance! Current balance: ₹" + balance);
        }
        System.out.println("--------------------------------------------------");
    }
}

class ATMUser implements Runnable {
    private BankAccount account;
    private String name;
    private int amount;

    public ATMUser(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(name, amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        // Creating two threads representing Husband and Wife trying to withdraw simultaneously
        Thread husband = new Thread(new ATMUser(sharedAccount, "Husband", 800));
        Thread wife = new Thread(new ATMUser(sharedAccount, "Wife", 800));

        // Starting both transactions at the same time
        husband.start();
        wife.start();
    }
}
