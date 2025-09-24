package oop.interfaces;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 20:53
 * @project learn-java-w3school
 */
// Pig "implements" the Animal interface
public class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}
