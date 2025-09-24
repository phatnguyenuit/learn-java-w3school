package oop.super_keyword;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 11:36
 * @project learn-java-w3school
 */

class Animal {
    Animal() {
        System.out.println("Animal created");
    }

    void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog created");
    }

    void animalSound() {
        super.animalSound(); // Call the parent method
        System.out.println("The dog says: bow wow");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.animalSound();
    }
}
