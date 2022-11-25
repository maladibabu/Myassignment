package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GoogleProgram {

	public static void main(String[] args) {

		String str="google";
		
		Set<Character> uniqueChar=new TreeSet<Character>();
		char[] charArray = str.toCharArray();
		
		for (int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
			
			uniqueChar.add(charArray[i]);
			
			
			

		}
			System.out.println(uniqueChar);
			
		
		
		
	}

}
