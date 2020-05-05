package CodeNext;

public class printFinalClass {

	public static void main(String[] args) {
		finalClass obj1 = new finalClass(10);
		
		for(int i = 0; i<5; i++) {
			obj1.add();
			System.out.printf("%s",obj1);
		}
	}

}
