import java.sql.*;
import java.util.Scanner;

public class RowCount {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connecting to the database..");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web","root","root");
		System.out.println("Conection Established");
		Statement st=con.createStatement();
		System.out.println("Enter the name of the table");
		String table=sc.nextLine();
		ResultSet rs=st.executeQuery("SELECT * FROM "+table+"");
		int rowcount=0;
		while(rs.next()) {
			rowcount++;
		}
		System.out.println("No of rows in "+table+": "+rowcount);
		con.close();
		sc.close();
	}

}
