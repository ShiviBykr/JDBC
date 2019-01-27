import java.sql.*;
import java.util.Scanner;

public class Uni_Insert {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Enter the name of Database:");
		String database = sc.nextLine();
		System.out.println("Connecting to " + database + "..");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database + "", "root", "root");
		System.out.println("Connection Established.");
		System.out.println("Enter the name of the table to insert data:");
		String table = sc.nextLine();
		if (table.equals("student")) {
			System.out.println(table + " " + "selected.");
			System.out.println("Enter the ID of the student:");
			String id = sc.nextLine();
			System.out.println("Enter the name of the student:");
			String name = sc.nextLine();
			System.out.println("Enter the branch of the student:");
			String branch = sc.nextLine();
			System.out.println("Enter the mobile number of the student:");
			String mobile = sc.nextLine();
			System.out.println("Enter the email of the student:");
			String email = sc.nextLine();
			System.out.println("Enter the gender of the student:");
			String gender = sc.nextLine();

			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO " + table + " (ID, NAME, BRANCH, MOBILE, EMAIL, GENDER) VALUES(?,?,?,?,?,?)");
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, branch);
			ps.setString(4, mobile);
			ps.setString(5, email);
			ps.setString(6, gender);

			int k = ps.executeUpdate();
			if (k != 0) {
				System.out.println("Inserted Successfully.");
			}
		} else if (table.equals("invoice")) {
			System.out.println(table + " " + "selected.");
			System.out.println("Enter the name of the item:");
			String item = sc.nextLine();
			System.out.println("Enter the price of the item:");
			String price = sc.nextLine();
			System.out.println("Enter the availability of the item");
			String avail = sc.nextLine();

			PreparedStatement ps = con
					.prepareStatement("INSERT INTO " + table + " (ITEM_NAME, PRICE, AVAILABILITY) VALUES(?,?,?)");
			ps.setString(1, item);
			ps.setString(2, price);
			ps.setString(3, avail);

			int k = ps.executeUpdate();
			if (k != 0) {
				System.out.println("Inserted Successfully.");
			}
		} else if (table.equals("reservation")) {
			System.out.println(table + " " + "selected.");
			System.out.println("Enter the name of the passenger:");
			String name = sc.nextLine();
			System.out.println("Enter the age of the passenger:");
			String age = sc.nextLine();
			System.out.println("Enter the gender of the passenger:");
			String gender = sc.nextLine();
			System.out.println("Enter the Status of the passenger:");
			String status = sc.nextLine();

			PreparedStatement ps = con
					.prepareStatement("INSERT INTO reservation (NAME,AGE,GENDER,STATUS) VALUES(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, age);
			ps.setString(3, gender);
			ps.setString(4, status);

			int k = ps.executeUpdate();
			if (k != 0) {
				System.out.println("Inserted Successfully.");
			}
		} else if (table.equals("employee")) {
			System.out.println(table + " " + "selected.");
			System.out.println("Enter the name of the employee:");
			String name = sc.next();
			System.out.println("Enter the email of the employee:");
			String email = sc.next();
			System.out.println("Enter the contact number of the employee:");
			String contact = sc.next();
			System.out.println("Enter the gender of the employee:");
			String gender = sc.next();
			System.out.println("Enter the age of the employee:");
			String age = sc.next();
			System.out.println("Enter the department of the employee:");
			String dept = sc.next();
			System.out.println("Enter the designation of the employee:");
			String position = sc.next();
			System.out.println("Enter the salary of the employee:");
			String salary = sc.next();
			System.out.println("Enter the address of the employee:");
			String address = sc.next();
			System.out.println("Enter the particulars/remarks of the employee:");
			String part = sc.next();

			PreparedStatement ps = con.prepareStatement("INSERT INTO " + table
					+ " (EMPLOYEE_NAME, EMAIL, CONTACT_NO, GENDER, AGE, DEPT, POSITION_HELD, SALARY, ADDRESS, PARTICULARS) VALUES(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, contact);
			ps.setString(4, gender);
			ps.setString(5, age);
			ps.setString(6, dept);
			ps.setString(7, position);
			ps.setString(8, salary);
			ps.setString(9, address);
			ps.setString(10, part);

			int k = ps.executeUpdate();
			if (k != 0) {
				System.out.println("Inserted Successfully.");
			}
		}
		con.close();
		sc.close();
	}

}
