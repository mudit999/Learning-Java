package CodeNext;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter First num : ");
		fnum = bucky.nextDouble();
		System.out.println("Enter Second num : ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println("Answer is " +answer);
	}

}
