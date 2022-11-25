package week3.day1;

public class Car extends Vehicle {
	
	protected void openSunRoof() {
    
		System.out.println("OpenSunRoof from Car");

	}	
		public void applyBrake() {
			System.out.println("applyBrake from Vehicle overriding at Car");

		}
		
	

	public static void main(String[] args) {

		Car car =new Car();
		car.openSunRoof();
		car.applyBrake();
		car.soundHorn();
		
		
		
		
	}

}
