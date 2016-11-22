package beans;

public class Car {

	private Engine engine;
	private String carname;
	
	public Car() {
		System.out.println("Car default Constructor");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Override
	public String toString() {
		return "Car [Model Year=" + getEngine().getModelYear() + ", Carname=" + getCarname() + "]";
	}
	
	

}
