package beans;

public class Test {

	private String gender;
	
	public Test() {
		
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void sayHello(String name){
		System.out.println("Hello "+ gender + "  " + name);
	}

}
