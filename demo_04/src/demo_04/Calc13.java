package demo_04;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Calc13 implements Serializable
{
	private String name;
	
	public Calc13() {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc13 calc = new Calc13();

			Item13.save( item -> {
				item.id( "掛け算" )
					  .name( "税込み価格" )
					  .price( 980 )
					  .tax( 1.1 )
					  .calc( calc );
				
				item.indi( "計算式 :" + item.getId());
				
				item.display();
				
			});

		};
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println( name );
	}
	
	public void process( Interface inter ) {
		System.out.println( "start" );
		
		inter.execute();
		
		System.out.println( "end" );
	}

}
