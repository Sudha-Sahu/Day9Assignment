package com.Bridgelabz.Day9Assignment;

public class EmployeeWageUsingConstructor{

	EmployeeWageUsingConstructor() {

		System.out.println("Welcome to Employee Wage Problem using Constructor!!!!");
	}
	EmployeeWageUsingConstructor(int isFullTime) {
		
		double empCheck = Math.floor (Math.random() * 10) % 2;
		if (empCheck == isFullTime)
			System.out.println("Employee is Present");
		else        
			System.out.println("Employee is Absent");
	}
	public static void main(String[] args) {

		EmployeeWageUsingConstructor emp = new EmployeeWageUsingConstructor();
		emp = new EmployeeWageUsingConstructor(1);
	}
}