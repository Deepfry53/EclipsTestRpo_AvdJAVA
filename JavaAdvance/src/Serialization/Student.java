package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	private int RollNumber;
	private String name;


	private int age;


	public Student(String name , int rollNum, int age) {
		super();
		this.name = name;
		this.RollNumber = rollNum;
		this.age = age;
		
	}
	
	
	public String getdata () {
		return ("name is : "+ name +" Age is : "+ age + "rollnumber is" + RollNumber   );
	}
	
	
}


