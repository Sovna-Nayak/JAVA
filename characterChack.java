//Write a program to input any character and check whether it is the alphabet , digit , or special character. //
package assQuestion;
import java.util.Scanner;
public class characterChack {
	
	class VowelConsonant
	{
	  public static void main(String[]args)
	  { 
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a character:");
	     Character ch=sc.next().charAt(0);
	     if(Character.isLetter(ch)){
	        System.out.println("The character is a Alphabet.");
	     }
	    else if(Character.isDigit(ch)){ 
	       System.out.println("The character is a Digit.");
	    }
	    else {
	       System.out.println("The character is a SpecialCharacter.");
	    }
	   }
	}
}
	