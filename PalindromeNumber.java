package ASS;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number:");
	  int n = sc.nextInt();
	  int temp = n;
	  int reversedNum = 0;
	  while(temp > 0) {
		  int digit = n % 10;
		  reversedNum = (reversedNum * 10) + digit;
		  n /=10;
	  }
	  if (n = reversedNum) {
          System.out.println(n + " is a palindrome.");
      } else {
          System.out.println(n + " is not a palindrome.");
      }
  }

	}
