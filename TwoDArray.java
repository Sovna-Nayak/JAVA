package assignment;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] p = {{10,20,30},{40,50,60}};
		System.out.println(p.length);
		System.out.println(p[0].length);
		
		for(int i = 0;i<p.length;i++) {
			for(int j = 0;j<p[i].length;j++) {
				System.out.println(p[i][j]);
			}
		}

	}

}
