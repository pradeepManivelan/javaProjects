package assignment5;

public class SavingsAccount extends Account {
	private double minBal;
	private int interest;
	public SavingsAccount(int accountNo, double minBal, int interest, Customer customer, double balance) {
		super.setAccountNo(accountNo);
		super.setCustomer(customer);
		super.setBalance(balance);
		this.minBal = minBal;
		this.interest = interest;
	}
	public double getMinBal() {
		return minBal;
	}
	public void setMinBal(double minBal) {
		this.minBal = minBal;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	public void withdraw(double amount) {
		if(this.minBal >= this.getBalance()-amount) {
			this.setBalance(this.getBalance()-amount);
		}
		else {
			//throw new Exception("Insufficient_Balance");
		}
	}
	
	public double calInt() {
		return ((this.getBalance()*this.interest)/100);
	}
	

}
