// Write a java program to print the person's name in array.//
package assignment;
import java.util.Scanner;
public class name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[4];
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter Name-"+(i+1)+":");
			names[i] = sc.nextLine();
		}
		for(int i=0;i<names.length;i++) {
			System.out.println("NAME-"+(i+1)+"="+names[i]);
			
		}

	}

}
