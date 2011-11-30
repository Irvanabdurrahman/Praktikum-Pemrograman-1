class Sapi extends Hewan{
	public Sapi(){
		super("Sapi",4,false);
	}
	
	public void bersuara(){
		System.out.println("\nemoh...,enohhh,,,");
	}
	
	public static void main(String[] args){
		Sapi s = new Sapi();
		s.isHewan();
		s.bersuara();
	}
}