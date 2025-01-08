//Write a java program to check a person is eligible for vote or not . //


package controlStatements;
import java.util.Scanner;
public class ChackAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		System.out.println("Enter a age:");
		String result = age > 18 ? "He is elligible for vote " : "not ellgible ";
	    System.out.println(result);	
	}

}
