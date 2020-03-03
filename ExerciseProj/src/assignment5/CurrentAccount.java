package assignment5;

public class CurrentAccount extends Account{
	private int overDraft;

	public CurrentAccount(Customer customer, int overDraft, int accountNo, double balance) {
		super.setCustomer(customer);
		super.setAccountNo(accountNo);
		this.overDraft = overDraft;
		super.setBalance(this.getBalance()+this.overDraft);
		
	}
	public int getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(int overDraft) {
		this.overDraft = overDraft;
	}
	
	public void withdraw(double amount) {
		//this.setBalance();
		if(!(this.getBalance()-amount<-1000)) {
			this.setBalance(this.getBalance()-amount);
		}
		else {
			//throw new Exception("Insufficient_Balance");
		}
	}

}
