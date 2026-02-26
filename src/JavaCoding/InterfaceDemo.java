package JavaCoding;

public class InterfaceDemo implements InterfaceImp {

    //@Override
    public void display() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.display();
    }
}
