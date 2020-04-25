package CodeNext;
import java.util.Scanner;

public class nestedif {
public static void main(String[] args) {
	
	int age = 60;
	//Scanner input = new Scanner(System.in);
	//nestedif obj = new nestedif();
	//int num;
	//num = obj.nextLine();
	
	if (age < 40){
		System.out.println("You are young");
	}else {
		System.out.println("You are not young");
		if(age > 75) {
			System.out.println("You are really old");
		}else {
			System.out.println("You aren't that old");
		}
	}

}		
}
