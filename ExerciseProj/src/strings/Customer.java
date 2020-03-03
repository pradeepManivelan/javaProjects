package strings;

public class Customer {
	private String customerName;
	private int appDis;
	public String getCustomerName() {
		return customerName;
	}

	public int getAppDis() {
		return appDis;
	}

	public void findDisAndName(String inputString) {
		String trimmed = inputString.trim();
		int ind = trimmed.indexOf(":");
		String type = trimmed.substring(0, ind);
		String name = trimmed.substring(ind+1);
		this.customerName = name;
		if(type.equalsIgnoreCase("Regular"))this.appDis = 10;
		else if(type.equalsIgnoreCase("Privileged")) this.appDis = 20;
	}

}
