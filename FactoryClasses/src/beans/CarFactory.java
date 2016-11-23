package beans;

public class CarFactory {
	public static String carName;

	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
	
	public static Car getInstance() throws Exception{
		Car c= (Car)Class.forName(carName).newInstance();
		return c;
		
	}
	//Here we are not writing singleton logic but by default spring will make this single object
	//hence the return type will also become the singleton. To implement spring facory classes then
	//we dont need to apply any singleton logic
}
