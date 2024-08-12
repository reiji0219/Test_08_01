package demo_04;

public class Test_08_12_home
{
	public static void main( String[] args )
	{
		Calc12 calc = new Calc12( "Poly-morphism" );
		calc.process( () -> {
			
		Interface save = Calc12.create();
			save.execute();
			
		});	
	}	
}