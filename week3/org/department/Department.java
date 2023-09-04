package org.department;

import org.college.College;

public class Department extends College{

	public void deptName()
	{
		String deptname = "Computer Applications";
		System.out.println("Department Name:" +deptname);
	}
	
	public static void main(String[] args) {
		
		Department dep = new Department();
		dep.collegeName();
		dep.collegeCode();
		dep.collegeRank();
	}
}
