import java.util.*;

public class ShopArr {

	// Instance Variables
	private Cheese[] cheese;
	
	// Initialize method
	private void init(int max) {
		
		// Create max number of Cheese pointers
		cheese = new Cheese[max]; 
		
		if (max > 0) {
			cheese[0] = new Cheese();
			cheese[0].setName("Humboldt Fog");
			cheese[0].setPrice(25.00);
			
			if (max > 1) {
				cheese[1] = new Cheese("Red Hawk");
				cheese[1].setPrice(40.50);
			
				if (max > 2) {
					cheese[2] = new Cheese("Teleme", 17.25);
					//cheese[2].setName("Wrong Name");
				}
			}
		}
		
		Random ranGen = new Random(100);

		for (int i = 3; i < max; i++) {
			// Fill-in Code
			cheese[i] = new Cheese("Cheese Type " + (char)('A' + i), ranGen.nextInt(1000)/100.0);

			//System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
		
	}
	public ShopArr() {
		init(10);
	}
	
	public ShopArr(int max) {
		init(max);
	}

	/*
	 * Displays the intro message informing the user of various cheeses sold and
	 * Gets the amount of each cheese the user would like to purchase. 
	 */
	private void intro(Scanner input) {
		System.out.println("We sell " + cheese.length + " kinds of Cheese (in 0.5 lb packages)");
		// Fill-in Code
		for(int i = 0; i < cheese.length; i++)	{
			System.out.println(cheese[i].getName() + ": $" + cheese[i].getPrice() + " per pound");
		}
		System.out.println();
		for(int i = 0; i < cheese.length; i++)	{
			System.out.print("Enter the amount of " + cheese[i].getName() + " in lb: ");
			cheese[i].setAmount(input);
		}
		
	}

	/*
	 * Displays the itemized list of all cheeses bought or a special message if none 
	 * were purchased.
	 */
	private void itemizedList(){
		double amt = 0, price = 0;
		// Fill-in Code
		for(int i = 0; i < cheese.length; i++)
		{
			amt += cheese[i].getAmount();
		}
		if(amt == 0)
			System.out.println("No items were purchased.");
		else
			for(int i = 0; i < cheese.length; i++)
			{
				if(cheese[i].getAmount() > 0)
					System.out.printf("%.1f lb of %s @ $%.2f = $%.2f\n", cheese[i].getAmount(), cheese[i].getName(), cheese[i].getPrice(), cheese[i].getPrice()*cheese[i].getAmount());
					
			}
	}

	/*
	 * Calculates the Original Sub Total, which is the price*amount of each 
	 * cheese added together. Returns the Original Sub Total.
	 */
	private double calcSubTotal() {
		double subTotal = 0;
		// Fill-in Code
		for(int i = 0; i < cheese.length; i++) {
			subTotal += cheese[i].getAmount()*cheese[i].getPrice();
		}
		//System.out.print(subTotal);
		return subTotal;
	}

	/*
	 * Calculates discounts based on special offers on Humboldt Fog and Red Hawk, 
	 * stores them in disSpecials[0] and disSpecials[1], and returns the array. 
	 * Minor changes from Lab 07 (identical logic). 
	 */
	private double[] discountSpecials() {
		double[] disSpecials = {0, 0};
		
		double hfAmt = 0, rhAmt = 0;
		if(cheese.length > 0){
			hfAmt = cheese[0].getAmount();
			if(cheese.length > 1)
				rhAmt = cheese[1].getAmount();
		}
		
		if (hfAmt > 0) {
			disSpecials[0] = (float)((int)hfAmt) / 2 * cheese[0].getPrice();
		}
		
		if(rhAmt > 0) {
			if(cheese[1].getAmount() * 2 % 3 ==0)
				disSpecials[1] = (rhAmt / 3 * cheese[1].getPrice());
			else
				disSpecials[1] =((int)(rhAmt / 1.5) * (cheese[1].getPrice()/2));
			System.out.print(disSpecials[1]);
		}
		
		return disSpecials;		
	}

	/*
	 * Displays the Original Sub Total, discounts based on specials, and the New Sub 
	 * Total. Returns the New Sub Total. Identical to Lab 07.
	 */
	private double printSubTotals(double subTotal, double[] disSpecials) {
		// Fix code
		System.out.printf("\nOriginal Subtotal\t\t  $%.2f\nSpecials...\n", subTotal);
		if(disSpecials[0] > 0)
			System.out.printf("Humboldt Fog (Buy 1 Get 1 Free): -$%.2f\n", disSpecials[0]);
		
		if(disSpecials[1] > 0)
			System.out.printf("Red Hawk (Buy 2 Get 1 Free):\t -$%.2f\n", disSpecials[1]);
		if(disSpecials[1] + disSpecials[0] == 0)
			System.out.printf("None\t\t\t\t -$%.1f\n", 0.0);
		return subTotal - disSpecials[0] - disSpecials[1];
	}

	/*
	 * Calculates the additional discount based on the New Sub Total and displays 
	 * the Final Total. Identical to Lab 07.
	 */
	private void printFinalTotal(double newSubTotal) {
		// Fill-in code
		System.out.printf("New Sub Total\t\t\t  $%.2f\n", newSubTotal);
		double AD = 0;
		if (newSubTotal > 150)
			AD = newSubTotal > 250 ? .25:.10;
		if(AD != 0)	
			System.out.printf("Additional %.0f%% Discount:\t -$%.2f\t\t\nFinal Total:\t\t\t  $%.2f\n", AD * 100,(newSubTotal * AD), newSubTotal - (AD * newSubTotal));	
		else
			System.out.printf("Additional %.0f%% Discount:\t\t -$%.1f\t\t\nFinal Total:\t\t\t  $%.2f\n", AD * 100,(newSubTotal * AD), newSubTotal - (AD * newSubTotal));

	}

	private void printFree(){
		double amt;
		System.out.println();
		System.out.println("Today is your lucky day!");
		for (int i = 0; i < cheese.length; i++) 		
			if ((amt = cheese[i].getAmount()) > 0)
				System.out.println(amt + " lb of " + cheese[i].getName() + " @ $0 = $" + 0);
		System.out.println("Total Price: FREE!!!\n");
	}

	public void run() {

		Scanner input = new Scanner(System.in);
		intro(input);
		double subTotal = calcSubTotal();
		
		System.out.println();
		System.out.print("Display the itemized list? (1 for yes): ");
		int list = input.nextInt();
		if (list == 1)
			itemizedList();	

		int free = (new Random()).nextInt(100);
		//System.out.println("Random num is " + free);
		if (free != 0) {
			double newSubTotal = printSubTotals(subTotal, discountSpecials());
			printFinalTotal(newSubTotal);
		} else {
			printFree();
			return;
		}
		
		System.out.println();
		System.out.print("Do you wish to redo your whole order? (1 for yes): ");
		int redo = input.nextInt();

		System.out.println();

		if (redo == 1)
			run();
		else
			System.out.println("Thanks for coming!");
	}
}
