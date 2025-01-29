// write a java program to accept of numbers and print them.

package assignment;
import java.util.Scanner;
public class arrayNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Enter the numbers in the array:");
		for(int i=0;i<numbers.length;i++){
		System.out.println("Enter value at numbers["+i+"]:");
			numbers[i] = sc.nextInt();
		}
		System.out.println("Println numbers:");
		for(int i=0;i<numbers.length;i++){
			//System.out.println(numbers[i]);
			System.out.println("numbers["+i+"]="+numbers[i]);
		}

	}

}
