
package assignment;
import java.util.Scanner;
public class Sample2d {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  int[][] arr = new int[3][3];
	  System.out.println("Enter item in the araay:");
	  for(int i = 0; i<arr.length;i++) {
		  for(int j= 0;j<arr[i].length;j++) {
			  System.out.println("Enter value att arr["+i+"]["+j+"] :");
			  arr[i][j] = sc.nextInt();
		  }
	  }
	  //using for each loop
	  //for (int item[] : arr){
	  //
	 System.out.println("Print Array Element");
	  for(int i = 0; i<arr.length;i++) {
		  for(int j= 0;j<arr[i].length;j++) {
			 // System.out.println("Enter value att arr["+i+"]["+j+"] :");
			  //arr[i][j] = sc.nextInt();
			  System.out.println(arr[i][j]+" ");
		  }
		  System.out.println("");
	  }
	  

	}

}
