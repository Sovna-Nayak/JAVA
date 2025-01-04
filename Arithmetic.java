package assQuestion;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		//int sum = n1 + n2;
		//int sub = n1 - n2;
		//int mul = n1 * n2;
		//int div = n1 / n2;
		//int mod = n1 % n2;
		System.out.println(n1+"+"+n2+"="+(n1 + n2));
		System.out.println(n1+"-"+n2+"="+(n1 - n2));
		System.out.println(n1+"*"+n2+"="+(n1 * n2));
		System.out.println(n1+"/"+n2+"="+(n1 / n2));
		System.out.println(n1+"%"+n2+"="+(n1 % n2));
	}

}
