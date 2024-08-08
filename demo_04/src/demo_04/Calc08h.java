package demo_04;

public class Calc08h extends Item08h
{
	private String name;
	
	public Calc08h( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc08h calc = new Calc08h( "Poly-morphism" );

			Item08h.save( item -> {
				item.id( "掛け算" )
					  .name( "税込み価格" )
					  .price( 980 )
					  .tax( 1.1 )
					  .calc( calc );
				
				System.out.println( "計算式 :" + item.getId());
				
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
		
		inter.execute();
		
		indi( "end" );
	}
	
	
	
	
	
}
