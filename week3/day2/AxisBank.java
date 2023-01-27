package week3.day2;

public class AxisBank extends BankInfo {
	public void deposit1() {
		System.out.println("I have deposited Rs.200000");
}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
		ab.deposit1();
		

	}

}
