package oop.inheritance;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 11:28
 * @project learn-java-w3school
 */

class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private final String modelName = "Mustang";    // Car attribute

    public String getModelName() {
        return modelName;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.getModelName());
    }
}
