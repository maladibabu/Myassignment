package week1.day2;

public class Assignment4ArmstrongNumber {

	public static void main(String[] args) {
		
		int originalnumber=153;
		int num=originalnumber;
		
		int remainder;
		int sum=0;
		while (num>0) {
		
			remainder = num%10;

			sum =sum + (remainder*remainder*remainder);
			System.out.println("sum " +sum);
			num=num/10;

				
		}
		
		if (originalnumber==sum)
		{
			System.out.println("ArmstrongNumber");
			
					}
		else {
			System.out.println("Not a ArmstrongNumber");
	  
		}
	}
}