package demo_04;

public class Test_08_15_home 
{
	public static void main( String[] args ) 
	{
		Item15.save( item -> {
			item.id( "")
				  .name( "" )
				  .price( 980 )
				  .tax( 1.1 );
				
		});
		
		
		
	}
}
