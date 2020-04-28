package CodeNext;

public class overloadConstPrintClass {

	public static void main(String[] args) {
		overloadedConstructor overObj = new overloadedConstructor();
		overloadedConstructor overObj2 = new overloadedConstructor(5);
		overloadedConstructor overObj3 = new overloadedConstructor(5,13);
		overloadedConstructor overObj4 = new overloadedConstructor(5,13,43);

		System.out.printf("%s\n",overObj.toMilitary());
		System.out.printf("%s\n",overObj2.toMilitary());
		System.out.printf("%s\n",overObj3.toMilitary());
		System.out.printf("%s\n",overObj4.toMilitary());

	}

}
