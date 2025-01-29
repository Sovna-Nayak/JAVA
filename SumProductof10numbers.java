//Write a java program to input numbers print their sum and product.

package assignment;
import java.util.Scanner;
public class SumProductof10numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
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
        System.out.println("Sum of numbers:"+sum);
        System.out.println("Product of the number:"+product);
	}

}
