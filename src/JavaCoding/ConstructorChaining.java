package JavaCoding;

class ConstructorChaining {

    ConstructorChaining() {
        System.out.println("I am a constructor chaining");
    }

    ConstructorChaining(int i) {
        System.out.println("I am a constructor chaining" + i);
    }
}

class Child extends ConstructorChaining {
    Child() {
        System.out.println("I am a child constructor");

    }

    Child(String s) {
        this();
        System.out.println("I am a child constructor" + s);
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}


//below code creates infinite loops in constructor chaining
//cause
/*class Demo {
    // Constructor A
    Demo() {
        //   this(10); // Calls Constructor B
    }

    // Constructor B
    Demo(int x) {
        // this(); // Calls Constructor A
    }
}
*/