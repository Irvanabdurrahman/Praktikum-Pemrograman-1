package main;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;

import service.PembelianDetail;
import service.Pembelian;
import service.Produk;

public class Main{
	public static void main(String[] args)throws ParseException{
	List<PembelianDetail> daftarPembelianDetail= new ArrayList<PembelianDetail>();
	PembelianDetail pd = new PembelianDetail();
	pd.setQuantity(2);
	
	Pembelian p = new Pembelian();
	p.setTanggal(new SimpleDateFormat("dd-MM-yyyy").parse("21-12-2011"));
	
	Produk pr = new Produk();
	pr.setKode("B6429");
	pr.setNama("Motor");
	
	System.out.println("_____________________________\n");
	System.out.println("\tData Produk");
	System.out.println("_____________________________\n");
	System.out.println("Kode  : "+pr.getKode());	
	System.out.println("Nama  : "+pr.getNama());
	System.out.println("Harga : Rp "+pr.getHarga() + " / Unit");
	System.out.println("Total Penjualan : "+pd.getQuantity() + " Unit");
	System.out.print("Penjualan Perpriode : "+pd.getQuantity() + " Unit");
	System.out.println("\n_____________________________\n");
	System.out.println("\tData Pembelian");
	System.out.println("_____________________________\n");
	System.out.println("Quantity : "+pd.getQuantity());
	System.out.println("Tanggal  : " + new SimpleDateFormat ("dd MMMM yyyy").format(p.getTanggal()));
	System.out.println("Nilai    : Rp "+p.getNilai());
	System.out.println("Total Pembayaran    : Rp "+p.getNilai());
	}
	
}