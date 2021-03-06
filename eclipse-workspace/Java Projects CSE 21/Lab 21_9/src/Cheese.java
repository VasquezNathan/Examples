import java.util.Scanner;

public class Cheese {

	private String name;
	private double price;
	private double amount;

	public static int numCheese = 0;
	
	public Cheese() { // Constructor with no parameters
		name = "";
		price = 0;
		amount = 0;
		numCheese++;
	}

	public Cheese(String name) { // Constructor with name as paramter
		this.name = name;
		price = 0;
		amount = 0;
		numCheese++;
	}

	public Cheese(String name, double price) { // Constructor with 2 parameters
		this.name = name;
		this.price = price;
		numCheese++;
	}

	public String getName() { // Accessor
		return name;
	}

	public void setName(String newName) { // Mutator 
		name = newName;
	}

	public double getPrice() {
		// Fix Code
		return price;
	}

	public void setPrice(double newPrice) {
		// Fill-in Code
		price = newPrice;
	}

	public double getAmount() {
		// Fix Code
		return amount;
	}

	public void setAmount(Scanner input) {
		// Fill-in Code
		double test = input.nextDouble();
		while(test < 0 || test % .5 != 0)
		{
			if(test < 0) 
			{
				System.out.printf("Invalid Input. Enter a value >= 0: ");
				test = input.nextDouble();
			}
			if(test % .5 != 0)
			{
				System.out.printf("Invalid Input. Enter a value that's multiple of 0.5: ");
				test = input.nextDouble();
			}
		}
		amount = test;
	}

}
