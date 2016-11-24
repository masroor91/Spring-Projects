package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {

	private String busname;
	
	@Qualifier("eng1")
	@Autowired
	private Engine engine ;
	
//	So in the spring xml we need to configure the AutowireAnnotationBeanPostProcessing so that 
//	annotations namely @Autowired and @Qualifier(“engine”) can be used in our application. 
//	In this case in our bean class we need not have the setters, getters and Constructors as these
//	annotations act at the property level.
//	Without these annotations will directly access the private property of the bean and instantiate and 
//	inject the same bean reference bean to dependent bean class object 
	
	

	public void setBusname(String busname) {
		this.busname = busname;
	}

	@Override
	public String toString() {
		return "Bus [busname=" + busname + ", engine=" + engine.getModelYear() + "]";
	}


}
