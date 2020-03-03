package guidedexercise2;

public class UniversePlanetarium {
	private double baseFare = 100.0;
	private int seatsAvailable = 250;
	public double getBaseFare() {
				return baseFare;
			}
	public void setBaseFare(double baseFare) {
				this.baseFare = baseFare;
			}
	public int getSeatsAvailable() {
				return seatsAvailable;
			}
	public void setSeatsAvailable(int seatsAvailable) {
				this.seatsAvailable = seatsAvailable;
			}
			
	public void bookSeat(String name, int noOfSeats) {
				if(this.seatsAvailable>=noOfSeats) {
					this.setSeatsAvailable(this.getSeatsAvailable()-noOfSeats);
					System.out.println(name + " has successfully booked "+noOfSeats+" seats, total fare is "+noOfSeats*baseFare+" and "+this.getSeatsAvailable()+" seats remaining");
			}
				else {
					System.out.println("Sorry "+name+"! insufficient number of seats");
				}
			
		}

}

