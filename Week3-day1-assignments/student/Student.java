package student;

import department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student name is Karthik C");
	}
	
	public void studentDept()
	{
		System.out.println("Student department is Mechanical Engineering");
	}
	public void studentID()
	{
		System.out.println("Student ID is 123456");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentID();

	}

}
