//Write java a program to print table.//



package ASS;
import java.util.Scanner;
public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:" );
		int num = sc.nextInt();
		int i = 1;
		while(i <= 10) {
			System.out.println(num + " x " + i + " = " + (num * i));
			i++;
		}
	}

}
