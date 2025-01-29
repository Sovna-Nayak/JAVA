//Write a java program to addtion of Two  matrix .//

package assignment;
import java.util.Scanner;
public class MatixAddition {

	public static void main(String[] args) {
		int rowSize = 3;
		int colSize = 3;
		int[][] arr1 = new int[rowSize][colSize];
		int[][] arr2 = new int[rowSize][colSize];
		int[][] arr3 = new int[rowSize][colSize];
		arr1[0][0] = 50;
		arr1[0][1] = 10;
		arr1[1][0] = 35;
		arr1[1][1] = 56;
		
		arr2[0][0] = 67;
		arr2[0][1] = 78;
		arr2[1][0] = 10;
		arr2[1][1] = 90;
		
       //Matrix Addition
		for(int i = 0;i<rowSize;i++) {
			for(int j = 0;j<colSize;j++) {
				arr3[i][j] = arr2[i][j] + arr2[i][j];
			}
		}
		for(int i = 0;i<rowSize;i++) {
			for(int j = 0;j<colSize;j++) {
				System.out.println(arr3[i][j]);
			}
		}
			
		
	}

}
