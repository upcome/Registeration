import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Store {
	Connection connection=null;

	Store() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String username = "sa";
			String password = "123456abcd";
			String url = "jdbc:sqlserver://localhost;databaseName=Signupuser";
		



			connection = DriverManager.getConnection(url, username, password);
           if(connection==null)
           {
        	   throw new NullPointerException();
           }
		} catch (Exception e) {
			System.out.println("null pointer exception");
			e.printStackTrace();
			
		}
		
	}
	public boolean insertuser(String string1, String string2, String string3, String string4, String string5) throws SQLException{
		
		String sql = "insert into dbo.Usertable values(?,?,?,?,?)";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);

		pstmt.setString(1, string1);
		pstmt.setString(2, string2);
		pstmt.setString(3, string3);
		pstmt.setString(4, string4);
		pstmt.setString(5, string5);
		int i = pstmt.executeUpdate();
		connection.close();
		if (i > 0) {
			return true;
		}
		
		return false;
	
	
		
	}

	

}



