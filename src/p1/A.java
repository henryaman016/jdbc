package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//import java.sql.SQLException;

public class A {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_veg_db","root","Aman@1998");
		System.out.println(con);
		
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into vegitables values('onion','undergroud','potassium','60 g','18')");
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
