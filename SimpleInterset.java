//Write a java program to calculate simple Interset.//



package assQuestion;
import java.util.Scanner;
public class SimpleInterset {
	  public static void main(String[]args)
	{ 
	  Scanner sc=new Scanner(System.in);
	  double p,r,t,si;
	  System.out.println("Enter P:");
	  p=sc.nextDouble();
	  System.out.println("Enter r:");
	  r=sc.nextDouble();
	  System.out.println("Enter t:");
	  t=sc.nextDouble();
	  si=(p*t*r)/100;
	  System.out.println("si"+si);
	}

	  
}
