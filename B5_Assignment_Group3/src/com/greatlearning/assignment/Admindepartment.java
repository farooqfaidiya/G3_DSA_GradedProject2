package com.greatlearning.assignment;

public class Admindepartment extends Superdepartment {

	@Override
	public String departmentName() {
		return " Admin Department ";

	}

	@Override
	public String getTodaysWork() {
		return " Complete your Document Submission ";
	}

	@Override
	public String getWorkDeadline() {
		return " Complete by EOD ";
	}
}
