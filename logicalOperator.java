package CodeNext;

public class logicalOperator {
	public static void main(String[] args) {
		int boy, girl;
		
		boy = 16;
		girl = 68;
		
		//Logical AND operator
		if(boy > 10 && girl < 60) {
			System.out.println("You can enter");
		}else {
			System.out.println("You can not enter");
		}
		
		//Logical OR operator
		if(boy > 10 || girl < 60) {
			System.out.println("You can enter");
		}else {
			System.out.println("You can not enter");
		}
	}
}
