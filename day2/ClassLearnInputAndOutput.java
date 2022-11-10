package week1.day2;


public class ClassLearnInputAndOutput {
	
	
	public double add(int num1, int num2, double num3) {
		
		double result = num1+num2+num3;
		System.out.println("Test  " +result);
	
		return result;
		
		
			}
	
	

	public static void main (String [] args)
	{
		
		ClassLearnInputAndOutput cliao=new ClassLearnInputAndOutput();
		double result = cliao.add(10, 20,30.99);
		System.out.println(result);
		
	}
	
}
