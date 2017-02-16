package test;

import java.io.*;

public class Hotel3 implements Serializable {
	 private transient Room room = new Room();
	    
	    public static void main(String[] args) {
	        Hotel3 h = new Hotel3();
	        try {
	            FileOutputStream fos = new FileOutputStream("Hotel.dat");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(h);
	            oos.close();
	        } catch(Exception ex) {
	            ex.printStackTrace();
	        }
	    }
}
