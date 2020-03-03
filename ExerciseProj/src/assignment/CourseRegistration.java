package assignment;

public class CourseRegistration {
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;
	
	public boolean validateMarks() {
		if(this.getQualifyingMarks()>=65.0 && this.getQualifyingMarks()<=100.0){
			return true;
		}return false;
	}
	
	public boolean validateCouseId() {
		if(this.getCourseId()>=1001 &&this.getCourseId()<=1005) {
			return true;
		}return false;
	}
	
	public void calculateCouseFee() {
		if(!this.validateMarks()) {
			//System.out.println(this.getQualifyingMarks());
			System.out.println("Marks is less than 65.You are not in");
		}
		else if(!this.validateCouseId()) {
			System.out.println("Invalid Couse Id. Please try again");
		}
		else {
			if(this.getCourseId() == 1001) {
				this.courseFee = 55000;
			}
			else if(this.getCourseId() == 1002) {
				this.courseFee = 35675;
			}
			else if(this.getCourseId() == 1003) {
				this.courseFee = 28300;
			}
			else if(this.getCourseId() == 1004) {
				this.courseFee = 22350;
			}
			else {
				this.courseFee = 115000;
			}
			if(this.getQualifyingMarks() >= 65 && this.getQualifyingMarks() <=69) {
				this.courseFee = this.getCourseFee() * 0.95f;
			}
			else if(this.getQualifyingMarks() >= 70 && this.getQualifyingMarks() <= 84) {
				this.courseFee = Math.round((this.getCourseFee() * 0.90)*100.0)/100.0;
			}
			else {
				this.courseFee = this.getCourseFee() * 0.85f;
			}
			System.out.println("*****Details******");
			System.out.println("Name:"+this.getStudentName());
			System.out.println("Id"+this.getCourseId());
			System.out.println("Marks"+this.getQualifyingMarks());
			System.out.println("Reg Id"+this.getRegistrationId());
			System.out.println("Course Fee"+this.getCourseFee());
			System.out.println("Hostel"+this.isHostelRequired());
		}
		
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}
	

}
