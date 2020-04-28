package CodeNext;

public class enhancedforStatement {
	//enhancedFORloop- used to loop through all array elements to do something
	//- It simply helps to traverse the array element one by one but nothing more than that
	//-Also called for-each loop and less eliminates possibility of errors
	
	public static void main(String[] args) {
		int array[] = {1,5,4,3,7,8};
		int total=0;
		
		for(int x: array) {
			//for(type identifier: array-name working with)
			total += x;
		}
		System.out.println(total);
	}
}
