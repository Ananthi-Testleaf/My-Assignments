package week3.day2;

public class StudentInfo {
	public void getStudentInfo(int id,String name) {
		System.out.println("The Student ID is: " +id);
		System.out.println("The Student NAME is: " +name);
	}
	public void getStudentInfo(long phonenum,String email) {
		System.out.println("The Student PhoneNumber is: " +phonenum);
		System.out.println("The Student Email is: " +email);
	}
	public void getStudentInfo(float percentage,String result) {
		System.out.println("The Student Percentage is: " +percentage);
		System.out.println("The Student Result is: " +result);
	}
	
	
	public static void main(String[] args) {
		StudentInfo get=new StudentInfo();
		get.getStudentInfo(20121, "Ananthi");
		get.getStudentInfo(9940485398l , "ananthivaishnavi21@gmail.com");
		get.getStudentInfo(76.5f, "Passed with First Class");
	}

}

