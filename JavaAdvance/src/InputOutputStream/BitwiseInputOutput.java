package InputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitwiseInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;
		
		try {
			fileIn = new FileInputStream("/Users/deepak/Desktop/programing/Java/AdvanceJava/JavaAdvance/data/testIn.txt");
			fileOut = new FileOutputStream("/Users/deepak/Desktop/programing/Java/AdvanceJava/JavaAdvance/data/demoOut.txt");
			
			int data;
			while((data = fileIn.read()) != -1 ) {
				fileOut.write((byte)data);
			}
			
		} catch (IOException ex) {
			// TODO: handle exception
			System.err.println(ex);
		} finally {
			if(fileIn != null) {
				fileIn.close();
				
			}
			if(fileOut != null) {
				fileOut.close();
			}
		}
		
	}

}
