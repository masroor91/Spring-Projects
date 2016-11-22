package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	private List fruits;
	private Set  cricketers;
	private Map countryCapital;
	
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(Map countryCapital) {
		this.countryCapital = countryCapital;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("List of fruits are \n");
		for (Object fruit: fruits){
				builder.append(fruit).append(", ");
		}
		builder.append("\n\nSet of cricket players are \n");
		
		for( Object cricketer:cricketers){
			builder.append(cricketer).append(", ");
		}
		
		builder.append("\n\nCountries and its capitals are \n");
		
		Set keys= countryCapital.keySet();
		for (Object key: keys){
			builder.append("Country Name= ").append(key).append(" : Capital= ").
			append(countryCapital.get(key)).append("\n");
		}
		
		String builder2String = builder.toString();
		return builder2String;
	}
	
}
