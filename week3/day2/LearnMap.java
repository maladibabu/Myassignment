package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		
		Map<Integer, String> mapList=new HashMap<Integer, String>();
		mapList.put(104, "CCC");
		mapList.put(101, "BBB");
		mapList.put(102, "AAA");
		mapList.put(105, "KKK");
		mapList.put(106, "NNNNNN");
		mapList.put(106, "MMMM");
		
		System.out.println(mapList);
		System.out.println(mapList.size());
		System.out.println(mapList.containsKey(104));
		System.out.println(mapList.containsValue("CCC"));
		System.out.println(mapList.get(104));
		

	}

}
