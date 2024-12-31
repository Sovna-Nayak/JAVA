// Write a java program to check whether a number is even or odd.//



import java.util.Scanner;
class EvanOdd
{
  public static void main(String[]args)
  { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int n=sc.nextInt();
     if(n % 2 == 0){
     System.out.println("The number is Even.");
     }
     else{
     System.out.println("The number is odd.");
     }
  }
}

 