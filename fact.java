import java.util.Scanner;
 
 class Fact
  {
     public static void main(String[] args)
     {
        //Creating an Object of Scanner class for accessing method to take inputs
        Scanner sc  = new Scanner(System.in);
 
        System.out.println("Enter a number :");
        int num  = sc.nextInt();
        int fact =1;
        while(num>0){
           fact = fact * num ;
           num  = num -1 ;
        }
        System.out.println("Factorial is "+fact); 
        
     }
}
