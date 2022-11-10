package week1.day2;

public class Assignment3FibonacciSeries {
	
	public static void main(String[] args) {
		
		
		int a=0;
		int b=1;
		int count=10;
		int sum = 0;
		
		for (int i = 1; i <=count ; i++) {
			
						
			System.out.print(a);
			System.out.print(" ");
			sum=a+b;
			a=b;
			b=sum;
			
						
		}
	}

}
