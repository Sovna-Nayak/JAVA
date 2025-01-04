import java.util.Scanner;
class ElectricityBill
{
  public static void main(String[]args)
  { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter consumer Name:");
     String name=sc.nextLine();
     System.out.println("Enter consumer No:");
     String con=sc.nextLine();
     System.out.println("Enter month/year:");
     String month=sc.nextLine();
     System.out.println("Enter prevReding:");
     int prevRed = sc.nextInt();
     System.out.println("Enter currentReding:");
     int currRed = sc.nextInt();
     int unit = currRed-prevRed;
     double price=0;
     if(unit>1  &&  unit<=100){
      price=unit*5;
     }
     else if(unit>100  &&  unit<=300){
      price=500+(unit-100)*7;
     }
     else if(unit > 300){
     price=1900+(unit-300)*8;
     }
     System.out.println("Consumer Name:"+name);
     System.out.println("Consumer No:"+con);
     System.out.println("Bill month/year:"+month);
     System.out.println("PrevReding:"+prevRed);
     System.out.println("CurrReding:"+currRed);
     System.out.println("Unit:"+unit);
     System.out.println("Price:"+price);
    
     
}
}
     
     