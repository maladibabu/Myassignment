package week1.day1;

public class TwoWheeler {

	 int noOfWheels = 4;
	 short noOfMirrors = 4;
	 long chassisNumber = 10000001L;
	 boolean isPunctured = false;
	 double runningKM = 3333333.33;
	 String bikeName = "Honda";
	
	public static void main (String[] args)
	{
		
		TwoWheeler tw=new TwoWheeler();
		System.out.println(tw.noOfWheels);
		System.out.println(tw.noOfMirrors);
		System.out.println(tw.chassisNumber);
		System.out.println(tw.isPunctured);
		System.out.println(tw.runningKM);
		System.out.println(tw.bikeName);
		
		
	}
}
