package week3.day1;

public class Assignment5Automation extends Assignment5MultipleLangauge implements Assignment5Language,Assignment5TestTool{

	
	public void selenium() {
		System.out.println("Method selenium implemented in Automation");
		
	}

	public void java() {
		System.out.println("Method java implemented in Automation");
		
	}

	@Override
	public void ruby() {
		System.out.println("Method ruby implemented in Automation");
		
	}
	
	public static void main(String[] args) {
		
		Assignment5Automation auto=new Assignment5Automation();
		auto.selenium();
		auto.java();
		auto.ruby();
		auto.python();

	}

}
