//Write a java program to count a paticular number present with in array of a numbers.//



package assignment;
import java.util.Scanner;
public class CountTheNumberOrfrequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] nums = {10 , 20 , 30 , 40 , 50 , 5 , 60 , 60 , 70 , 80 ,5};
	    System.out.println("Please Enter number to be searched: ");
	    int item = sc.nextInt();
	    int count = 0;
	    for(int i=0;i<nums.length;i++) {
	    	if(nums[i] == item) {
	    		count++;
	    	}
	    }
	     
	    	System.out.println(item + " present in the array " + count + " times");
		
	}

	}
