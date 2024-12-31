//problem- Write a program to check the number is amstrong or not.//




import java.util.Scanner;
class AmstrongNumber
{
  public static void main(String[]args)
{ 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num,sum=0,temp,digit;
  num=sc.nextInt();
  temp=num;
  while(num!=0)
  {
    digit=num%10;
    sum=sum+digit*digit*digit;
    num=num/10;
  }
  if(sum==temp)
  {
    System.out.println("Amstrong");
  }
  else{
    System.out.println("not a amstrong");
  }
 }

}
