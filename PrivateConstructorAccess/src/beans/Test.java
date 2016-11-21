package beans;

public class Test {

	private Test() {
		System.out.println(" Private Test Connstructor");
	}
	
	public void hello(){
		System.out.println("Accessing a private Contsructor using Java Runtime Polymorphism");
	}

}
