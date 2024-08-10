package demo_04;

public class Test_08_10_home 
{
	public static void main( String[] args )
	{
		Calc10 calc = new Calc10( "Poly-morphism" );
			calc.process( () -> {
			
			Interface save = Calc10.create();
				save.execute();
			
		});		
	}
	
}
