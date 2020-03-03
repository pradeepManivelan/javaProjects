package abstractEx;

public abstract class Student {
	private String name;
	private int[] test;
	private String result;
	public abstract void generateResult();
	public Student(String name) {
		this.name = name;
	}
	public void setTestScore(int testNumber, int testScore) {

		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getTest() {
		return test;
	}
	public void setTest(int[] test) {
		this.test = test;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

}
