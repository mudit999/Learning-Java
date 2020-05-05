package CodeNext;

public class printStaticClass {

	public static void main(String[] args) {
		staticClass member1 = new staticClass("Salman","Fox");
		staticClass member2 = new staticClass("Khan", "Life");

	
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers()); 
		//static method can be access without object
		// bcoz it is static, dont have change object to object
	}

}
