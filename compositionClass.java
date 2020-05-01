package CodeNext;

// main function is in printImplementtoString.java file
public class compositionClass {
	private String name;
	
	// composition
	private ImplementtoString birthday;
	// reference to implementtoString object
	
	public compositionClass(String theName, ImplementtoString theDate) {
		name = theName;
		birthday = theDate;
	}
	
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name,birthday);
	}
}
