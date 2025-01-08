package controlStatements;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x , y & z:");
		int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    
	    int largest = x > y && x > z ? x : y > z ? y : z;
	    System.out.println(largest);
	}

}
