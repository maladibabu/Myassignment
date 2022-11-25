package week3.day1;

public class Icici implements Rbi{

	public void minBalance() {

		System.out.println("minBalance implemented in ICICI and is 6000");
	}

	public void maxLoanAmount() {
		System.out.println("maxLoanAmount implemented in ICICI and is 150000");
		
	}
	
    public static void main(String[] args) {
    	
    	Icici icici = new Icici();
    	
    	icici.minBalance();
    	icici.maxLoanAmount();
    	
    
    	
    	
    	
     }
}
