package beans;

public class Bus {

	private String busname;
	private Engine engine ;
	
	//For autodetect autowiring two case may arise as follows and IOC will take actions
	//according to the following rule
	//if we default constructor , parameterized constructor and setters of a dependency the
	// IOC will inject the property through setter method ie ByType autowiring
	//If default Constructors is not used while parameterized constructors and setters is used
	//Then IOC will inject the property by Constructor only ie will follow constructor autowiring
	public Bus() {
	
		System.out.println("Default Bus Constructor");
	}


	public Bus(Engine engine) {
		System.out.println("Parameterized Bus Constructor");
		this.engine = engine;
	}
	

	public void setEngine(Engine engine) {
		System.out.println("Inside Engine getter");
		this.engine = engine;
	}



	public void setBusname(String busname) {
		this.busname = busname;
	}


	@Override
	public String toString() {
		return "Bus [busname=" + busname + ", engine=" + engine.getModelYear() + "]";
	}
	
	

}
