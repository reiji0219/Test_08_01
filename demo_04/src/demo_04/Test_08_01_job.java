package demo_04;

public class Test_08_01_job 
{
	public static void main( String[] args )
	{
		Calc01 calc = new Calc01( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );


			Interface save = Calc01.create();
				save.execute();

		});
	}
}

