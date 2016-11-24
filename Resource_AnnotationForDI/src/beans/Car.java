package beans;

import javax.annotation.Resource;

public class Car {
	
	private String carName;
	
	@Resource
	private Engine engine;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", engine=" + engine.getModelYear() + "]";
	}
	
	
}
