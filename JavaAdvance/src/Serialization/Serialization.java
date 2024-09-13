package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Student std = new Student("deepak", 101, 22);
		

		
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
		

	}

}
