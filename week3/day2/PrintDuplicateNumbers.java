package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		

	    
		int [] nums= {2,3,4,8,7,3,9,2,5,2,3};
		
		Set<Integer> uniqueset=new HashSet<Integer>();
		Set<Integer> duplicateunique=new HashSet<Integer>();
		
		
		
		for (int i=0;i<nums.length;i++) {
			//System.out.println(nums[i]);
			
			
			boolean add1 = uniqueset.add(nums[i]);
			
			if (!add1) {
				
				
				duplicateunique.add(nums[i]);
			}
				
			
		}
		
		System.out.println(duplicateunique);
	
	}
}
