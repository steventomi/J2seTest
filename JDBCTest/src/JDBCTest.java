import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class JDBCTest {
	public static void main(String [] arg){
		Connection con = null;
		PreparedStatement prt = null;
		ResultSet ret = null;
		String sql = "select * from users where id > 5";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jun","root","jiangjun");
			prt = con.prepareStatement(sql);
			ret = prt.executeQuery();
			while(ret.next()){
				System.out.println(ret.getString("username") +"  " +ret.getString("password") );
			}
		}catch(ClassNotFoundException ae){
			ae.printStackTrace();
		}catch(SQLException ae){
			ae.printStackTrace();
		}
		
		finally{
			try{
				if(con != null){
					con.close();
					con = null;
				}
				if(prt != null){
					prt.close();
					prt = null;
				}
				if(ret != null){
					ret.close();
					ret = null;
				}
			
			}catch(SQLException ae){
				ae.printStackTrace();
			}
		
		}
	}
}
