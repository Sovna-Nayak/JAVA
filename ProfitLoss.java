//Write a java program to calculate profit or loss. //



package assQuestion;
import java.util.Scanner;
public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       double CostPrice,SellingPrice;
		   System.out.println("Enter costprice:");
		   CostPrice=sc.nextDouble();
		   System.out.println("Enter selling price:");
		   SellingPrice=sc.nextDouble();
		   double profit=SellingPrice-CostPrice;
		   System.out.println("Profit:"+profit);
		   double loss=CostPrice-SellingPrice;
		   System.out.println("Loss:"+loss);
		}
	}
