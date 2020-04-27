package CodeNext;

public class sumOfarrayElements {
	public static void main(String[] args) {
		int array[] = {4,5,66,33,21,2};
		int sum=0;
		
		for(int counter=0; counter<array.length; counter++) {
			sum += array[counter];
		}
		System.out.println(sum);
	}
}
