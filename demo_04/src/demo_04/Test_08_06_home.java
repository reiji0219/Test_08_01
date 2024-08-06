package demo_04;

public class Test_08_06_home 
{
	public static void main( String[] args )
	{
		Calc06 calc = new Calc06( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc06.create();
				save.execute();
		});
		
		
		
		
		
	}
}
