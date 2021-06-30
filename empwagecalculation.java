public class empwagecalculation {
public static void main(String args[])
{
System.out.println("Welcome to Employee Wage computation");
int IS_FULL_TIME=1;
int IS_PART_TIME=2;
int wage_per_hour=20;
int work_hour;
int wage;
    double empcheck = Math.floor(Math.random() * 10) % 3;
    if ( empcheck == IS_FULL_TIME )
    {
    System.out.println("Employee is Present");
    work_hour=8;
    }
    else if ( empcheck == IS_PART_TIME )
    {
    System.out.println("Employee is present part time");
    work_hour=4;
    }
    else
    {
    System.out.println("Employee is Absent");
    work_hour=0;
    }
wage = wage_per_hour * work_hour;
System.out.println("Wage of the employee is" + wage);

}
}
