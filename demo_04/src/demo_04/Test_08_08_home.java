package demo_04;

public class Test_08_08_home {
	public static void main(String[] args) 
	{
		Calc08 calc = new Calc08("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc08.create();
			save.execute();

		});

	}
}
