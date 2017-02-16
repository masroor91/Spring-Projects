package test;

public class StringTest2 {
	
	  public static void main(String args[]) {
	      Object myObj = new String[]{"one", "two", "three"};{
	          for (String s : (String[])myObj) System.out.print(s + ".");
	      }
	  }

}
