abstract class Account {
	double balance;
	Account(double balance) { this.balance = balance; }
	abstract double calculateInterest();
}
class SavingsAccount extends Account {
	SavingsAccount(double balance) { super(balance); }
	@Override
	double calculateInterest() { return balance * 0.04; }
}
class FixedDepositAccount extends Account {
	FixedDepositAccount(double balance) { super(balance); }
	@Override
	double calculateInterest() { return balance * 0.07; }
}
public class Test {
	public static void main(String[] args) {
    	Account[] accounts = { new SavingsAccount(10000), new FixedDepositAccount(10000) };
    	for (Account a : accounts) {
            System.out.println("Interest: " + a.calculateInterest());
    	}
	}
}
