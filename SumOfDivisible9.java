package ASS;
import java.util.Scanner;
public class SumOfDivisible9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number limit:");
		int n = sc.nextInt();
		int sum = 0;
		int i = 9;
		while(i <= 200) {
			if(i % 9 == 0) {
				System.out.println(i + " ");
			}
			sum += i;
			i +=2;
		}
		System.out.println("Sum of number between 100  to 200 which divisible by 9 : " +sum );

	}

}
