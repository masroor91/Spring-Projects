package test;

public class TrickyNum2<X extends Number> {
    
    private X x;
    
    public TrickyNum2(X x) {
        this.x = x;
    }
    
    private double getDouble() {
        return x.doubleValue();
    }
    
    public static void main(String args[]) {
        TrickyNum2<Integer> a = new TrickyNum2<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}