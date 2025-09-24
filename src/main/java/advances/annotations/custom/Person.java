package advances.annotations.custom;

import advances.annotations.custom.annotations.Init;
import advances.annotations.custom.annotations.JsonElement;
import advances.annotations.custom.annotations.JsonSerializable;

/**
 * @author PhatNguyen
 * @created 02/09/2025 - 16:06
 * @project learn-java-w3school
 */

@JsonSerializable
public class Person {
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @JsonElement
    private String firstName;

    @JsonElement
    private String lastName;

    @JsonElement(key = "personAge")
    private int age;

    @JsonElement
    private String address;

    @Init
    private void initNames() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase() + this.lastName.substring(1);
    }

    // Standard getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}