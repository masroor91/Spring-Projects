package beans;

public class Car {

	private Engine[] engine;
	private String[] carname;
	
	
	public Engine[] getEngine() {
		return engine;
	}
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	public String[] getCarname() {
		return carname;
	}
	public void setCarname(String[] carname) {
		this.carname = carname;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("=================Cars Info=================\n");
		
		for(int i=0; i<engine.length; i++){
			builder.append("SNo: ").append(i+1).append(" Car Name: ").append(carname[i]).
			append(" , Engine Year: ").append(engine[i].getModelYear()).append("\n");
		}
		
		builder.append("===========================================\n");
		String build2String = builder.toString();
		return build2String;
	}
	
	
	

}
