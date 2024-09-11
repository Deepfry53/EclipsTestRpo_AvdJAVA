package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		
		String fileName = "/Users/deepak/Desktop/programing/Java/AdvanceJava/JavaAdvance/data/SerializationTest.txt";
		
		try {
			fileIn = new FileInputStream(fileName);
			objIn = new ObjectInputStream(fileIn);
			
			Student newstd = (Student)objIn.readObject();
			
			System.out.println( newstd.getdata());
			
		} catch (IOException ex) {
			// TODO: handle exception
		} finally {
			fileIn.close();
			objIn.close();
		}

	}

}
