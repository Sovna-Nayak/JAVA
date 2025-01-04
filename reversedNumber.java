//Write a program reversed of a number using java.// 




package assQuestion;
import java.util.Scanner;
public class reversedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int reversednum = 0;
		while(num > 0) {
			int reminder = num % 10;
		    reversednum  = reversednum * 10 + reminder;
			num = num/10;
		}
		System.out.println("reversednum="+reversednum);
		

	}

}
