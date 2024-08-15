package demo_04;

import java.util.function.Consumer;

public class Item15 implements Interface
{
	@Override
	public void execute() {
		indi( "Lambda" );
		
	}
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc15 calc;
	
	
	public Item15 id(String id) {
		this.id = id;
		return this;
	}
	public Item15 name(String name) {
		this.name = name;
		return this;
	}
	public Item15 price(double price) {
		this.price = price;
		return this;
	}
	public Item15 tax(double tax) {
		this.tax = tax;
		return this;
	}
	public Item15 calc( Calc15 calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item15> con) {
		Item15 item = new Item15();
		con.accept( item );
		System.out.println( "save :" + item );
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
		return "Item15 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	
	public void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
