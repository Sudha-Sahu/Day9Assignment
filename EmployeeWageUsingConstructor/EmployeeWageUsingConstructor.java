package com.Bridgelabz.Day9Assignment;

public class EmployeeWageUsingConstructor{

	public final int PART_TIME = 1;
	public final int FULL_TIME = 2;
	
	EmployeeWageUsingConstructor() {

		System.out.println("Welcome to Employee Wage Problem using Constructor!!!!");
	}
	public int calcEmployeeWage(String company, int empRatePerHr, int maxNoOfDays, int maxHrforMonth) {

		int noOfDays = 0, noOfHrs = 0;
		int empHrs, empWage=0, empWageforMonth=0;
		while(noOfDays < maxNoOfDays && noOfHrs < maxHrforMonth) {
			int empCheck = (int) Math.floor (Math.random() * 10) % 3;
			if (empCheck == PART_TIME)
				empHrs=4;
			else if(empCheck == FULL_TIME)        
				empHrs=8;
			else
				empHrs=0;
			noOfDays++;
			noOfHrs++;
			empWage= empHrs * empRatePerHr;
			System.out.println(company+" EmpWage in day : "+noOfDays+" is : "+empWage);
			empWageforMonth = empWageforMonth+empWage;
		}
		System.out.println("Total EmpWage for "+company+" in month is : "+ empWageforMonth);
		return empWageforMonth;
	}
	public static void main(String[] args) {

		EmployeeWageUsingConstructor emp = new EmployeeWageUsingConstructor();
		emp.calcEmployeeWage("DMART", 20, 20, 100);
		emp.calcEmployeeWage("Reliance", 10, 25, 150);
		emp.calcEmployeeWage("Airtel", 15, 20, 140);
	}
}
