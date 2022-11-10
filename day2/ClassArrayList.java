package week1.day2;

import java.util.Arrays;

public class ClassArrayList {
	public static void main(String[] args) {
		
   //int[] values= new int[4];
   
   //values[0]=12;
   //values[1]=14;
   //values[2]=16;
   //values[3]=20;
   
   //int al=values.length;
   
   //System.out.println(values[2]);
   //System.out.println(al);
		
	int[] values= {3,33,12,15,55,11};
	
	int all=values.length;
	
	Arrays.sort(values);
	
for (int i = all-1; i >=0; i--) {
		
		System.out.println(values[i]);
		
		
		}
	}
}
