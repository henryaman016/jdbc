package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class B {
public static void main(String[] args) {
	
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.next();
		
		sc.close();
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_veg_db","root","Aman@1998");
	Statement stmnt = con.createStatement();
	stmnt.executeUpdate("DELETE FROM vegitables WHERE name='"+name+"'");
	con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
