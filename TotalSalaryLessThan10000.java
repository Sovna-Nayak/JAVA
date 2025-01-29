//Find totalSalary & average salary of those empolyee whise salary is less than 1000.//



package assignment;
import java.util.Scanner;
public class TotalSalaryLessThan10000 {

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
       double totalSalary1 = 0;
       int count = 0;
       for(int i = 0;i<salaries.length;i++) {
    	   if(salaries[i] < 10000) {
    		   count++;
    		   totalSalary1 = totalSalary1 + salaries[i];
    	   }
       }
       System.out.println("Total Salary of those empolyee whose salary less than 10000 is "+ totalSalary1);
       System.out.println("Average Salary:" +totalSalary1/count);
	}

}
