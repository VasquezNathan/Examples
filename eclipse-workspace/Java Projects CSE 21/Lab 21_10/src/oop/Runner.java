package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();

		// testModNCounter2();
		ModNCounter c = new ModNCounter(2);
		System.out.println(c.toString());
//		System.out.print(c.value());
//		c.increment();
//		System.out.print(c.value());
//		c.increment();
//		System.out.print(c.value());
//		c.increment();
//		System.out.print(c.value());
//		c.increment();
//		

		testDecrementableCounter();

		testSeasonCounter();
	}

	
	public static void testSeasonCounter() {
		SeasonCounter c = new SeasonCounter();
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
	}
	
	public static void testCounter() {
		System.out.println("-- Testing Counter");

		Counter c = new Counter();
		c.increment();
		c.increment();
		c.increment();
		System.out.println("Current value: " + c.value());

	}
	
	public static void testDecrementableCounter(){
		DecrementableCounter c = new DecrementableCounter();
		c.increment();
		c.increment();
		System.out.print(c.decrement());
		System.out.print(c.decrement());
	}

	
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- Testing 7 statements");
		// include exactly 7 increment() and reset() statements below
		c.increment();
		c.reset();
		c.increment();
		c.reset();
		c.increment();
		c.increment();
		c.increment(); 
		System.out.println("Current value: " + c.value());
	}

}
