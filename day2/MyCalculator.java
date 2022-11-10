package week1.day2;

public class MyCalculator {
	


	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		int add = cal.add(12, 12, 13);
		int sub = cal.sub(19,13);
		double mul = cal.mul(19.12,13);
		float div = cal.div(12.8f, 2f);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		
	}

}
