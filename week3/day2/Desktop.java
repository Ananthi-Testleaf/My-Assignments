package week3.day2;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The Desktop size is 32 inches");
	}

	public static void main(String[] args) {
		Desktop dt=new Desktop();
		dt.computerModel();
		dt.desktopSize();

	}

}
