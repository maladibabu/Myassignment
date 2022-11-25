package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccurence {

	public static void main(String[] args) {
		
		String companyName="amazon india";
		

		Map<Character, Integer> maplist=new HashMap<Character, Integer>();
		
		char[] charArray = companyName.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (maplist.containsKey(charArray[i])) {
				
								
			int value = maplist.get(charArray[i]);
			
				maplist.put(charArray[i], value+1);
			}
			else 
			{
				maplist.put(charArray[i], 1);
				
			}
			
		}
		
		System.out.println(maplist);
		
		Set<Entry<Character, Integer>> entrySet = maplist.entrySet();	
		
		for (Entry<Character, Integer> entry : entrySet) {
			
			int value = entry.getValue();
			
			if (value==1) {
				
		System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
		
	}


	
}
	
	
	
}
