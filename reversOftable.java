//Write java a program to print reverse table.//



package ASS;
import java.util.Scanner;
public class reversOftable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:" );
		int num = sc.nextInt();
		int i = 10;
		while(i >= 1) {
			System.out.println(num + " x " + i + " = " + (num * i));
			i--;
		}
	}

}
