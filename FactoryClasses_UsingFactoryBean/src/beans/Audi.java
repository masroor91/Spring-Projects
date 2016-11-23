package beans;

public class Audi implements Car {

	@Override
	public void drive() {
		System.out.println("safe drive under 100km/h");
	}

}
