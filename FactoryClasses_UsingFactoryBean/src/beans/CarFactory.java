package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean {
	public String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	//Here we are not writing singleton logic but by default spring will make this single object
	//hence the return type will also become the singleton. To implement spring facory classes then
	//we dont need to apply any singleton logic

	@Override
	public Object getObject() throws Exception {
		Car c= (Car)Class.forName(carName).newInstance();
		return c;
	}

	@Override
	public Class getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true; //if we want to make the ref of car to be singleton then we can make it true
	}
}
