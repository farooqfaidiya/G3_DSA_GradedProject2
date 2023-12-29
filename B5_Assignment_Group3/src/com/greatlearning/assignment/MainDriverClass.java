package com.greatlearning.assignment;

public class MainDriverClass {
	public static void main(String[] args) {
		Admindepartment admin = new Admindepartment();
		Hrdepartment hr = new Hrdepartment();
		Techdepartment tech = new Techdepartment();

		displayDepartmentDetails(admin);
		displayDepartmentDetails(hr);
		displayDepartmentDetails(tech);
	}

	private static void displayDepartmentDetails(Superdepartment department) {
		System.out.println("Welcome to " + department.departmentName());
		if (department instanceof Hrdepartment) {
			Hrdepartment hrDepartment = (Hrdepartment) department;
			System.out.println(hrDepartment.doActivity());
		}
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		System.out.println(department.isTodayAHoliday());

		if (department instanceof Techdepartment) {
			Techdepartment techDepartment = (Techdepartment) department;
			System.out.println(techDepartment.getTechStackInformation());
		}
		System.out.println();
	}
}