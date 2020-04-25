package CodeNext;

public class constructor {

	
	// Main function in printStatement3
		private String girlName;
		
		// Constructor
		public constructor(String name) {
			girlName = name;
		}
		 
		public void setName(String name) {
			girlName=name;
		}
		public String getName() {
			return girlName;
		}
		public void saying() {
			System.out.printf("Your first gf was %s\n", getName());
			//s.o.printf(format,args)
		}

	}

