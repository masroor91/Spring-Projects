package beans;

public class Test {
	private static Test t;
	
	public static void setT(Test t) {
		Test.t = t;
	}

	private Test(){
		System.out.println("Test Private Default Constructor");
	}
	
	private static Test getInstance(){
		if (t==null){
			t= new Test();
			return t;
		}
		else{
			return t;
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
