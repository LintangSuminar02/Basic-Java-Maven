package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() { //perbaikan
		count--; 
	}
	
	public int getCount() {
		return count;
	}
	
}
