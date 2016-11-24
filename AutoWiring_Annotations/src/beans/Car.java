package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	
	@Qualifier("eng1")
	@Autowired()
	private Engine engine;
	
	private String carname;

	public void setCarname(String carname) {
		this.carname = carname;
	}


	@Override
	public String toString() {
		return "Car [engine=" + engine.getModelYear() + ", carname=" + carname + "]";
	}


}
