package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class C {
public static void main(String[] args) {
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_veg_db","root","Aman@1998");
	Statement stmnt = con.createStatement();
	stmnt.executeUpdate("UPDATE vegitables SET vitamins='C' WHERE name='potato'");
	con.close();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
