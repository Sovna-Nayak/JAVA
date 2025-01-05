

//Write a java program to print all odd number between 1 to n . //



package ASS;
import java.util.Scanner;
public class SumOfOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit(n):");
		int n = sc.nextInt();
		int i = 1 ;
		int sum = 0;
		while(i <= n) {
			    sum += i;
			    i += 2;
		}
			System.out.println("sum of all odd number between 1 and " + n + " is : " + sum);
		}

	}


