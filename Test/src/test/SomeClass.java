package test;

public class SomeClass {
    private int value = 1;
    
    public int getValue() {
        return value;
    }
    
    public void changeVal(int value) {
        value = value;  //This thing has no effect on the attribute value. this must be used to qualify for the value to be edited
    }

    public static void main(String args[]) {
        int a = 2;
        SomeClass c = new SomeClass();
        c.changeVal(a);
        System.out.print(c.getValue());
    }
}
