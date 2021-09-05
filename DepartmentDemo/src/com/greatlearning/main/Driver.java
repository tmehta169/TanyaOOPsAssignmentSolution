package com.greatlearning.main;
import com.greatlearning.dept.Department;
import com.greatlearning.model.Super_Dept;
import com.greatlearning.model1.Admin;
import com.greatlearning.model2.HR;
import com.greatlearning.model3.Tech;

import java.util.Scanner;

public class Driver 
{
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String []args) 
	{

		System.out.println("Choose your dept:");
		System.out.println("1.Super Department");
		System.out.println("2.Admin Department");
		System.out.println("3.HR Department");
		System.out.println("4.Tech Department");
		
		int choice= sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			new Department();
			Super_Dept superd = new Super_Dept();
			superd.departmentName();
			superd.getTodayswork();
			superd.getWorkDeadline();
			superd.isTodayHoliday();
			break;

		case 2:
			new Department();
			Admin ad = new Admin();
			ad.departmentName();
			ad.getTodayswork();
			ad.getWorkDeadline();
			ad.isTodayHoliday();
		break;

		case 3:
			new Department();
			HR hr = new HR();
			hr.departmentName();
			hr.getTodayswork();
			hr.getWorkDeadline();
			hr.isTodayHoliday();
			hr.doActivity();
		break;

		case 4:
			new Department();
			Tech tech = new Tech();
			tech.departmentName();
			tech.getTodayswork();
			tech.getWorkDeadline();
			tech.isTodayHoliday();
			tech.getTechStackInformation();
		break;

		default:
		System.out.println("incorrect choice");
		return;
		}	
		
	}

}
