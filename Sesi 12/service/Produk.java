package service;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Produk{
	private String kode;
	private String nama;
	private BigDecimal harga;
	private List<PembelianDetail> daftarPembelianDetail = new ArrayList<PembelianDetail>();
	
	public String getKode(){
		return kode;
	}
	
	public void setKode(String kode){
		this.kode=kode;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public BigDecimal getHarga(){
        return new BigDecimal(13000000);
    }
	
	 public BigDecimal hitungTotal(){
        return new BigDecimal(120000.00);
    }
}