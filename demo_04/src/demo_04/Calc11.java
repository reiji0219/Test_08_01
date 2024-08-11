package demo_04;

public class Calc11 extends Item11
{
	private String name;
	
	public Calc11( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc11 calc = new Calc11( "Poly-morphism" );

			Item11.save( item -> {
				item.id( "掛け算" )
					  .name( "税込み価格" )
					  .price( 980 )
					  .tax( 1.1 )
					  .calc( calc );

				item.indi( "計算式 :" + item.getid());
				
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
