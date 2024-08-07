package demo_04;

public class Calc08 extends Item08 {
	private String name;

	public Calc08(String name) {
		super();
		this.name = name;
	}

	public static Interface create() {
		return () -> {
			Calc08 calc = new Calc08("Poly-morphism");

			Item08.save(item -> {
				item.id("掛け算")
					  .name("税込み価格")
					  .price(980)
					  .tax(1.1)
					  .calc(calc);

				System.out.println("計算式 :" + item.getId());

				item.display();

				item.execute();
			});
		};
	}
	
	@Override
	public void display() {
		indi(name);
	}

	public void process(Interface inter) {
		indi("start");

		inter.execute();

		indi("end");
	}
}