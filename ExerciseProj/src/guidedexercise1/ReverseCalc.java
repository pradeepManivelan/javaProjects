package guidedexercise1;

public class ReverseCalc {
	public static void main(String args[]) {
		int ip = 276567, temp, rem, sum=0;
		temp = ip;
		while(temp>0) {
			rem = temp%10;
			sum = sum*10 + rem;
			temp = temp/10;
			//System.out.println(temp);
		}
		System.out.println("The reverse is "+sum+args[0]);
	}

}
