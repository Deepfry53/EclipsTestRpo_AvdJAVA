package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Student std = new Student("deepak", 101, 22);
		
//		std.RollNumber = 31;
//		std.name = "deepak";
		
//		System.out.println(" this is the best " + std);
		
		String fileName = "/Users/deepak/Desktop/programing/Java/AdvanceJava/JavaAdvance/data/SerializationTest.txt";
		FileOutputStream fileOut= null; 
		ObjectOutputStream objOut = null;
		
		try {
			
			fileOut = new FileOutputStream(fileName);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(std);
			
			System.out.println(" object have been serialized "+ std.getdata());
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			fileOut.close();
			objOut.close();
			
		}
		
		

//		FileInputStream fileIn = null;
//		ObjectInputStream objIn = null;
//		
//		
//		try {
//			fileIn = new FileInputStream(fileName);
//			objIn = new ObjectInputStream(fileIn);
//			
//			Student newstd = (Student)objIn.readObject();
//			
//			System.out.println( newstd );
//			
//		} catch (IOException ex) {
//			// TODO: handle exception
//		} finally {
//			fileIn.close();
//			objIn.close();
//		}

	}

}
