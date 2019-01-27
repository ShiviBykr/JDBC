import java.sql.*;
import java.util.Scanner;

public class Uni_Retrieve {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Database:");
		String database=sc.nextLine();
		System.out.println("Connecting to "+database+"..");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database+"","root","root");
		System.out.println("Connection established to "+database);
		System.out.println("Enter the name of the table to retrieve data:");
		String table=sc.nextLine();
		if(table.equals("invoice")) {
			System.out.println(table+" selected");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM "+table+"");
			System.out.println("PRO_ID"+"\t"+"ITEM_NAME"+"\t"+"PRICE"+"\t"+"AVAILABILITY");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}
		else if(table.equals("student")) {
			System.out.println(table+" selected");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM "+table+"");
			System.out.println("ID"+"\t"+"NAME"+"\t"+"BRANCH"+"MOBILE"+"\t"+"EMAIL"+"\t"+"GENDER");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			}
		}
		else if(table.equals("reservation")) {
			System.out.println(table+" selected");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM "+table+"");
			System.out.println("S.NO"+"\t"+"NAME"+"\t"+"AGE"+"\t"+"GENDER"+"\t"+"STATUS"+"\t"+"COACH"+"\t"+"BIRT_NO");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getInt(7));
			}
		}
		else if(table.equals("employee")) {
			System.out.println(table+" selected");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM "+table+"");
			System.out.println("EMPLOYEE_ID"+"\t"+"EMPLOYEE_NAME"+"\t"+"EMAIL"+"\t"+"CONTACT_NO"+"\t"+"GENDER"+"\t"+"AGE"+"\t"+"DEPT"+"\t"+"DESIGNATION"+"\t"+"SALARY"+"\t"+"ADDRESS"+"\t"+"PARTICULARS");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t"+rs.getString(10)+"\t"+rs.getString(11));
			}
		}
		con.close();
		sc.close();
	}

}
