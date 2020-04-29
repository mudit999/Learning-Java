package CodeNext;

	// main function is in printImplementtoString class
public class ImplementtoString {
		private int month;
		private int day;
		private int year;
		
		public ImplementtoString(int m, int d, int y) {
			month = m;
			day = d;
			year = y;
		//this is used here to refer the object and looking for string format, and
		//then you needed String representative look to toString	
			System.out.printf("The constructor for this is %s\n", this);		
		}
		 public String toString() {
		return String.format("%d/%d/%d", month,day,year);
	}


}
