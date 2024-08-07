package demo_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class Item08 implements Interface 
{
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc08 calc;

	
	public Item08 id(String id) {
		this.id = id;
		return this;
	}

	public Item08 name(String name) {
		this.name = name;
		return this;
	}

	public Item08 price(double price) {
		this.price = price;
		return this;
	}

	public Item08 tax(double tax) {
		this.tax = tax;
		return this;
	}

	public Item08 calc(Calc08 calc) {
		this.calc = calc;
		return this;
	}

	public static void save(Consumer<Item08> con) {
		Item08 item = new Item08();
		con.accept(item);
		indi("save :" + item);
	}

	public String getId() {
		return id;
	}

	public void display() {
		indi("表示内容 :" + name);

		double calcInTax = calcTax(price, tax);
		indi("税込み価格は" + calcInTax + "円です");

		calc.display();
	}

	public static double calcTax(double price, double tax) {
		return (price * tax);
	}

	@Override
	public void execute() {
		indi("Lambda");

		ArrayList<String> animals = new ArrayList<String>( Arrays.asList( "Dog" ));
		
		ArrayList<String> animal = new ArrayList<String>();
			animal.add( "Cat" );
			animal.add( "Lion" );
			animal.add( "Penguin" );
			
			animals.addAll( animal );
			
		String getAnimal = animals.get( 3 );
			indi( getAnimal );
		
			animals.set( 0, "Doragon" );
			
			animals.remove( 3 );
			animals.add( 3, "Phoenix" );
		
		Comparator<String> compa = ( o1, o2 ) -> {
			return( o2.compareTo( o1 ));
		};
			
		Collections.sort( animals, compa );
		
		Iterator<String> itera = animals.iterator();
		while( itera.hasNext()) {
			String hoge = itera.next();
				indi( hoge );
		}
	}
	
	@Override
	public String toString() {
		return ("Item08 -> " + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax);
	}

	public static void indi(String s0) {
		System.out.println(s0);
	}
}