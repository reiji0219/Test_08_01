package demo_04;

public class Calc01 extends Item01
{
	private String name;

	public Calc01( String name ){
	super();
	this.name = name;
	}
	
	public static Interface create(){
	return() -> {
		Calc01 calc = new Calc01( "Poly-morphism" );

		Item01.save( item -> {
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
	public void display(){
		indi( name );
	}

	public void process( Interface inter ){
		indi( "start" );

		inter.execute();

		indi( "end" );		
	}
}
