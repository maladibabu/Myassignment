package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ClassLearnList {

	public static void main(String[] args) {
	
	List<String> courses=new ArrayList<String>();
	
		courses.add("Java");
		courses.add("Selenium");
		courses.add(".Net");
		courses.add("JSON");
		
		
	System.out.println(courses);
	System.out.println(courses.size());
	System.out.println(courses.isEmpty());
	System.out.println(courses.get(2));
	System.out.println(courses.contains(".Net"));
	System.out.println(courses.remove(2));
	System.out.println(courses.get(2));
	System.out.println(courses.remove(courses));
	System.out.println(courses);
	courses.add(1, "Workday");
	System.out.println(courses);
	System.out.println(courses.get(2));
	}
	
	}


