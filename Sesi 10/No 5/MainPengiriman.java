import javax.swing.JOptionPane;


public class MainPengiriman extends Paket{
	public MainPengiriman(){
	
	}
	
	public static void main(String args[]){
		MainPengiriman elie = new MainPengiriman();
		
		String nmPengirim = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Nama Pengirim");
		
		elie.setNmPengirim(nmPengirim);
		
		String tujuanPaket = JOptionPane.showInputDialog("Biaya PengirimanPaket" + "\n Inputkan Tujuan Paket : Bali | Surabaya | Jakarta | Bandung");
		
		elie.setTujuanPaket(tujuanPaket);
		
		String br = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Berat Paket : ");
		
		int beratPaket = Integer.parseInt(br);
		elie.setBeratPaket(beratPaket);
		elie.biayaPerKg();
		elie.Bayar();
		
		JOptionPane.showMessageDialog(null,"Biaya Pengiriman Paket Adalah" + "\n Nama Pengirim : " + elie.getNmPengirim() + "\n Tujuan Paket : "
		+ elie.getTujuanPaket() + "\n Berat paket : " + elie.getBeratPaket() + " Kg" + "\n Baiay Per Kg : " + elie.biayaPerKg() + "\n Total Bayar : "
		+ elie.Bayar() + "\nThank You");
	}
}