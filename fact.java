//Write a java programm to factorial of a number.
package assignment;
import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int fact = 1;
		while (num > 0) {
			fact = fact * num;
			num = num -1;
		}
		System.out.println(fact);

	}

}
