package oop.abstract_classes;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 20:37
 * @project learn-java-w3school
 */
public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); // will generate an error
        Animal pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}
