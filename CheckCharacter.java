//Write a program to check whether a character is an alphabet or not.//



package assQuestion;
import java.util.Scanner;
public class CheckCharacter {
	  public static void main(String[]args)
	  { 
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a character:");
	     Character ch=sc.next().charAt(0);
	     if(Character.isLetter(ch)){
	        System.out.println("The character is a Alphabet.");
	     }
	     else{
	        System.out.println("The character is not a Alphabet.");
	     }
	  }
	}
