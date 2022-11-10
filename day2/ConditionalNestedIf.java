package week1.day2;

public class ConditionalNestedIf {

	public static void main(String[] args) {
		int age=12;
		
		if (age <60 && age >18) {
			
			System.out.println("Adult");
		}
		
		
		else if (age <=18) {
			
			if (age<10)
				
				System.out.println("KID");
			
			else {
			System.out.println("Minor");
			
		}
		}
		else {
			System.out.println("Senior Citizen");
		}
		
	}
}
