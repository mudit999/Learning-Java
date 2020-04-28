package CodeNext;

public class arraysInMethod {
	public static void main(String[] args) {
		int array[] = {5,10,15,20,25};
		change(array);
		//Method is called 
		
		for(int y:array)
			System.out.println(y);
	}
	
	// Array is passed as parameter in method
	public static void change(int x[]) {
		 for(int counter=0;counter<x.length;counter++)
			 x[counter]+=5;
	}
}