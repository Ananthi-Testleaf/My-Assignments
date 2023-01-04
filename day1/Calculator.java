package week1.day1;

public class Calculator {
	
public void subtracttwoNumbers() {
	int a=50;
	int b=30;
	System.out.println(a-b);
}
public int multiplytwoNumbers(int a, int b) {
return a*b;
}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.subtracttwoNumbers();
		int result = cal.multiplytwoNumbers(60, 30);
		System.out.println(result);
	}

}
