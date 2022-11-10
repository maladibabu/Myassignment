package week1.day2;

import java.util.Arrays;

public class Assignment7MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] values= {1,2,3,4,7,6,8};
	    int	Arraysum = 0;
	    int sum=0;
		
		Arrays.sort(values);
		
			for (int i = 0; i < values.length; i++) {
			
			   Arraysum = Arraysum + values[i];
			   
				}
			System.out.println(Arraysum);
			
			
			for (int j = 1; j <= 8; j++) {
				
				sum = sum+j;
		
				
				}
			
			System.out.println(sum);
			int missingnumber=sum-Arraysum;
			System.out.println("missingnumber "+missingnumber);
			
			
		}
		
		}
