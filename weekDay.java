//Write a program to input the week number and print the weekday. //





package assQuestion;
import java.util.Scanner;
public class weekDay {
      public static void main(String[]args)
	  { 
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a Day:");
	     int day=sc.nextInt();
	     if(day==1){
	     System.out.println("Monday");
	     }
	     else if(day==2){
	     System.out.println("Tuesday");
	     }
	     else if(day==3){
	     System.out.println("Wednesday");
	     }
	     else if(day==4){
	     System.out.println("Thursday");
	     }
	     else if(day==5){
	     System.out.println("Friday");
	     }
	     else if(day==4){
	     System.out.println("Saturday");
	     }
	     else{
	     System.out.println("Sunday");
	     }
	  }
	}
	     
