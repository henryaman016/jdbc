package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class D {
public static void main(String[] args) {
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_veg_db","root","Aman@1998");
	Statement stmnt = con.createStatement();
	ResultSet result = stmnt.executeQuery("select * from vegitables");
	while(result.next()) {
		System.out.println(result.getString(1));
		System.out.println(result.getString(2));
		System.out.println(result.getString(3));
		System.out.println(result.getString(4));
	}
	con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
