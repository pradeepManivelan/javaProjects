package association;

public class FDAccount {
	private int accountId;
	private float balance;
	public FDAccount(int accountId, float balance) {
		this.accountId = accountId;
		this.balance = balance;
	}
	public void updateBalance(InterestCalculator interestCalc) {
		System.out.println(interestCalc.calculateInterest(this.getBalance()));
		this.setBalance(this.getBalance()+interestCalc.calculateInterest(this.getBalance()));
		
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	

}
