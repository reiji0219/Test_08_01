package demo_04;

import java.util.function.Consumer;

public class Item09 implements Interface
{
	@Override
	public void execute() {
		indi( "Lambda" );
		
		
	}
	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc09 calc;
	
	
	public Item09 id(String id) {
		this.id = id;
		return this;
	}
	public Item09 name(String name) {
		this.name = name;
		return this;
	}
	public Item09 price(double price) {
		this.price = price;
		return this;
	}
	public Item09 tax(double tax) {
		this.tax = tax;
		return this;
	}
	public Item09 calc( Calc09 calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item09> con ){
		Item09 item = new Item09();
		con.accept( item );
		indi( "save :" + item );
	}
	
	public String getId() {
		return id;
	}
	
	public void display() {
		indi( "表示内容 :" + name );
		
		double clacInTax = clacTax( price, tax );
			indi( "税込み価格は" + clacInTax + "円です" );
			
		calc.display();
	}
	
	public static double clacTax( double price, double tax ) {
		return( price * tax );
	}

	@Override
	public String toString() {
		return "Item09 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	public static void indi( String s0 ){
		System.out.println( s0 );
	}
	
}
