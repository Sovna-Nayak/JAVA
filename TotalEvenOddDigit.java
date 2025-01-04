//Find count total number of odd digit and total number of even digit in a number using java.//



package assQuestion;
import java.util.Scanner;
public class TotalEvenOddDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int evencount = 0;
		int oddcount = 0; 
		  while(n > 0)
		  {
		    int digit = n % 10;
		    if(digit % 2 == 0)
		    {
		      evencount = evencount + 1;
		    }
		    else
		   {
		     oddcount = oddcount+1;
		   }
		   n = n / 10;
		  }
		  System.out.println("evencount"+evencount);
		  System.out.println("oddcount"+oddcount);
		}
		}