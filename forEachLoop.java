
//Write a java program using for each loop in given array.//

package assignment;

public class forEachLoop {

	public static void main(String[] args) {
		int[][] p = {{10,20,30},{40,50,60}};
		System.out.println(p.length);
		System.out.println(p[0].length);
		for(int[] item : p) {
			for(int x : item) {
				System.out.println(item);
			}
		}
	}

}
