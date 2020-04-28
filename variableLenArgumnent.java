package CodeNext;

public class variableLenArgumnent {

	public static void main(String[] args) {
		System.out.println(average(1,2,3,4,5,6));
	}
	// whenever we want a method but don't know about the no. of arguments
	// use eclipse (datatype...variable)
	// instead of x,y,z,a,b,c... use ...
	public static int average(int...numbers) {
		int total= 0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
	}
}
