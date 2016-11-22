package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	private Vector fruits;
	private TreeSet  cricketers;
	private Hashtable countryCapital;
	

	public Vector getFruits() {
		return fruits;
	}
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public TreeSet getCricketers() {
		return cricketers;
	}

	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}

	public Hashtable getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(Hashtable countryCapital) {
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
