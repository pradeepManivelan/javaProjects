package assignment3;

public class KYCUser extends User {
	private int rewardPoints;
	public KYCUser(int id, String userName, String email, double walletBalance) {
		super(id,userName,email,walletBalance);	
	}
	@Override
	public boolean makePayment(double billAmount) {
		if(super.makePayment(billAmount)) {
			this.setRewardPoints(this.getRewardPoints()+(int)(billAmount * 0.1d));
			return true;
		}return false;
	}
	@Override
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	

}
