package assignment4;

public abstract class RRTechnicalCertification implements Certification{
	private String studentName;
	private String couseName;
	private int regId;
	private int testMarks;
	public static int COUNTER = 1000;
	public RRTechnicalCertification(String studentName, String courseName, int testMarks) {
		this.studentName = studentName;
		this.couseName = courseName;
		this.testMarks = testMarks;
		//this.setRegId(RRTechnicalCertification.COUNTER+1);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCouseName() {
		return couseName;
	}
	public void setCouseName(String couseName) {
		this.couseName = couseName;
	}
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public int getTestMarks() {
		return testMarks;
	}
	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}
	
	public abstract void generateRegId();
	public abstract double calFee();
	

}
