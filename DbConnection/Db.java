package DbConnection;

import java.sql.*;

class MakeConnection {
	Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/db", "root", "Pavi*0902");

			System.out.println(con);

			stmt = con.createStatement();
			int il = stmt.executeUpdate(" insert into pradeep values (001,'sakre',12)");
			int i2 = stmt.executeUpdate(" insert into pradeep values (001, 'pradeep',23)");
			int i3 = stmt.executeUpdate(" insert into pradeep values (001,'vivek',23)");
			rs = stmt.executeQuery("select * from pradeep");
			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + "'" + rs.getInt(3));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Db {
	public static void main(String args[]) {
		new MakeConnection();
	}
}