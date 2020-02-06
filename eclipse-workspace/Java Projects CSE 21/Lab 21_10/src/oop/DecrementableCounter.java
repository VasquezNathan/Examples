package oop;

public class DecrementableCounter extends Counter{
	private int x = 0;
	public int decrement() {
		
		if(value()-x==0)
			return 0;
		else{
		x++;
			return value() - x;
		}
		
	}
	
	
}
