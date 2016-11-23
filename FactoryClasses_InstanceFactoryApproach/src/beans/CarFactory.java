package beans;

public class CarFactory {
	public String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	//non-static factory approach
	public Car getInstance() throws Exception{
		Car c= (Car)Class.forName(carName).newInstance();
		return c;
		
	}
	//Here we are not writing singleton logic but by default spring will make this single object
	//hence the return type will also become the singleton. To implement spring facory classes then
	//we dont need to apply any singleton logic
}
