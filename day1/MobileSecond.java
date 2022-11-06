package week1.day1;

public class MobileSecond {

	public static void main(String[] args) {
		
		System.out.println("Call from another class");
		MobileFirst mb2=new MobileFirst();
		mb2.makeCall();
		mb2.sendMessage();
	}

}
