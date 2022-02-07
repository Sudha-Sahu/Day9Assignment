package com.Bridgelabz.Day9Assignment;

public class EmployeeWageUsingConstructor{

	public final int PARTTIME = 1;
	public final int FULLTIME = 2;
	public final int EMPRATEPERHR=20;
	public final int NO_Of_WORKING_DAYS = 20;	

	EmployeeWageUsingConstructor() {

		System.out.println("Welcome to Employee Wage Problem using Constructor!!!!");
	}
	public int calcEmployeeWage(int empHrs, int empWage, int empWageforMonth) {

		int day = 0;
		while(day < NO_Of_WORKING_DAYS) {
			int empCheck = (int) Math.floor (Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				empHrs=4;
				break;
			case 2:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			day++;
			empWage= empHrs * EMPRATEPERHR;
			System.out.println("EmpWage in day : "+day+" is : "+empWage);
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
