package beans;

public class Test {
	private String name;
	private int age;
	private String email;
	
	
	public Test(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	public void displayData(){
		System.out.println(this);
	}

}
