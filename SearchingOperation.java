//Write a java program to searching a number .//


package assignment;
import java.util.Scanner;
public class SearchingOperation {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
    int[] nums = {10 , 20 , 30 , 40 , 50 , 5 , 60 , 60 , 70 , 80 };
    System.out.println("Please Enter number to be searched: ");
    int item = sc.nextInt();
    boolean isFound = false;
    for(int i=0;i<nums.length;i++) {
    	if(nums[i] == item) {
    		System.out.println("Item found at index "+i+" , location" +(i+1));
    		isFound = true;
    		break;
    	}
    }
    if(!isFound) {
    	System.out.println("Item is not found.");
    }
	
}

}
