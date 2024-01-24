package telran.goat.mode;

public class Goat {
    private final int max;
    public static final COUNT_MAX;
	private int count;

	public Goat(int max) {
		this.max = max;
	}
	
	public int getMax() {
		return max;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void increment() {
		count++;
	}
	public int getCount(){
		return count;
	}
}

