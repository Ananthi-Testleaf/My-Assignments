package week1.day1;

public class Mobile {

	public void sendSMS() {
	System.out.println("Message received");
	}
	public void takeSnapShot() {
		System.out.println("SnapShot Taken");
	}

	
	public static void main(String[] args) {
		Mobile mb=new Mobile();
		mb.sendSMS();
		mb.takeSnapShot();

	}

}
