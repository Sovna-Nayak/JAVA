//Write a program to check whether a character is uppercase or lowercase alphabet . //




package assQuestion;
import java.util.Scanner;
public class CharacterUppOrLow {
	  public static void main(String[]args)
	  { 
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a Alphabet:");
	     Character ch=sc.next().charAt(0);
	     if(Character.isUpperCase(ch)){
	       System.out.println("UpperCase:"+ch);  
	     }
	     else if(Character.isLowerCase(ch)){
	       System.out.println("LowerCase:"+ch);
	     }
	     else{
	       System.out.println("Character is not a alphabet.");
	     }
	  }
	}
