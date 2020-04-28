package CodeNext;

public class multiDimArray {
public static void main(String[] args) {
	int firstArray[][] = {{4,5,2,1,2},{5,6,4}};
	int secondArray[][] = {{45,44,33},{44,33}};
	
	System.out.println("This is first array");
	change(firstArray);
	
	System.out.println("This is second array");
	change(secondArray);


}

	
public static void change(int x[][]) {
	for(int row=0;row<x.length;row++) {
		for(int column=0; column<x[row].length; column++) {
			System.out.print(x[row][column] + "\t");
		}
		System.out.println();
	}
 }
}