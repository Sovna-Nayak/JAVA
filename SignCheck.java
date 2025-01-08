//Write a java program to take 3 number from keyboard and find largest one using ternary operation. // 



package controlStatements;
import java.util.Scanner;
public class SignCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x , y & z:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int largest = x > y && x > y ? x : y > z ? y : z;
		System.out.println(largest);
	}

}
