//Write a program Write a program to input the basic salary of an employee and calculate its Gross salary according to the following:
      //Basic Salary <= 10000 : HRA = 20%, DA = 80%
      //Basic Salary <= 20000 : HRA = 25%, DA = 90%
      //Basic Salary > 20000 : HRA = 30%, DA = 95%




package assQuestion;
import java.util.Scanner;
public class EmployeeSalary {
  public static void main(String[]args)
	  { 
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a Basic salary:");
	     double basicSalary=sc.nextDouble();   
	     double hra,dr,grossSalary;
	     if(basicSalary<=10000){
	      hra=0.2*basicSalary;
	      dr=0.8*basicSalary;
	     }
	     else if(basicSalary<=20000){
	      hra=0.25*basicSalary;
	      dr=0.9*basicSalary;
	     }
	     else{
	      hra=0.3*basicSalary;
	      dr=0.95*basicSalary;
	     }
	     grossSalary=basicSalary+hra+dr;
	     System.out.println("GrossSalary:"+grossSalary);
	  }
	
}
