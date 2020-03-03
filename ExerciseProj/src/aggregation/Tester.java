package aggregation;

public class Tester {
	public static void main(String[] args) {
		Address add1 = new Address("9th cross,", "Tri circle", "Mysuru", "KA", 70017);
		RRAccount acc1 = new RRAccount("Rakesh", add1, 50000.0);
		if(acc1.isValidAddress()) {
			System.out.println(acc1.getCustomerName());
			System.out.println(acc1.getAddress().getFirstLine());
			System.out.println(acc1.getAddress().getSecondLine());
			System.out.println(acc1.getAddress().getCity());
			System.out.println(acc1.getAddress().getState());
			System.out.println("Congrats!");
		}
		else {
			System.out.println("Pincode is invalid");
		}
	}

}
