package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccurenceNumber {

	public static void main(String[] args) {

		int[] nums= {1, 2, 1, 3, 2, 5, 2, 2};
		
	Map<Integer, Integer> mapdata=new HashMap<Integer, Integer>();
	
	
	for (int i = 0; i < nums.length; i++) {
		
		if (mapdata.containsKey(nums[i])) {
			
			int val = mapdata.get(nums[i]);
			mapdata.put(nums[i], val+1);
			
		}
			
		else {
			mapdata.put(nums[i], 1);
	}
		
		
		
	}
	System.out.println(mapdata);
	
	Set<Entry<Integer, Integer>> entrySet = mapdata.entrySet();
	
	for (Entry<Integer, Integer> entry : entrySet) {
		
		if (entry.getValue()==1) {
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
			
	}

}
}