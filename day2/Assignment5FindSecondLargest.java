package week1.day2;

import java.util.Arrays;

public class Assignment5FindSecondLargest {

	public static void main(String[] args) {
		
	//	int[] values=new int[3];
		
	int[] values= {12,34,11,39,13,44};
	
	int totalvalues =values.length;
	
		Arrays.sort(values);
		
		System.out.println(values[totalvalues-2]);
	
		}
	
}
