//WAP to check a character is vowel or consonant.//
package assQuestion;
import java.util.Scanner;
public class VowleConsonant{
  public static void main(String[]args)
	  { 
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a Alphabet:");
	     Character ch=sc.next().charAt(0);
	     switch(ch){
	          case 'a':
	          case'A': 
	            
	          case 'e':
	          case 'E':  
	            
	          case 'i':
	          case 'I':
	            
	          case 'o':
	          case 'O':  
	           
	          case 'u':
	          case 'U':
	            System.out.println("charater is a vowel");
	            break;
	         default:
	           System.out.println("character is a consonant.");
	           break;
	         }
	     }
	}
