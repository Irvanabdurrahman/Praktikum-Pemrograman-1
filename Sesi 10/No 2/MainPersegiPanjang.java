public class MainPersegiPanjang{
	public static void main(String[] args){
		PersegiPanjang pp = new PersegiPanjang();
		pp.setPanjang(10);
		pp.setLebar(20);
		System.out.printf("Panjang : %.0f \n",pp.getPanjang());
		System.out.printf("Lebar : %.0f\n" ,pp.getLebar());
		System.out.format("Luas : %.0f\n",pp.getLuas());
	}
}