package CodeNext;

public class arrayTable {
	public static void main(String[] args) {
		
		System.out.println("Index\tValue");
		int array[] = {32,55,4,5,99,5};
		
		
		//array index start with 0
		for(int counter=0; counter<array.length; counter++) {
			System.out.println(counter + "\t" + array[counter]);		
		}
	}
}