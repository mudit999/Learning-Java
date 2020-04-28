package CodeNext;

public class timeCalling {
	public static void main(String[] args) {
		timeClass obj = new timeClass();
		System.out.println(obj.toMilitary());
		System.out.println(obj.toString());
		
		obj.setTime(13,27,6);
		System.out.println(obj.toMilitary());
		System.out.println(obj.toString());
	}
}
