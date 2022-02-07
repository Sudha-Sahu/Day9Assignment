package com.Bridgelabz.Day9Assignment;

public class EmployeeWageUsingConstructor{
	
	public final int PARTTIME = 1;
	public final int FULLTIME = 2;
	public final int EMPRATEPERHR=20;

	EmployeeWageUsingConstructor() {
		
		System.out.println("Welcome to Employee Wage Problem using Constructor!!!!");
	}
	EmployeeWageUsingConstructor(int isFullTime) {
	
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor (Math.random() * 10) % 2;                   
		if (empCheck == isFullTime)
			empHrs=8;
		else            
			empHrs=0;
		empWage= empHrs * EMPRATEPERHR;
		System.out.println("calculating EmpWage: "+empWage);
	}
	public static void main(String[] args) {
		
		EmployeeWageUsingConstructor emp = new EmployeeWageUsingConstructor();
		emp = new EmployeeWageUsingConstructor(1);
	}
}
