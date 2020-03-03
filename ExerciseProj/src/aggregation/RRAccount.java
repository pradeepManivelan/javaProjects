package aggregation;

public class RRAccount {
	private String customerName;
	private Address address;
	private double depositAmount;
	public RRAccount(String customerName, Address address, double depositAmount) {
		this.customerName = customerName;
		this.depositAmount = depositAmount;
		this.address = address;
	}
	public boolean isValidAddress() {
		if(String.valueOf(this.getAddress().getPinCode()).length() == 6){
			return true;
		}
		return false;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

}
