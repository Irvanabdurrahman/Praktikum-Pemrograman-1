package service;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Pembelian{
	private Date tanggal;
	private BigDecimal nilai;
	private int quantity=2;
	private List<PembelianDetail> daftarPembelianDetail = new ArrayList<PembelianDetail>();
	
	public BigDecimal getNilai(){
        return new BigDecimal(13000000*quantity);
    }
		
	public Date getTanggal(){
		return tanggal;
	}
	
	public void setTanggal(Date tanggal){
		this.tanggal=tanggal;
	}
	
}

// javac -cp src -d bin src/aplikasi/toko/*