package com.ssk.learning.oops.main;

import com.ssk.learning.oops.department.AdminDepartment;
import com.ssk.learning.oops.department.HRDepartment;
import com.ssk.learning.oops.department.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment adminDepartment =  new AdminDepartment();
		System.out.println("Welcome to " +  adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork() + "\n"
				+ adminDepartment.getWorkDeadline() + "\n"
				+ adminDepartment.isTodayAHolliday());
		System.out.println();
		
		HRDepartment hrDepartment = new HRDepartment();
		System.out.println("Welcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity() + "\n"
				+ hrDepartment.getTodaysWork() + "\n"
				+ hrDepartment.getWorkDeadline() + "\n" 
				+ hrDepartment.isTodayAHolliday());
		System.out.println();
		
		TechDepartment techDepartment = new TechDepartment();
		System.out.println("Welcome to " + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork() + "\n"
				+ techDepartment.getWorkDeadline() + "\n"
				+ techDepartment.getTechStackInformation() + "\n"
				+ techDepartment.isTodayAHolliday());
	}

}
