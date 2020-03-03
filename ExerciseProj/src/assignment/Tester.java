package assignment;

public class Tester {
	public static void main(String[] args) {
		CourseRegistration reg1 = new CourseRegistration();
		reg1.setStudentName("Pradeep");
		reg1.setRegistrationId(5001);
		reg1.setQualifyingMarks(78);
		reg1.setCourseId(1005);
		reg1.setHostelRequired(false);
		reg1.calculateCouseFee();
	}

}
