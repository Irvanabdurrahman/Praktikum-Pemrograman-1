package aplikasi.mahasiswa;

import java.io.File;

public class DatabaseMahasiswaCsv implements DatabaseMahasiswa{
	private String lokasi;
	private Boolean pakaiHeader;
	private Boolean fileBaru;
	
	private File file;
	private FileWriter writer;
	
	public DatabaseMahasiswaCsv(String lokasi, Boolean header){
		try {
			this.lokasi = lokasi;
			pakaiHeader = header;
			
			file = new File(lokasi);
			