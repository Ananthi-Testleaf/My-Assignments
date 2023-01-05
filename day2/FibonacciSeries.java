package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {		
		        int range=8;
		        int fib1=0,fib2=1;
		        System.out.print(fib1+" "+fib2);
		        int fibonacci=fib1+fib2;
		        while(fibonacci<=range)
		        {
		            System.out.print(" "+fibonacci);
		            fib1=fib2;
		            fib2=fibonacci;
		            fibonacci=fib1+fib2;
		        }
		    }

	}


