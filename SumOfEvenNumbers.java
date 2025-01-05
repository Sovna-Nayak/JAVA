
//Write a java program to print all even number between 1 to n . //



package ASS;
import java.util.Scanner;
public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit(n):");
		int n = sc.nextInt();
		int i = 2;
		int sum = 0;
		while(i <= n) {
				i+=2;
			    sum += i;
		}
			System.out.println("sum of all even number between 1 and " + n + " is : " + sum);
		}

	}


