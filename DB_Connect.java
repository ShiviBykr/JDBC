import java.sql.*;
import java.util.Scanner;

public class DB_Connect {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connecting to Data Base..");
		System.out.println("Enter the name of database");
		String database=sc.nextLine();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database+"","root","root");
		System.out.println("Connection Established to "+database);
		con.close();
		sc.close();
	}
}
