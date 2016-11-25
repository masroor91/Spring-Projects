package beans;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;


public class Bus {

	private String busname;
	//@Inject annotation uses ByName approach first if not found by Name then tries
	//to inject ByType Approach
	@Inject
	@Qualifier("engine1")
	private Engine engine ;
	
	public void setBusname(String busname) {
		this.busname = busname;
	}
	
	@Override
	public String toString() {
		return "Bus [busname=" + busname + ", engine=" + engine.getModelYear() + "]";
	}
	
	

}
