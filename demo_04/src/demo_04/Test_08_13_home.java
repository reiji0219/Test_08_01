package demo_04;

public class Test_08_13_home 
{
	public static void main( String[] args )
	{
		Calc13 calc = new Calc13( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc13.create();
				save.execute();
			
		});
		
		
		
		
		
		
	}
	
	
}
