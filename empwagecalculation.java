public class empwagecalculation {
public static void main(String args[])
{
System.out.println("Welcome to Employee Wage computation");
int IS_FULL_TIME=1;
int IS_PART_TIME=2;
int wage_per_hour=20;
int work_hour=0;
int wage;
int days_worked=0;
int monthly_wage=0;
while (days_worked<=20 && work_hour<=100 )
{
int empcheck = (int) (Math.random() * 10) % 3;
    switch (empcheck)
	{
	case 1:
    	{
    		System.out.println("Employee is Present");
		    work_hour=8;
			break;
    	}
    	case 2:
    	{
	        System.out.println("Employee is present part time");
    		work_hour=4;
			break;
    	}
    default:
    	{
    System.out.println("Employee is Absent");
    work_hour=0;
    	}
	}
wage = wage_per_hour * work_hour;
System.out.println("Wage of the employee is" + wage);
monthly_wage = wage * days_worked;
days_worked++;
work_hour++;
}
System.out.println("Monthly wage is" + monthly_wage);
}
}
