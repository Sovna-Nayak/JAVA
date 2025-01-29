//Write a java program to calaculate the totalSalary and average salary.//


package assignment;
import java.util.Scanner;
public class CalaculateEmployeeSalalry {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double[] salaries = new double[5];
			double totalSalary = 0;
			double averageSalary = 0;
			for(int i = 0;i<salaries.length;i++) {
				System.out.println("Enter salary of Employee"+(i+1)+":");
				salaries[i] = sc.nextInt();
			}
			for(int i = 0;i<salaries.length;i++) {
				System.out.println("Employee"+(i+1)+" salary :"+salaries[i]);
			}
           for(int i = 0;i<salaries.length;i++) {
        	   totalSalary = totalSalary + salaries[i];
           }
           System.out.println("------------------------------------------");
           System.out.println("Total Salary: "+totalSalary);
           System.out.println("Average Salary: "+(totalSalary/salaries.length));
           
	}

}
