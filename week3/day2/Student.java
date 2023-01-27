package week3.day2;

public class Student extends Department {
	public void studentName() {
		System.out.println("Ananthi");
	}
	public void studentDept() {
		System.out.println("Computer Science");
	}
	public void StudentId() {
		System.out.println("20261");
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.department();
		stud.studentDept();
		stud.StudentId();
		stud.studentName();
	}

}
