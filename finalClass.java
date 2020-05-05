package CodeNext;

// Main function is in printFinalClass.java file
public class finalClass {
	private int sum;
	private final int NUM;
	// If we make final object, we can't change
	
	public finalClass(int x) {
		NUM = x;
	}
	public void add() {
		sum+=NUM;
	}
	
	public String toString() {
		return String.format("sum = %d\n", sum);
	}	
}
