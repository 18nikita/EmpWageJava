package com.EmpWage;

public class PartTimeEmpWage {

	public static void main(String[] args) {
		//UC-3-Part time employee wage calculation
		
		//Constants 
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int EMP_RATE_PER_HOUR=20;
		
//Variables
	int empHrs = 0;
	int empWage = 0;
		
//Computation
	double empCheck= Math.floor(Math.random() * 10 ) % 3;
		
		if(empCheck == IS_PART_TIME) {
			empHrs = 4;
			System.out.println("Employee is PartTime");
		}

		else if(empCheck == IS_FULL_TIME) {
				empHrs = 8;
			System.out.println("Employee is FullTime");
		}
		else {
			System.out.println("Employee is Absent");
		}
			
			//Formula
			empWage = empHrs*EMP_RATE_PER_HOUR;
			System.out.println("Employee Wage is: " + empWage);
	}
	}

