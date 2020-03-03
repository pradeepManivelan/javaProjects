package interfaceEx;

public class Trainee implements Student{
	private int marksSecured;
	public Trainee(int marksSecured) {
		this.marksSecured = marksSecured;
	}
	public void calcPer() {
		if(!(this.marksSecured > Student.TOTAL_MAX_MARKS)){
			System.out.println("The percentage is "+(float)this.marksSecured/(Student.TOTAL_MAX_MARKS/100));
		}
		else {
			System.out.println("Enter valid marks");
		}
	}
}
