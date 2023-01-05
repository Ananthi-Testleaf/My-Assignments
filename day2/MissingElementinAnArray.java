package week1.day2;

import java.util.Arrays;

public class MissingElementinAnArray {


	 public static void main(String[] args) {
	        int[] array = {1,2,3,4,7,6,8};
	        Arrays.sort(array);
	        int n = array.length;
	        int total = (n + 1) * (n + 2) / 2;
	        for (int i = 0; i < n; i++)
	            total -= array[i];
	        System.out.println("Missing element is : " + total);
	    }
	 	}
