package Java8StremsAPI.FunctionalInterface;

public class Demo {

    static void main() {
        //here MathUtils is accessing functional interface method using method reference ::
        Calculator c = MathUtils::divide;
        System.out.println(c.operate(10, 5));

        Calculator cb = new Subtracton();
        System.out.println(cb.operate(10, 5));


    }
}
