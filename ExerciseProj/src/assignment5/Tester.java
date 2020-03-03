package assignment5;

public class Tester {
	public static void main(String[] args) {
		try {
		Customer cus1 = new Customer();
		cus1.setCustomerId(1001);
		cus1.setName("John");
		Customer cus2 = new Customer();
		cus2.setCustomerId(1002);
		cus2.setName("Jenny");
		SavingsAccount sav1 = new SavingsAccount(101, 500, 12, cus1, 1000);
		//sav1.getAccountNo();
		sav1.getBalance();
		//sav1.getCustomer();
		sav1.getInterest();
		//sav1.getMinBal();
		sav1.getCustomer().getName();
		sav1.withdraw(1600);
		CurrentAccount ca1 = new CurrentAccount(cus2, 500, 1002, 2000);
		ca1.deposit(1500);
		ca1.getCustomer().getName();
		ca1.getBalance();
		ca1.withdraw(4000);
		ca1.getBalance();
		ca1.withdraw(1500);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
