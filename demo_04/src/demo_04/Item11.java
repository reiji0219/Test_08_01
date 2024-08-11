package demo_04;

import java.util.function.Consumer;

public class Item11 implements Interface
{
	@Override
	public void execute() {
		indi( "Lambda" );
		
	}
	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc11 calc;
	
	
	public Item11 id(String id) {
		this.id = id;
		return this;
	}
	public Item11 name(String name) {
		this.name = name;
		return this;
	}
	public Item11 price(double price) {
		this.price = price;
		return this;
	}
	public Item11 tax(double tax) {
		this.tax = tax;
		return this;
	}
	public Item11 calc( Calc11 calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item11> con ) {
		Item11 item = new Item11( );
		con.accept( item );
		System.out.println( "save :" + item );
	}
	
	public String getid() {
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
		return "Item11 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	public void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
