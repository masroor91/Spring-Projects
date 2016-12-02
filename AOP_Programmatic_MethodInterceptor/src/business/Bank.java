package business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {
	private int amt=5000;
	private String ac="sbi123";
	
	public int deposit(String ac, int amt){
		
		System.out.println("In Deposit Method");
		
		if (this.ac.equals(ac)){
			return this.amt+amt;
		}
		else{
			throw new AccountNoFoundException();
			
		}
		
	}

}
