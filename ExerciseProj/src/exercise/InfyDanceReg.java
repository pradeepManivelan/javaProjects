package exercise;

public class InfyDanceReg {
	private static int counter = 10000;
	private String name;
	private long contactNumber;
	private String city;
	
	public InfyDanceReg(String name, long contactNumber, String city) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
		InfyDanceReg.counter++;
	}
	public String generateRegId() {
		return "D"+InfyDanceReg.counter;
	}
	public String getName() {
		return name;
	}

}
