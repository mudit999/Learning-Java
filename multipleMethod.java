package CodeNext;

//Main function is in printStatement2 class

public class multipleMethod {
	private String girlName; 
	public void setName(String name) {
		girlName=name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your first gf was %s", getName());
		//s.o.printf(format,args)
	}

}
