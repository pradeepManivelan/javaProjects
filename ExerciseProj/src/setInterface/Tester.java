package setInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
	public static void main(String[] args) {
	List<Student> studentList = new ArrayList<Student>();
	Student s1 = new Student("Ron", 1, 101);
	studentList.add(s1);
	Student s2 = new Student("Angela", 9, 102);
	Student s3 = new Student("Hazel", 5, 103);
	studentList.add(s2);
	studentList.add(s3);
	Student s4 = new Student("Hazel", 8, 106);
	studentList.add(s4);
	Set<Student> studentSet = new TreeSet<Student>();
	studentSet.addAll(studentList);
	System.out.println("Student list");
	for(Student student:studentList) {
		System.out.println(student);
	}
	System.out.println("\nStudent fro reevaluation");
	for(Student student:studentSet) {
		System.out.println(student);
	}
	
	
	
//	studentList.add(new Student("Ron",1,101));
//	studentList.add(new Student("Ron",1,101));
//	studentList.add(new Student("Ron",1,101));
	
	
	}

}
