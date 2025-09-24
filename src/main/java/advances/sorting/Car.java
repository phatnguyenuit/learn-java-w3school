package advances.sorting;

import java.util.Objects;

/**
 * Represents a car with a brand, model, and year.
 * This class is a plain old Java object (POJO) used for demonstration purposes,
 * for example, in sorting collections of cars.
 */
public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Car{brand='%s', model='%s', year=%d}", brand, model, year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
