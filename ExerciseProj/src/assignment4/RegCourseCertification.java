package assignment4;

public class RegCourseCertification extends RRTechnicalCertification{
	private int courseDuration;
	public RegCourseCertification(String studentName, String courseName, int testMarks, int courseDuration) {
		super(studentName, courseName, testMarks);
		this.courseDuration = courseDuration;
	}
	public int getCourseDuration(){
		return this.courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public void generateRegId() {
		if((RRTechnicalCertification.COUNTER % 2 == 1)) {
			RRTechnicalCertification.COUNTER+=2;
			this.setRegId(RRTechnicalCertification.COUNTER);
		}	
		else {
			RRTechnicalCertification.COUNTER+=1;
			this.setRegId(RRTechnicalCertification.COUNTER);
		}
	}
	@Override
	public double calFee() {
		if(this.getTestMarks() >= 90) {
			return ((Certification.REGULAR_COURSE_FEE * this.getCourseDuration())*0.9);
		}
		else if(this.getTestMarks() >= 75 && this.getTestMarks() <= 89) {
			return ((Certification.REGULAR_COURSE_FEE * this.getCourseDuration())*0.95);
		}
		else {
			return (Certification.REGULAR_COURSE_FEE * this.getCourseDuration());
		}
		
	}

}
