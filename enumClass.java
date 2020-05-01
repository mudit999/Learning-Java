package CodeNext;
import java.util.EnumSet;

public class enumClass {

	public static void main(String[] args) {
		
		// whenever enumeration is used, java automatically build array of constants and called enumerations is called 
		for(enumeration people: enumeration.values())
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(), people.getYear());
		
	}
}
