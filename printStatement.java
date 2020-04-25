package CodeNext;
import java.util.Scanner;

public class printStatement {
 public static void main(String[] args) {
	//		System.out.println("Hello Java");
	//differentClass object = new differentClass();
	//object.simpleMessage();
	
		Scanner input = new Scanner(System.in);
		
		//Creating object
		differentClass object2 = new differentClass();
		System.out.println("Please name: ");
		String name;
		name = input.nextLine();
		
		object2.simpleMessage2(name);
 
}
}