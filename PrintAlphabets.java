//Write a java program to print alphabet A to Z.//



package ASS;
import java.util.Scanner;
public class PrintAlphabets {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  char ch = 'A';
	 
      while(ch <='Z')
      {
    	  System.out.print(ch+" ");
    	  ch++;
      }
      
	}

}
