package CodeNext;
import java.util.EnumSet;
// import for range

public class enumClass {

	public static void main(String[] args) {
		
		// whenever enumeration is used, java automatically build array of constants and called enumerations is called - enumeration.values()
		for(enumeration people: enumeration.values())
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(), people.getYear());
		
		System.out.println("\n And now for the range of constants!!\n");
		
		for(enumeration people: EnumSet.range(enumeration.mudit, enumeration.Solar))
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(), people.getYear());

	}
}
