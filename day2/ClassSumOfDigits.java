package week1.day2;

public class ClassSumOfDigits {

		public static void main(String[] args) {
		
		int num= 123;
		int sum=0;
		int remainder=0;
		
		while (num > 0)
			
		{
			remainder = num %10;
			sum=sum + remainder;
			
			num = num/10;
		
			
		}
		System.out.println(sum);
			
		
		
	}
}
