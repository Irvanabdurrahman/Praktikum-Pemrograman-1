public class PersegiPanjang{
	private double Panjang;
	private double lebar;
	private double tinggi;
	public PersegiPanjang(){
		Panjang = 0;
		lebar = 0;
	}
	
	private double luas(double p, double l){
		return p*l;
	}
	
	public void setPanjang(double Panjang){
		this.Panjang = Panjang;
	}
	
	public void setLebar(double lebar){
		this.lebar = lebar;
	}
	
	public double getPanjang(){
		return Panjang;
	}
	
	public double getLebar(){
		return lebar;
	}
	
	public double getLuas(){
		return luas(Panjang, lebar);
	}
}