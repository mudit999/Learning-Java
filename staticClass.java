package CodeNext;

// Main class is in printStaticClass.java
public class staticClass {
	private String first;
	private String last;
	private static int members=0;
	// this is common variable of first and last
	// Salman can't see others(khan) but all can see the members count
	
	
	public staticClass(String fn, String ln) {
		first = fn;
		last=ln;
		members++;
		System.out.printf("constructor for %s %s, members in the club: %d\n",first, last, members);
	}
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public static int getMembers() {
		return members;
	}
}
