package objectClass;

public class Tester {
	public static void main(String[] args) {
		Circle cir1 = new Circle(10.0f);
		Circle cir2 = new Circle(5.0f);
		if(cir1.equals(cir2))
			{System.out.println(cir1.toString());
			}
		else {
			System.out.println("They are not equal");}
		
	}

}
