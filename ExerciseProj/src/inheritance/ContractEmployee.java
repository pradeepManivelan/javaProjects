package inheritance;

public class ContractEmployee extends Employee{
	private double wage;
	private int hours;
	public ContractEmployee(int empId, String name, double wage, int hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void calculateSalary() {
		this.setSalary(this.getHours()*this.getWage());
	}

}
