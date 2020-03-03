package guidedexercise1;

public class Tester {
	public static void main(String args[]) {
		int a=1,b=4,c=4;
		float dis = (b*b)-4*a*c;
		float op;
		if(dis == 0){
			op = -b/(2*a);
			System.out.println("The roots is " + op);
		}
		int sum=0;
        for(int i=0, j=0; i<5 & j<5; ++i, j=i+1) {
            sum+=i;
        }
        System.out.println(sum);
	}

}
