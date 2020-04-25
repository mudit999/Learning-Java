package CodeNext;
import java.util.Scanner;

public class printStatement2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		multipleMethod objectMeth = new multipleMethod();
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		objectMeth.setName(temp);
		objectMeth.saying();
		
	}
}
