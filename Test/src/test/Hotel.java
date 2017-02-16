package test;

public class Hotel {
    private int roomNr;
    
    public Hotel(int roomNr) {
        this.roomNr = roomNr;
    }
    
    public int getRoomNr() {
        return this.roomNr;
    }
    
    static Hotel doStuff(Hotel hotel) {
        hotel = new Hotel(1);
        return hotel;
    }
    
    public static void main(String args[]) {
        Hotel h1 = new Hotel(100);
        System.out.print(h1.getRoomNr() + " ");
        Hotel h2 = doStuff(h1);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
        h1 = doStuff(h2);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
    }
}