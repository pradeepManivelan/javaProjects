package strings;

public class Tester {
	public static void main(String[] args) {
		Customer cus1 = new Customer();
		cus1.findDisAndName("   Privileged:Pradeep    ");
		System.out.println(cus1.getCustomerName()+cus1.getAppDis());
	}
}
