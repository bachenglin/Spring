package com.defautmethods;

public class EmployeeImpl implements Employee,EmpInterface {

	
	public void populate() 
	{
		

	}
	public void display()
	{
		Employee.super.process();
		EmpInterface.super.display();
	}

	public static void main(String[] args) 
	{
		EmployeeImpl emp = new EmployeeImpl();
		emp.display();
		emp.process();
	}

}
