package demo_04;

public class Calc03 extends Item03
{
	private String name;

	public Calc03( String name ){
	super();
	this.name = name;
	}

	public static Interface create(){
		return() -> {
		Calc03 calc = new Calc03( "Poly-morphism" );
	
			Item03.save( item -> {
				item.id( "掛け算" )
				    .name( "税込み価格" )
				    .price( 980 )
				    .tax( 1.1 )
				    .calc( calc );
		
				System.out.println( "" + item.getId());
		
				item.display();
	
				item.execute();
				
			});
		};
	}
	
	@Override
	public void display(){
		indi( name );
	}

	public void process( Interface inter ){
		indi( "start" );

		inter.execute();

		indi( "end" );
	}
	
}