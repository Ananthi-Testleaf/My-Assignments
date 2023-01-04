package week1.day1;

public class Calculatorhw {
public void addtwoNumber() {
	int a=55;
	int b=45;
	System.out.println(a+b);
}
public int addthreeNumbers(int a, int b, int c) {
	return a+b+c;
}
public void multiplytwoNumbers() {
	int a=40;
	int b=50;
	System.out.println(a*b);
}
public double multiplyNumbers(int a, double b) {
	return a*b;
}
public void subtracttwoNumbers() {
	int a=60;
	int b=40;
	System.out.println(a-b);
}
public double subtractNumbers(int a, double b) {
	return a-b;
}
public void dividetwoNumbers() {
	int a=50;
	int b=2;
	System.out.println(a/b);
}
public double divideNumbers(int a, double b) {
	return a/b;
}
	public static void main(String[] args) {
		Calculatorhw chw=new Calculatorhw();
		chw.addtwoNumber();
		int result1 = chw.addthreeNumbers(25, 40, 55);
		System.out.println(result1);
		chw.multiplytwoNumbers();
		double result2 = chw.multiplyNumbers(50, 30.5);
		System.out.println(result2);
		chw.subtracttwoNumbers();
		double result3 = chw.subtractNumbers(10, 3.5);
		System.out.println(result3);
		chw.dividetwoNumbers();
		double result4 = chw.divideNumbers(20, 2.5);
		System.out.println(result4);
			}
}
