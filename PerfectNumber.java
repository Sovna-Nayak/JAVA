//Write a java program to print all perfect number  1 to 10000.//


package ASS;
import java.util.Scanner;
public class PerfectNumber {
		  public static void main(String[]args)
		{ 
		  Scanner sc = new Scanner(System.in);
		  int num;
		  int sum = 0;
		  System.out.println("Enter a number:");
		  num = sc.nextInt();
		  int i = 10000;
		  
		  while(i <= 10000)
		  {
		   if(num % i == 0)
		    {
		      sum = sum + i;
		    }
		   i = i + 1;
		  }
		 if(num == sum)
		 {
		   System.out.println("Number is perfect");
		 }
		 else{
		  System.out.println("Number is not perfect");
		 }
		
		}
	}

