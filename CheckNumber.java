//Write a java program to check a number is even or odd. //


package controlStatements;
import java.util.Scanner;
public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter a number:");
		String result = num % 2 == 0 ? "Number is even" : "Number is odd";
		System.out.println(result);
	}

}
