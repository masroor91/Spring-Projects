package test;

public class SuperHotel2 extends Hotel2 {
    public void book() {
        bookings--;
    }
    
    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }
    
    public static void main(String args[]) {
        Hotel2 hotel = new SuperHotel2();
        hotel.book(2);
        System.out.print(hotel.bookings);
    }
}
