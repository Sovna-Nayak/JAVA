//Write a java program to print all odd number between 1 to 100 . //



package ASS;
import java.util.Scanner;
public class OddNumberPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number limit:");
		int num = sc.nextInt();
		int i = 1;
		while(i <= 100) {
		if( i % 2  != 0) {
				System.out.println(i +" ");
		}
			i ++;
		}

	}

}
