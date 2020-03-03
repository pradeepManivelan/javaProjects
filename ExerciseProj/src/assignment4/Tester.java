package assignment4;

public class Tester {
	public static void main(String[] args) {
		CrashCourseCertification reg2 = new CrashCourseCertification("Roshan", "Angular", 71);
		reg2.generateRegId();
		System.out.println("Crash Course");
		System.out.println("Student: "+reg2.getStudentName());
		System.out.println("Course: "+reg2.getCouseName());
		System.out.println("RegId: "+reg2.getRegId());
		CrashCourseCertification reg3 = new CrashCourseCertification("Roshan", "Angular", 71);
		reg3.generateRegId();
		System.out.println("Crash Course");
		System.out.println("Student: "+reg3.getStudentName());
		System.out.println("Course: "+reg3.getCouseName());
		System.out.println("RegId: "+reg3.getRegId());
		System.out.println("Fees: "+reg3.calFee());RegCourseCertification reg1 = new RegCourseCertification("Rakesh", "J2EE", 85, 5);
		reg1.generateRegId();
		System.out.println("Regular Course");
		System.out.println("Student: "+reg1.getStudentName());
		System.out.println("Course: "+reg1.getCouseName());
		System.out.println("RegId: "+reg1.getRegId());
		System.out.println("Fees: "+reg1.calFee());

		
		
	}

}
