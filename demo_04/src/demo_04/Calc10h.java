package demo_04;

import java.util.ArrayList;
import java.util.Arrays;

public class Calc10h extends Item10h
{
	private String name;
	
	public Calc10h( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc10h calc = new Calc10h( "Poly-morphism" );

			Item10h.save( item -> {
				item.id( "掛け算" )
					  .name( "税込み価格" )
					  .price( 980 )
					  .tax( 1.1 )
					  .calc( calc );
				
				item.indi( "計算式 :" + item.getId());
				
				item.display();
		
				item.execute();
			});
		};
	}
	
	@Override
	public void display() {
		indi( name );
	}
	
	public void process( Interface inter ) {
		indi( "start" );
		
		ArrayList<String> animal = new ArrayList<String>( Arrays.asList( "Phoenix" ));
			animal.add( "Monkey" );
			animal.add( "Penguin" );
			
			String getAnimal = animal.get( 1 );
			indi( getAnimal );
			
		inter.execute();
				
		indi( "end" );
	}	
}