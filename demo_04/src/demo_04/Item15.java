package demo_04;

import java.util.function.Consumer;

public class Item15 
{
	private String id;
	private String name;
	private double price;
	private double tax;
	
	
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
	
	public static void save( Consumer<Item15> con) {
		Item15 item = new Item15();
		con.accept( item );
		System.out.println( "save :" + item );
	}
	
	
	
	
	@Override
	public String toString() {
		return "Item15 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	
	public void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
