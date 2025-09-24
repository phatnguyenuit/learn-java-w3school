package advances.annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PhatNguyen
 * @created 02/09/2025 - 15:44
 * @project learn-java-w3school
 */

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}


public class AnnotationExample {

    @Deprecated
    public static void oldMethod() {
        System.out.println("Old method.");
    }

    // Suppress warnings for array list without type
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /*
        Java built-in annotations:
         - @Override
         - @Deprecated
         - @SuppressWarnings
        */
        Animal dog = new Dog();
        dog.makeSound();

        oldMethod();

        List list = new ArrayList();
        list.add("ok");

        System.out.println(list);
    }
}
