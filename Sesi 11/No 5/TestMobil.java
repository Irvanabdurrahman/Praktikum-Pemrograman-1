public class TestMobil{
	public static void main(String[] args){
		Mobil mobil = new Mobil(){
	public void injakPedalGas(){
		System.out.println("_____________________________________________");
		System.out.println("\nNama	: Irvan Abdurrahman | 4510210003");
		System.out.println("Program	: Inheritance");
		System.out.println("Tanggal	: 30 November 2011");
		System.out.println("_____________________________________________");
		System.out.println("\nMobil Berjalan..!!");
	}
};

	Kijang kijang = new Kijang();
	BMW bmw = new BMW();
	
	mobil.injakPedalGas();
	
	mobil = kijang;
	mobil.injakPedalGas();
	
	mobil = bmw;
	mobil.injakPedalGas();
	}
}