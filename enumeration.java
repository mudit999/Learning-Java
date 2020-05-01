package CodeNext;


// Main function is in enumClass.java file
public enum enumeration {
	//enumeration - used to declare constants
	
	// constants that are object!!
	mudit("Nice", "22"),
	none("fine","0"),
	no("okay","0"),
	blit("looks","1"),
	Solar("sucks","1"),
	RaiJada("Don't even have word","2");
	
	
	private final String desc;
	private final String year;
	
	enumeration(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}

}
