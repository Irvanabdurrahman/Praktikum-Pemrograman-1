package aplikasi.mahasiswa;

import java.sql.Connection;
import java.aql.DriverManager;
import java.sql.Pre

public class DatabaseMahasiswaAccess implements DatabaseMahasiswa{
	private Connection connection;
	
	public DatabaseMahasiswaAccess(String dsn){
		try{
			class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:"+dsn;
			connection = DriverManager.getConnection(url);
		}catch (Exception err){
			err.printStackTrace();
		}
	}
	
	public void simpan(Mahasiswa m){
		try {
		
