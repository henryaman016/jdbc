package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name Of Vegitables");
			String name=sc.next();
			
			System.out.println("Enter Calories Of Vegitables ");
			String calories=sc.next();
			
			sc.close();
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_veg_db","root","Aman@1998");
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("UPDATE vegitables SET calories='"+calories+"' WHERE name='"+name+'"');
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
