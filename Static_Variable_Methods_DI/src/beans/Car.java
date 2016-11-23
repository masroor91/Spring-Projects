package beans;

public class Car {

	private static String name;

	public static void setName(String name) {
		Car.name = name;
	}
	
	public static void displayCar(){
		System.out.println("Car Name is " + name);
	}
}
