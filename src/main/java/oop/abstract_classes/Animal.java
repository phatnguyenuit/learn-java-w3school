package oop.abstract_classes;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 20:37
 * @project learn-java-w3school
 */
public abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

