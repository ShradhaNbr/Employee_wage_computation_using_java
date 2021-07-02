public class empwagecalculation {

	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME =2;
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage computation");
		int emp_rate_per_hour=20;
		int emp_hours;
		int emp_wage;
		int working_days=20;
		int total_emp_wage=0;
		for(int day=0; day<working_days; day++) {
	    		int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
	        		case IS_FULL_TIME:
				    emp_hours=8;
				    break;
				case IS_PART_TIME:
				    emp_hours=4;
				    break;
	    			default:
			    	    emp_hours=0;
			}
			emp_wage= emp_hours * emp_rate_per_hour;
			total_emp_wage+=emp_wage;
			System.out.println("Employee wage" + emp_wage);
		}
		System.out.println("Total Emp Wage" + total_emp_wage);
	}
}
