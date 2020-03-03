package assignment3;

public class Tester {
	public static void main(String[] args) {
		User user1 = new User(101, "Jack", "jack@infy.com", 1000);
		EPayWallet.processPaymentByUser(user1, 700);
		KYCUser kyc1 = new KYCUser(201, "Jill", "jill@infy.com", 3000);
		EPayWallet.processPaymentByUser(kyc1, 1500);
		EPayWallet.processPaymentByUser(kyc1, 800);
		EPayWallet.processPaymentByUser(kyc1, 1200);
		
	}

}
