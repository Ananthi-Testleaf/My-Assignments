package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int number = 34343;
	    int temp = number;
	    int reverse = 0;
	    int remainder;
	    
	    while (number > 0) {
	        remainder = number%10;
	        reverse = reverse*10 + remainder;
	        number = number/10;
	    }
	    
	    if(temp == reverse)
	        System.out.println("The Number is Palindrome");
	    else
	        System.out.println("The Number is not Palindrome");
	  }

}
