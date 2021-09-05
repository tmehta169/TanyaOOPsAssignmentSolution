package com.greatlearning.model2;

import com.greatlearning.model.Super_Dept;

public class HR extends Super_Dept
{
	public void departmentName()
	{
		System.out.println("Welcome to HR Department");
	}
	
	public void getTodayswork()
	{
		System.out.println("Today's Work:Fill today’s worksheet and mark your attendance");
	}
	
	public void getWorkDeadline()
	{
		System.out.println("Work Deadline:Complete by EOD");
	}
	
	public void isTodayHoliday()
	{
		System.out.println("Today is not holiday");
	}
	
	public void doActivity()
	{
		System.out.println("Activity:Organise Team Lunch");
	}
}
