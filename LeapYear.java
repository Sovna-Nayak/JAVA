//Writer a java program to check whether a year is a leap year or not.//




import java.util.Scanner;
class LeapYear
{
  public static void main(String[]args)
  { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a year:");
     int year=sc.nextInt();
     boolean isLeapYear=false;
     if(year % 4==0){ 
        if(year % 100==0){
          if(year %400==0){ 
          isLeapYear=true;
         }
        else{
         isLeapYear=true;
        }
     }
    if(isLeapYear){
      System.out.println("The year is LeapYear.");
    }
    else{
      System.out.println("The year is not a LeapYear.");
    }
}
}
}
