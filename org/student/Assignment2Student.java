package org.student;

import org.department.Assignment2Department;

public class Assignment2Student extends Assignment2Department{

	public void studentName() {
		System.out.println("Method studentName from class Assignment2Student-package org.student");

	}
	
	public void studentDept() {
		System.out.println("Method studentDept from class Assignment2Student-package org.student");

		
	}
	
	private void studentId() {
		System.out.println("Method studentId from class Assignment2Student-package org.student");

	}
	
	public static void main(String[] args) {

		Assignment2Student student=new Assignment2Student();
		
		student.studentName();
		student.studentDept();
		student.studentId();
		student.deptName();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		
	}

}
