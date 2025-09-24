package advances.sorting;

import java.util.Objects;

/**
 * Represents a car with a brand, model, and year.
 * This class is a plain old Java object (POJO) used for demonstration purposes,
 * for example, in sorting collections of cars.
 */
public class ComparableCar implements Comparable {
    private String brand;
    private String model;
    private int year;

    public ComparableCar(String brand, String model, int year) {
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
    public int compareTo(Object o) {
        if (!(o instanceof ComparableCar car)) return 0;

        return this.getYear() - ((ComparableCar) o).getYear();
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
