package association;

public class InterestCalculator {
	private int timeInYears;
	private float rateOfInterest;
	public InterestCalculator(int timeInYears, float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
		this.timeInYears = timeInYears;
	}
	public float calculateInterest(float principal){
		//System.out.println(principal*this.getRateOfInterest()*this.getTimeInYears());
		return principal*this.getRateOfInterest()*this.getTimeInYears()/100;
	}
	public int getTimeInYears() {
		return timeInYears;
	}
	public void setTimeInYears(int timeInYears) {
		this.timeInYears = timeInYears;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	

}
