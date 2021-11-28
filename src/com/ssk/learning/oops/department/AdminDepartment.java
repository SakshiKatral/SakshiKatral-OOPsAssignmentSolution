package com.ssk.learning.oops.department;

public class AdminDepartment extends SuperdDepartment{
	@Override
	public String departmentName(){
		return "Admin Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete your document Submission";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
