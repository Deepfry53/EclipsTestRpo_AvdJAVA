package JDBCExamples;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/test" ;
		Connection conn = null;
		
		int id = 108;
		String name = "anukul";
		int rollnum = 22;
		String sql = "insert into Student (idStudent,Name,rollNumber)" + "values(" +id+",'" +name+"',"+rollnum+ ");";
		
		
		try {
		  conn = DriverManager.getConnection(url,"root","deepak5g");
		  Statement std = conn.createStatement();
		  int m = std.executeUpdate(sql);
		  if(m == 1) {
			  System.out.println("inserted sql successful: " + sql);
		  }else {
			  System.out.println("inserted sql unsuccessful");
		  }
		  
			
		}catch(Exception ex) {
			System.err.println(ex);
		}
		finally {
			// TODO: handle finally clause
			
			conn.close();
			
		}
		
		

	}

}
