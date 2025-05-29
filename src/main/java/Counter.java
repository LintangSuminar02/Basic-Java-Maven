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

	//Tambahkan codingan baru
	public void increaseBy(int i) {
		count+=i;
	}
	
	public void decrement() { //perbaikan
		count--; 
	}
	
	//Tambahkan codingan baru
	public void decreaseBy(int i) {
		count-=i;
	}

	public void multiplyBy(int i){
		count = count * i;
	}
	
	public void triple(){
		int i = 3;
		multiplyBy(i);
	}

	public void powerBy(int i){
		count = count ^ i;
	}
	
	public boolean isCountEven(){
		return count%2 == 0;
	}

	public int getCount() {
		return count;
	}
	
}
