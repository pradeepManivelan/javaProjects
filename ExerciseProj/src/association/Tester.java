package association;

public class Tester {
	public static void main(String[] args) {
		FDAccount fd1 = new FDAccount(1010, 50000);
		InterestCalculator ic1 = new InterestCalculator(1, 8.4f);
		fd1.updateBalance(ic1);
		System.out.println(fd1.getBalance());
	}

}
