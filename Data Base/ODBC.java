import java.sql.*;

public class ODBC{
	public static void main(String[] args){
	try {
		Class.forName("sun.jdbc.odbc.Mahasiswa");
		String cs = "jdbc:odbc:Mahasiswa";
		Connection cn = DriverManager.getConnection(cs);
		String qry = "SELECT * FROM NPM";
		Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery(qry);
		while(rs.next()) {
		System.out.println("Nama : "+rs.getString("Name"));
		System.out.println("Email : "+rs.getString("Email"));
		System.out.println("Alamat : "+rs.getString("Address"));
		}
	} catch (Exception err) {err.printStackTrace();}
	}
}