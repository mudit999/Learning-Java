package CodeNext;
import java.util.Scanner;

// Program to find average of 0-10 numbers 
public class averagingProgram {
	public static void main(String[] args) {
	int num =0;
	int total = 0;
	while(num <= 10) {
		total += num;
		num++;
		}
	
	int result = total/10;
	System.out.println(result);
	}
}