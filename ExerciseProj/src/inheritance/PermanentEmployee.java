package inheritance;

public class PermanentEmployee extends Employee{
	private double basicPay;
	private double hra;
	private int experience;
	public PermanentEmployee(int empId, String name, double basicPay, double hra, int experience) {
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void calculateSalary() {
		if(this.getExperience() >= 10) {
			this.setSalary(this.getBasicPay()+(this.getBasicPay()*0.12)+this.getHra());
		}
		else if(this.getExperience() >= 5 && this.getExperience() < 10) {
			this.setSalary(this.getBasicPay()+(this.getBasicPay()*0.07)+this.getHra());
		}
		else if(this.getExperience() >= 3 && this.getExperience() < 5) {
			System.out.println(this.getBasicPay()*0.05);
			this.setSalary(this.getBasicPay()+(this.getBasicPay()*0.05)+this.getHra());
		}
		else {
			this.setSalary(this.getBasicPay()+this.getHra());
		}
	
	}

}
