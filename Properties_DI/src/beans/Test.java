package beans;

import java.util.Properties;
import java.util.Set;

public class Test {

	private Properties driver;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Properties getDriver() {
		return driver;
	}

	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		Set keys = driver.keySet();
		StringBuilder builder = new StringBuilder("List of Key-Value pairs in Properties file\n");
		for(Object key: keys){
			builder.append("Key= ").append(key).append(" : Value= ").
			append(driver.get(key)).append("\n");
		}
		
		
		return builder.toString();
	}
	
	


}
