public class empwagecalculation {

	public static final int IS_FULL_TIME =1;
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage computation");
		int emp_rate_per_hour=20;
		int emp_hours;
		int emp_wage;
    		double empcheck = Math.floor(Math.random() * 10) % 2;
	        if ( empcheck == IS_FULL_TIME )
		    emp_hours=8;
    		else
		    emp_hours=0;
		emp_wage= emp_hours * emp_rate_per_hour;
		System.out.println("Employee wage" + emp_wage);
	}
}
