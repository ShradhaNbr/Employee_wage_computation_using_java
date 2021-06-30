public class empwagecalculation {
public static void main(String args[])
{
System.out.println("Welcome to Employee Wage computation");
int IS_FULL_TIME =1;
int wage_per_hour=20;
int work_hour;
    double empcheck = Math.floor(Math.random() * 10) % 2;
    if ( empcheck == IS_FULL_TIME )
    {
    System.out.println("Employee is Present");
    work_hour=8;
    }
    else
    System.out.println("Employee is Absent");
    work_hour=0;
}
}
