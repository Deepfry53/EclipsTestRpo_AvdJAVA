package Generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericExample1<Integer,String> Exam = new GenericExample1<Integer ,String>(22,"yohohoho");
		
		System.out.println("the number is " + Exam.getObj());

	}

}
