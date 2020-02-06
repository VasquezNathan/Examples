import java.util.Scanner;

public class RunShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max;
		System.out.print("Enter the number of Cheeses for shop setup: ");
		max = input.nextInt();
		ShopArr shop = new ShopArr(max);
		shop.run();
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
		input.close();
	}

}
