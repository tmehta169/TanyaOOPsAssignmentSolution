package com.greatlearning.model1;

import com.greatlearning.model.Super_Dept;

public class Admin extends Super_Dept
{
	public void departmentName()
	{
		System.out.println("Welcome to Admin Department");
	}
	
	public void getTodayswork()
	{
		System.out.println("Today's Work:Complete your document submission");
	}
	
	public void getWorkDeadline()
	{
		System.out.println("Work Deadline:Complete by EOD");
	}
	
	public void isTodayHoliday()
	{
		System.out.println("Today is not holiday");
	}
	
}