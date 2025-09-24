package oop.interfaces;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 21:02
 * @project learn-java-w3school
 */
interface InterfaceA {
    void fnA();
}

interface InterfaceB {
    void fnB();
}

class Test implements InterfaceA, InterfaceB {
    @Override
    public void fnA() {
        System.out.println("This is function A");
    }

    @Override
    public void fnB() {
        System.out.println("This is function B");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Test test = new Test();
        test.fnA();
        test.fnB();
    }
}
