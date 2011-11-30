public class Point extends Shape{
	static int x, y;
	public Point(){
		x = 0;
		y = 0;
	}
	
	public double area(){
		return 0;
	}
	
	public double perimeter(){
		return 0;
	}
	
	public static void print(){
		System.out.println("_____________________________________________");
		System.out.println("\nNama	: Irvan Abdurrahman | 4510210003");
		System.out.println("Program	: Inheritance");
		System.out.println("Tanggal	: 30 November 2011");
		System.out.println("_____________________________________________");
		System.out.println("\nPoin : " + x + "," + y);
	}
	
	public static void main (String args[]){
		Point p = new Point();
		p.print();
	}
}