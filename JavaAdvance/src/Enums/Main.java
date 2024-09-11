package Enums;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumExample1 e = EnumExample1.MONTH; // to store a enum value;
		
		System.out.println("name of month is is "+ e.name());
		System.out.println("value of  is "+ e.getvalue());

		for(EnumExample1 data : EnumExample1.values()) {
			System.out.println(  data.name() + " is "+ data.getvalue());	
		}
		
	}

}
