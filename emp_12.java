  
package com.empwage.company;

public class EmployeeWage
{
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;

	public void wageCompute(companyEmployeeWage companyEmp)
	{
		int empHours=0;
		int totalEmpHours=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		while(totalWorkingDays < companyEmp.getNoOfWorkingDay() && totalEmpHours < companyEmp.getmaxHoursInMonth())
		{
			int employeePresence=(int) ( ( Math.random()*10 ) % 3);
			switch(employeePresence)
			{
			case IS_PART_TIME:
						empHours=4;
						break;
			case IS_FULL_TIME:
						empHours=8;
						break;
			default:
						empHours=0;
			}

	}
}
