package JavaCoding;

import javax.swing.*;

public class Constructor {
    //copy constructor
    int x = 10;

    Constructor(Integer x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(5);

        System.out.println(c.x);
    }
}
