import java.sql.*;
import java.util.Scanner;

public class ColumnCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to the database..");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web","root","root");
			System.out.println("Connection Established");
			Statement st=con.createStatement();
			System.out.println("Enter the name of the table");
			String table=sc.nextLine();
			ResultSet rs=st.executeQuery("SELECT * FROM "+table+"");
			ResultSetMetaData rsmd=rs.getMetaData();
			int colcount=rsmd.getColumnCount();
			System.out.println("No of coulmns in given table: "+colcount);
			int i;
			for(i=1;i<=colcount;i++) {
				System.out.println(rsmd.getColumnName(i));
			}
			con.close();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		sc.close();
	}

}
