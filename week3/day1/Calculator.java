package week3.day1;


public class Calculator {

	public void add(int a, int b) {
		int add;
		add=a+b;
		System.out.println("Add method with two arguments   "+add);
		}	
	
	public void add(int a, int b, int c) {
		int add;
		add=a+b+c;
		System.out.println("Add method with three arguments   "+add);
		}	
	
	
	public void sub(double a, double b) {
		double sub;
		sub=a-b;
	System.out.println(sub);

	}
	
	public void sub(int a, int b) {
		int sub;
		sub=a-b;
	System.out.println(sub);
	}
	
	public void mul(int a, double b) {
     
		double mul;
		mul=a*b;
		System.out.println("Mul method with two arguments int double   "+mul);
	}
	
	public void mul(double a, double b) {
	     
		double mul;
		mul=a*b;
		System.out.println("Mul method with two arguments double double   "+mul);
	}
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.add(12, 2);
		cal.add(12, 2, 3);
		
		cal.sub(13.25, 12.12);
		cal.sub(20, 12);
		
		cal.mul(2, 12.12);
		cal.mul(12.12, 12.1);
		
	}
}
