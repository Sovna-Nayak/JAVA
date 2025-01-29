//Write a java program to input a number and print if it's a prime number or not.//



package assignment;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
	    boolean flag = false;
	    for(int i=2;i<=n/2;i++) {
	    	if(n % i == 0) {
	    		flag = true;
	    		break;
	    	}
		}
	    if(!flag) {
	    	System.out.println(n + " is a primeNumber. ");
	    }
	    else {
	    	System.out.println(n + " is Not a primeNumber. ");
	    }
		
	}
}
