package assQuestion;
import java.util.Scanner;
public class PerfectNumber {
	  public static void main(String[]args)
	{ 
	  Scanner sc = new Scanner(System.in);
	  int num;
	  int sum = 0;
	  System.out.println("Enter a number:");
	  num = sc.nextInt();
	  int i = 1;
	  
	  while(i < num)
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
