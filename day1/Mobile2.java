package week1.day1;

public class Mobile2 {
	public void makeCall() {
		String mobileModel="Vivo";
		float mobileWeight=2.5f;
		System.out.println("Call received");
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		}
		public void sendMsg() {
			boolean isFullCharged=true;
			int mobileCost=16000;
			System.out.println("Message received");
			System.out.println(isFullCharged);
			System.out.println(mobileCost);
			System.out.println("This is my Mobile");
		}

	public static void main(String[] args) {
		Mobile2 c1=new Mobile2();
		c1.makeCall();
		c1.sendMsg();
	
	}

}
