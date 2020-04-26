package CodeNext;
import java.util.Random;

public class randomNumGenerator {
	public static void main(String[] args) {
		Random dice = new Random();
		// Random object - dice
		int number;
		
		for(int counter =1; counter<=10; counter++) {
			number = 1+dice.nextInt(45);
			//1+dice to get 1 to 6 rather than 0 to 6 because all computer counting starts from 0
			
			System.out.print(number + " ");
		}
	}
}
