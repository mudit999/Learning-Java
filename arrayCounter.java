package CodeNext;
import java.util.Random;

public class arrayCounter {
	public static void main(String args[]) {
		Random rand = new Random();
		int freq[] = new int[7];
		
		for(int roll=1;roll<100;roll++) {
			// Passing randnumGenerator in freq array, here ++freq means to increment index position as we have increment in rand
			++freq[1+rand.nextInt(6)];
		}
		System.out.println("Face\t Frequency");
		for(int face=1;face<freq.length;face++) {
			System.out.println(face+ "\t" + freq[face]);
		}
	
	}

}