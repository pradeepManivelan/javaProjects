package setInterface;

public class Student implements Comparable<Student>{
	private Integer studentId;
	private String studentName;
	private Integer semester;
	public Student (String studentName, Integer semester, Integer studentId) {
		this.studentName = studentName;
		this.semester = semester;
		this.studentId = studentId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getSemester() {
		return semester;
	}
	public void setSemester(Integer semester) {
		this.semester = semester;
	}
	@Override
	public int compareTo(Student student) {
		if(student.studentName.equalsIgnoreCase(this.studentName))
			return 0;
		else
			return 1;
		
	}
	
	@Override
	public String toString() {
		return "StudentId:"+this.studentId+"\n"+"Name:"+this.studentName+"\n"+"Sem:"+this.semester;
	}
	

}
