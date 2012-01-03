package service;

import java.util.List;
import java.util.ArrayList;

public class PembelianDetail{
    private Integer quantity;
	
	private List<Pembelian> daftarPembelian = new ArrayList<Pembelian>();
	private Pembelian pembelian;
	private Produk produk;
	
	public List<Pembelian> getDaftarPembelian(){
        return daftarPembelian;
    }
	
	public Integer getQuantity(){
		return quantity;
	}
	
	public void setQuantity(Integer q){
		this.quantity=q;
	}
	
	public void setPembelian(Pembelian P){
		pembelian = P;
	}
}