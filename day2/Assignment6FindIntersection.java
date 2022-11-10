package week1.day2;


public class Assignment6FindIntersection {

	
	
    public static void main(String[] args) {
		
    	int[] values1= {3,2,11,4,6,7};
    	int[] values2= {1,2,8,4,9,7};
    	
    	for (int i = 0; i < values2.length; i++) {
			
    		for (int j = 0; j < values2.length; j++) {
    			
    			if (values1[i]==values2[j]) {
    				System.out.println(values1[i]);
    			}
				
			}
		}
    	
	}
	
}
