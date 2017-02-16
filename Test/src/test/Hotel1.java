package test;

public class Hotel1  {
    
    private static void book() {
        System.out.print("book");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1);
        book();
    }
}
