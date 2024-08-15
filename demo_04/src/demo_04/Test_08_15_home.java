package demo_04;

public class Test_08_15_home 
{
	public static void main( String[] args ) 
	{
		Calc15 calc = new Calc15( "Poly-morphism" );
		calc.process( () -> {
			
			Interface save = Calc15.create();
				save.execute();
			
		});
	}
}
