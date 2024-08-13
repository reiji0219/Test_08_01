package demo_04;

import java.util.function.Consumer;

public class Item13 implements Interface
{
	@Override
	public void execute() {
		indi( "Lambda" );
		
	}
	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc13 calc;
	
	
	public Item13 id(String id) {
		this.id = id;
		return this;
	}
	public Item13 name(String name) {
		this.name = name;
		return this;
	}
	public Item13 price(double price) {
		this.price = price;
		return this;
	}
	public Item13 tax(double tax) {
		this.tax = tax;
		return this;
	}
	public Item13 calc( Calc13 calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item13> con ) {
		Item13 item = new Item13();
		con.accept( item );
		System.out.println( "save :" + item );
	}
	
	public String getId() {
		return id;
	}
	
	public void display() {
		indi( "表示内容 :" + name );
		
		double calcInTax = calcTax( price, tax );
			indi( "税込み価格は" + calcInTax + "円です" );
			
		calc.display();
	}
	public static double calcTax( double price, double tax ) {
		return( price * tax );
	}
	
	@Override
	public String toString() {
		return "Item13 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	public void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
