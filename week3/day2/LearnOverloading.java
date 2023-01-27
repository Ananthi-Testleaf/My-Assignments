package week3.day2;

public class LearnOverloading {
	public void addTwoNumbers(int a, int b) {
		System.out.println(a+b);
	}
	public void subTwoNumbers(int a, float b) {
		System.out.println(a-b);
	}
	public void mulTwoNumbers(int a, double b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		LearnOverloading lor=new LearnOverloading();
		lor.addTwoNumbers(25, 45);
		lor.subTwoNumbers(50, 40.5f);
		lor.mulTwoNumbers(30, 1.55d);

	}

}
