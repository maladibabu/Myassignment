package week1.day2;

public class ConditionalIfElse {

	
	public static void main(String[] args) {
		
		int age =12;
		
		if (age >=18 && age <60 ) {
			
			System.out.println("Adult");
		}
		
		else if (age <18 ){
			
			System.out.println("Minor");
			
		}
		
		else if (age >60) {
			
			System.out.println("Senior Citizen");
		}
		
		
	}
}
