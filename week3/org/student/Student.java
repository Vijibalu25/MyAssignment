package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		String name="Vijayalakshmi";
		System.out.println("Student Name is :" +name);
	}
	
	public void studentDept()
	{
		String dept="BCA";
		System.out.println("Stuendt Department :"+dept);
	}
	
	public void studentId()
	{
		int id=12345;
		System.out.println("Student ID :"+id);
	}

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.deptName();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
	}
}
