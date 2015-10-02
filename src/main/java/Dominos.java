
public class Dominos {
	static Dominos dominos;
	Pizza pizza;

	public Dominos() {
		System.out.println("It is Dominos");
		pizza = new Pizza();
	}

	public static Dominos bake() {
		System.out.println("bake");
		return dominos;
	}
}
