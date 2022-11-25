package week3.day1;

public class Assignment4Students {
	 
	public void getStudentInfo(int stuid){
		
		System.out.println(stuid);
	}
	
   public void getStudentInfo(int stuid,String name){
		
		System.out.println(stuid +"  " +name);
	}

public void getStudentInfo(String email, int phonenumber){
	
	System.out.println(email +"  " +phonenumber);
}

	public static void main(String[] args) {

		Assignment4Students student=new Assignment4Students();
		
		student.getStudentInfo(20);
		student.getStudentInfo(20, "Selenium");
		student.getStudentInfo("Selenium@gmail.com", 1231231234);
		
		
	}

}
