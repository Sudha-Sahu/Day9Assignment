package com.Bridgelabz.Day9Assignment;

public class EmployeeWageUsingConstructor{

	public final int PART_TIME = 1;
	public final int FULL_TIME = 2;
	public final int EMP_RATE_PER_HR=20;
	public final int MAX_NO_Of_WORKING_DAYS = 20;
	public final int MAX_WORKING_HRS=100;

	EmployeeWageUsingConstructor() {

		System.out.println("Welcome to Employee Wage Problem using Constructor!!!!");
	}
	public int calcEmployeeWage(int empHrs, int empWage, int empWageforMonth) {

		int noOfDays = 0;
		int noOfHrs = 0;
		while(noOfDays < MAX_NO_Of_WORKING_DAYS && noOfHrs < MAX_WORKING_HRS) {
			int empCheck = (int) Math.floor (Math.random() * 10) % 3;
			if (empCheck == PART_TIME)
				empHrs=4;
			else if(empCheck == FULL_TIME)        
				empHrs=8;
			else
				empHrs=0;
			noOfDays++;
			noOfHrs++;
			empWage= empHrs * EMP_RATE_PER_HR;
			System.out.println("EmpWage in day : "+noOfDays+" is : "+empWage);
			empWageforMonth = empWageforMonth+empWage;
		}
		System.out.println("calculating EmpWage for month: "+ empWageforMonth);
		return 0;
	}
	public static void main(String[] args) {

		EmployeeWageUsingConstructor emp = new EmployeeWageUsingConstructor();
		emp.calcEmployeeWage(0, 0, 0);
	}
}
