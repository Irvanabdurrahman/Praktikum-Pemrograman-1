package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain{

	public static void main(String[] args)throws ParseException{
		Student s = new Student();
		s.setNim("4510210003");
		s.setNama("Irvan Abdurrahman");
		s.setAlamat("Jl. Pancoran Barat XI A");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("19-05-1992"));
		s.setNoHp("085273683292");
		
		Employee e = new Employee();
		e.setNip("21100989");
		e.setNama("Adi Sulistiono");
		e.setAlamat("Jl. Asem Jajar No.6");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("13-06-1986"));
		e.setNoHp("085210831766");
		
		showData(s);
		System.out.println("\n_______________________________\n");
		showData(e);
	}
	
	static void showData (Student s){
		System.out.println("_______________________________\n");
		System.out.println("Class Student");
		System.out.println("_______________________________\n");
		System.out.println("NIM : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat ("dd MMMM yyyy").format(s.getTglLahir()));
		System.out.println("No HP : " + s.getNoHp());
	}
	
	static void showData(Employee e){
		System.out.println("Class Employee");
		System.out.println("_______________________________\n");
		System.out.println("NIP : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format(e.getTglLahir()));
		System.out.println("No HP : " + e.getNoHp());
		System.out.println("_______________________________\n");
	}
}
		