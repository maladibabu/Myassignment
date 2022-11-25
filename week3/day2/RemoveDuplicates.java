package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
    
		int [] nums= {2,3,4,2,8,7,3,9,5,5,2,3};
		
		Set<Integer> uniqueset=new HashSet<Integer>();
		
		
		for (int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			
			
			uniqueset.add(nums[i]);
		}
		
		System.out.println(uniqueset);
	}

}
