package interfaceEx;

public class Intern implements Student{
	private int marksSecured;
	private int projectMarks;
	public Intern(int marksSecured, int projectMarks) {
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}
	public void calcPer() {
		if(!(this.marksSecured + this.projectMarks > Student.TOTAL_MAX_MARKS)) {
			System.out.println("The total percentage by intern is "+((float)this.marksSecured + this.projectMarks) / (Student.TOTAL_MAX_MARKS/100));
		}
		else {
			System.out.println("Please enter correct marks");
		}
	}

}
