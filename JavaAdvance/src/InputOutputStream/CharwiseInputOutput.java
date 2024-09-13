package InputOutputStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharwiseInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			
			reader = new FileReader("/Users/deepak/Desktop/programing/Java/AdvanceJava/JavaAdvance/data/testIn.txt");
			writer = new FileWriter("/Users/deepak/Desktop/programing/Java/AdvanceJava/JavaAdvance/data/demochar.txt");
			
			int data ;
			while ( (data = reader.read())!= -1 ) {
				writer.write(data);
			}
			
			
		} finally {
			// TODO: handle finally clause
			if (reader != null) {
				reader.close();
			}
			if(writer != null) {
				writer.close();
			}
		}
		
	}

}
