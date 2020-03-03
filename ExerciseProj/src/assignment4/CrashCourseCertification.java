package assignment4;

public class CrashCourseCertification extends RRTechnicalCertification{
	public CrashCourseCertification(String studentName, String courseName, int admissionMarks) {
		super(studentName,courseName,admissionMarks);
	}
	public void generateRegId() {
		if(RRTechnicalCertification.COUNTER % 2 == 1) {
			RRTechnicalCertification.COUNTER+=1;
			this.setRegId(RRTechnicalCertification.COUNTER);
		}
		else {
			RRTechnicalCertification.COUNTER+=2;
			this.setRegId(RRTechnicalCertification.COUNTER);
		}
		//this.setRegId(RRTechnicalCertification.COUNTER);
		
	}
	@Override
	public double calFee() {
		if(this.getTestMarks() >= 90) {
			return (((Certification.CRASH_COURSE_FEE )*0.9)*1.1236);
		}
		else if(this.getTestMarks() >= 75 && this.getTestMarks() <= 89) {
			return (((Certification.CRASH_COURSE_FEE )*0.95)*1.1236);
		}
		else {
			return ((Certification.CRASH_COURSE_FEE )*1.1236);
		}
		
		
	}

}
