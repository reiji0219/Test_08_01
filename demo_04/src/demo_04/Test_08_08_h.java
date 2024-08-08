package demo_04;

public class Test_08_08_h 
{
	public static void main( String[] args )
	{
		Calc08h calc = new Calc08h( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc08h.create();
				save.execute();
			
		});
		
		
		
		
		
	}
	
}
