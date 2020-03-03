package assignment3;
import assignment3.KYCUser;



public class EPayWallet {
	public static void processPaymentByUser(User user, double billAmount) {
		if(user.makePayment(billAmount)) {
			System.out.println("Congrats "+user.getUserName()+" payment of "+billAmount+" was successful!");
			System.out.println("Balance "+user.getWalletBalance());
			
		}
		else {
			System.out.println("Sorry "+user.getUserName()+" not enough balance");
			System.out.println("Balance "+user.getWalletBalance());
			
			
		}
		if(user instanceof KYCUser) {
			
			System.out.println("You have "+ user.getRewardPoints()+" reward points");
		}
		System.out.println("----------------------------------");
	}

}
