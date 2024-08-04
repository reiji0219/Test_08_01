package demo_04;

public class Test_08_04_job 
{
	public static void main( String[] args )
	{
		Calc04 calc = new Calc04( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc04.create();
				save.execute();

		});
	}
}