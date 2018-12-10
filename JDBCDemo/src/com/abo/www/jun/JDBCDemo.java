package com.abo.www.jun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JDBCUtils.JDBCUtils;


//import com.mysql.jdbc.Connection;

public class JDBCDemo{
	public static void main(String[] arg) throws SQLException, ClassNotFoundException{
		Connection con = JDBCUtils.getConnection();
		Scanner sc = new Scanner(System.in);
		String usn = sc.nextLine();
		String psw = sc.nextLine();
		String sqlp = "insert into users(USERNAME,PASSWORD) values (?,?)";
		PreparedStatement sta = con.prepareStatement(sqlp);
		sta.setString(1, usn);
		sta.setString(2,psw);
		sta.executeUpdate();
		String sql = "select * from users";
		ResultSet ret = sta.executeQuery(sql);
		while(ret.next()){
			System.out.println(ret.getString("USERNAMe") + "    " + ret.getString("PASSWORD"));
		}
		JDBCUtils.close(con,sta,ret);
		sc.close();
		//System.out.println(con);
	}
} 


