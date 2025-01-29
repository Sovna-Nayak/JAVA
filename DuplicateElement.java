//Write a java program to count how many duplicate element are their.//



package assignment;
import java.util.Scanner;
public class DuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] arr = {10 , 20 , 30 , 40 , 50 , 5 , 60 , 60 , 70 , 80 ,5};
	    System.out.println("Duplicate alament in the given arry: ");
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i] == arr[j]) {
	    			System.out.println(arr[j]);
	    		}
	    	}
	}
	}
}

