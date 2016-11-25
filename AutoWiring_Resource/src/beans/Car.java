package beans;

import javax.annotation.Resource;

public class Car {

	//Autowiring by Name is done by @Resource annotation
	@Resource
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
