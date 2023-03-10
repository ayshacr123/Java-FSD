package bank;

public class SavingsAccount extends Account {
	private double minimumBalance;
	public SavingsAccount (int accountNum, Customer customerObj, double balance, double minimumBalance) {
		super(accountNum, customerObj, balance);
		this.minimumBalance=minimumBalance;
	}
	
	

	public double getMinimumBalance() {
		return minimumBalance;
	}

	/*public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}*/



	
	public boolean withdraw(double amount) {
		if (balance-amount > minimumBalance) {
			balance=balance-amount;
			System.out.println("Balance is :" + balance);
			return true;
		}
		else { 
			return false;
		}
		
	}
}
