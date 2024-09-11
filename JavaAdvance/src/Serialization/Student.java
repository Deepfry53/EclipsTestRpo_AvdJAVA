package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private int RollNumber;
	private int age ;

	public Student(String name , int rollNum, int age) {
		super();
		this.name = name;
		this.RollNumber = rollNum;
		this.age = age;
	}
	
	public String getdata() {
		return(" name :" + this.name + " age :" +this.age+ " Rollno :"+ this.RollNumber);
  	}
}


