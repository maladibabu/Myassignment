package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp() {
		System.out.println("connectWhatsApp from SmartPhone");

	}
	
	public void takeVideo() {

		System.out.println("takeVideo from AndroidPhone and overriding at SmartPhone");

	}
	

	public static void main(String[] args) {
		
		SmartPhone smartPhone=new SmartPhone();
		smartPhone.makeCall();
		smartPhone.sendMessage();
		smartPhone.saveContact();
		smartPhone.takeVideo();
		smartPhone.connectWhatsApp();

	}

}
