package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class A {
public static void main(String[] args) {
	
	try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name Of Vegitables");
		String name=sc.next();
		
		System.out.println("Enter Types Of Vegitables");
		String types=sc.next();
		
		System.out.println("Enter Vitamins Of Vegitables");
		String vitamins=sc.next();
		
		System.out.println("Enter Surving Of Vegitables");
		String serving=sc.next();
		
		System.out.println("Enter Calories Of Vegitables");
		String calories=sc.next();
		
		sc.close();
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_veg_db","root","Aman@1998");
	System.out.println(con);
	Statement stmnt = con.createStatement();
	stmnt.executeUpdate("insert into vegitables values('"+name+"','"+types+"','"+vitamins+"','"+serving+"','"+calories+"')");
	con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
