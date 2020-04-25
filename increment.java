package CodeNext;
import java.util.Scanner;
public class increment {

	public static void main(String args[]) {
		Scanner bucky = new Scanner(System.in);
		
		int tuna = 5;
		int base = 18;
		
		tuna += 8;  // Some shortcut
		
		System.out.println(tuna);
		//System.out.println(++tuna);	// pre-increment
		//System.out.println(tuna++);	// post-increment
	}
}
