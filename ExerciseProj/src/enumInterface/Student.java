package enumInterface;

public class Student {
	private int id;
	private String name;
	private int marks;
	private Grade grade;
	private float scholarship;
	public void calGrade() {
		if(this.marks >= 250) this.grade = Grade.A;
		else if(this.marks >= 200 && this.marks <250) this.grade = Grade.B;
		else if(this.marks >= 175 && this.marks <200) this.grade = Grade.C;
		else if(this.marks >= 150 && this.marks <175) this.grade = Grade.D;
		else this.grade = Grade.E;
		
		
	}
	public void calScolarShip() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public float getScholarship() {
		return scholarship;
	}
	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}
	

}
