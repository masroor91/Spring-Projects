package test;

public class MethodOverloadingDemo {
    
    public static void book(short a) {
        System.out.print("short ");
    }
    
    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    
    public static void book(Long a) {
        System.out.print("LONG ");
    }
    
    public static void book(int i, long l) {
		System.out.println("int+long");
	}
    
//    public static void book(int i, int i2) {
//		System.out.println("int+int");
//	}
    
    public static void book(int i, double d) {
		System.out.println("int+double");
	}
    
    public static void book(float f, double d) {
		System.out.println("float+ double");
	}
    
    public static void book(float f, float f2) {
		System.out.println("float+float");
	}
    
//    public static void book(int i, short s) {
//		System.out.println("int+short");
//	}
    
    public static void main(String[] args) {
        short shortRoom = 1;
        int intRoom = 2;
        Short ShortRoom=3;
        Long LongRoom=4L;
        float floatRoom= 4.0F;
        
        long longRoom=7;
        
        double doubleRoom= 6.0;
        
        book(shortRoom);
        //book(intRoom);
        book(ShortRoom);
        book(LongRoom);
        
        book(intRoom, intRoom);
        
        book(intRoom, shortRoom);
        
        book(intRoom, longRoom);
        
        book(floatRoom, floatRoom);
        
        book(floatRoom, doubleRoom);
        
    }
}