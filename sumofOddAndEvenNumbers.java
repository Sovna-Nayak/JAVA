//Write a java program to input 10 numbers print the sum of odd and even numbers separately.

package assignment;
import java.util.Scanner;
public class sumofOddAndEvenNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum = 0;
    int product = 1;
    System.out.println("Enter 10 numbers:");
    for(int i=0;i<10;i++) {
    	//System.out.println("Enter number "+(i + 1)+ " :");
    	System.out.println("Enter number "+(i + 1)+ " :");
		int n =  sc.nextInt();
    	sum= sum+n;
    	product=product*n;
    }
    if(sum % 2 == 0) {
		System.out.println("It is EvenNUmber.");
	}
	else {
		System.out.println("It is odd number.");
	}
    System.out.println("Sum of numbers:"+sum);
    System.out.println("Product of the number:"+product);


	}

}
