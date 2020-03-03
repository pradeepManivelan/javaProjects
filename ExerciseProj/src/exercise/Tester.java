package exercise;

public class Tester {
	public static void main(String[] args) {
//		Booking B1 = new Booking("prade@gmail.com",100);
//		Booking B2 = new Booking("arthi@gmail.com",400);
//		Booking B3 = new Booking("arthi@gmail.com",290);
//		B1.showBookingStatus();
//		B2.showBookingStatus();
//		B3.showBookingStatus(); 
		InfyDanceReg cont1 = new InfyDanceReg("Pradeep", 28763873787L, "Coimbatore");
		System.out.println("Hi "+cont1.getName()+"! Your reg Id is: "+cont1.generateRegId());
	
	}

}
