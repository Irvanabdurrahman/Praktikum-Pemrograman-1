abstract class Hewan{
	protected String nama;
	protected int jumKaki;
	protected boolean bisaTerbang = false;
	
	public Hewan(String nama, int kaki, boolean terbang){
		this.nama = nama;
		jumKaki = kaki;
		bisaTerbang = terbang;
	}
	public abstract void bersuara();
	
	public static void makan(){
		System.out.println("nyam, nyam, nyam");
	}
	
	public void isHewan(){
		System.out.println("_____________________________________________");
		System.out.println("\nNama	: Irvan Abdurrahman | 4510210003");
		System.out.println("Program	: Inheritance");
		System.out.println("Tanggal	: 30 November 2011");
		System.out.println("_____________________________________________");
		System.out.println("\nNama : " + nama);
		System.out.println("Jumlah Kaki : " + jumKaki);
		System.out.println("Bisa Terbang : " + bisaTerbang);
	}
}
