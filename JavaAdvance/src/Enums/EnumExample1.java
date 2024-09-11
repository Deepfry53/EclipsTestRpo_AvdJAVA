package Enums;

public enum EnumExample1 {

	YEAR("2002"),MONTH("September"),DATE("15");
	
	
	String value;

	EnumExample1(String value) {
		// TODO Auto-generated constructor stub
		
		this.value = value;
		
	} 
	
	public String getvalue () {
		return this.value;
	}
	
}
