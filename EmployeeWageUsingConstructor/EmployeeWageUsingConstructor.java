package com.Bridgelabz.Day9Assignment;

public class EmployeeWageUsingConstructor{
	
	public final int PARTTIME = 1;
	public final int FULLTIME = 2;
	public final int EMPRATEPERHR=20;

	EmployeeWageUsingConstructor() {
		
		System.out.println("Welcome to Employee Wage Problem using Constructor!!!!");
	}
	public int calcEmployeeWage(int empHrs, int empWage) {
	
		double empCheck = Math.floor (Math.random() * 10) % 3;
		if (empCheck == PARTTIME)
			empHrs=4;
		else if(empCheck == FULLTIME)        
			empHrs=8;
		else
			empHrs=0;
		empWage= empHrs * EMPRATEPERHR;
		System.out.println("calculating EmpWage: "+empWage);
		return 0;
	}
	public static void main(String[] args) {
		
		EmployeeWageUsingConstructor emp = new EmployeeWageUsingConstructor();
		emp.calcEmployeeWage(0, 0);
	}
}
