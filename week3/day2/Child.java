package week3.day2;

public class Child extends GrandParent {
	public void NewChildHouse() {
		System.out.println("This is newchild house");
	}
	public static void main(String[] args) {
		Child ch=new Child();
		ch.Apartment();
		ch.Bungalow();
		ch.hut();
		
	}
	
	}
	