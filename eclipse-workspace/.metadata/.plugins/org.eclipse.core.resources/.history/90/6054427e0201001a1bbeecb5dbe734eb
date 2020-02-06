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
		}
		
	}
	public ShopArr() {
		init(10);
	}
	
	public ShopArr(int max) {
		// Fill-in Code
	}

	/*
	 * Displays the intro message informing the user of various cheeses sold and
	 * Gets the amount of each cheese the user would like to purchase. 
	 */
	private void intro(Scanner input) {
		System.out.println("We sell " + cheese.length + " kinds of Cheese (in 0.5 lb packages)");

		// Fill-in Code
	}

	/*
	 * Displays the itemized list of all cheeses bought or a special message if none 
	 * were purchased.
	 */
	private void itemizedList(){
		double amt = 0, price = 0;
		// Fill-in Code
	}

	/*
	 * Calculates the Original Sub Total, which is the price*amount of each 
	 * cheese added together. Returns the Original Sub Total.
	 */
	private double calcSubTotal() {
		double subTotal = 0;
		// Fill-in Code

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
		
		if (hfAmt > 0) {
			// Fill-in Code
		}
		
		if(rhAmt > 0) {
			// Fill-in Code	
		}
		
		return disSpecials;		
	}

	/*
	 * Displays the Original Sub Total, discounts based on specials, and the New Sub 
	 * Total. Returns the New Sub Total. Identical to Lab 07.
	 */
	private double printSubTotals(double subTotal, double[] disSpecials) {
		// Fix code
		return 0;
	}

	/*
	 * Calculates the additional discount based on the New Sub Total and displays 
	 * the Final Total. Identical to Lab 07.
	 */
	private void printFinalTotal(double newSubTotal) {
		// Fill-in code
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
