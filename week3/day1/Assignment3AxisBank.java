package week3.day1;

public class Assignment3AxisBank extends Assignment3BankInfo{
	
	public void deposit() {
		System.out.println("deposit Method is overriden in class Assignment3AxisBank");

	}

	public static void main(String[] args) {

		Assignment3AxisBank axisBank=new Assignment3AxisBank();
		
		axisBank.deposit();
	}

}
