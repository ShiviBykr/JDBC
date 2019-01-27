import java.sql.*;
import java.util.Scanner;

public class Uni_Col_Retrieve {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the name of the Database:");
			String database = sc.nextLine();
			System.out.println("Connecting to " + database + "..");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database + "", "root", "root");
			System.out.println("Connected Established.");
			System.out.println("Enter the name of the table");
			String table = sc.nextLine();
			System.out.println("Enter the number of columns");
			int n = Integer.parseInt(sc.nextLine());
			int i = 1;
			do {
				if (i > n) {
					break;
				}
				System.out.println("Enter the name of the column:");
				String column = sc.nextLine();
				PreparedStatement ps = con.prepareStatement("SELECT " + column + " FROM " + table + "");
				ResultSet rs = ps.executeQuery();
				int count=0;
				while (rs.next()) {
					System.out.println(rs.getString(column));
					count++;
				}
				System.out.println("Total no of records in "+column+" "+count);
				i++;
			} while (i <= n);
			con.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		sc.close();
	}

}
