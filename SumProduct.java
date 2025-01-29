package assignment;
import java.util.Scanner;
public class SumProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Press1.Addition");
		System.out.println("Press2.Substration");
		System.out.println("Press3.Multiplication");
		System.out.println("Press4.Division");
		System.out.println("Press5.Modolus");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println(n1 + n2);
			break;
		case 2:
			System.out.println(n1 - n2);
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			System.out.println(n1 / n2);
			break;
		case 5:
			System.out.println(n1 % n2);
			break;	
		default:
			System.out.println("Invalid");
		}
	}

}
