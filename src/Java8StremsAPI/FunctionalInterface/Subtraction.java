package Java8StremsAPI.FunctionalInterface;

import Java8StremsAPI.FunctionalInterface.Calculator;

class Subtracton implements Calculator {

    @Override
    public int operate(int a, int b) {
        return a - b;
    }
}