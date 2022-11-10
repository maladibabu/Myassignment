package week1.day2;


public class ClassFindArrayDuplicates {

	public static void main(String[] args) {
		
	int[] values = {12,30,15,24,13,15,29,39,29};
	
	for (int i = 0; i < values.length; i++) {
		
		//System.out.println(values[i]);
		
		   for (int j = i+1; j < values.length; j++) {
		    //System.out.println(values[j]);
					
			if (values[i]==values[j]) {
				System.out.println(values[i]);
			}
		
		}
		
	}
	
	}
}
