package assignment3;

public class User {
	private int id;
	private String userName;
	private String email;
	private double walletBalance;
	private int rewardPoints;
	public User(int id, String userName, String email, double walletBalance) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.walletBalance = walletBalance;
		
	}
	public boolean makePayment(double billAmount) {
		if(this.getWalletBalance() >= billAmount) {
			this.setWalletBalance(this.getWalletBalance() - billAmount);
			return true;
		}return false;
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
}
