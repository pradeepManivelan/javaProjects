package exercise;

public class Booking {
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	private static int seatsAvailable = 400;
	public Booking(String customerEmail, int seatsRequired) {
		this.setCustomerEmail(customerEmail);
		this.setSeatsRequired(seatsRequired);
		if(seatsRequired<=Booking.getSeatsAvailable()) {
			this.isBooked = true;
			Booking.seatsAvailable-=seatsRequired;	
		}
		else {
			isBooked = false;
		}
		
	}
	public void showBookingStatus() {
		if(this.isBooked()) {
			System.out.println(Booking.getSeatsAvailable()+" seats successfully booked for "+
					this.getCustomerEmail());
				
		}
		else {
			System.out.println("Sorry "+this.getCustomerEmail()+", not enough seats! Seats available:"+
					Booking.getSeatsAvailable());
			
		}
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getSeatsRequired() {
		return seatsRequired;
	}
	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public static int getSeatsAvailable() {
		return seatsAvailable;
	}
	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}
	

}
