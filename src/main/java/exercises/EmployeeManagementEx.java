package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author PhatNguyen
 * @created 18/09/2025 - 20:08
 * @project learn-java-w3school
 */

class Employee {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

class EmployeeManagementSystem {
    private final List<Employee> employees = new ArrayList<>();

    public void add(Employee e) {
        employees.add(e);
    }

    public void remove(int id) {
        System.out.println("Removing employee with id: " + id + "...");
        Optional<Employee> e = this.employees.stream().filter(x -> x.getId() == id).findFirst();

        e.ifPresent(employees::remove);
    }

    public void sort() {
        System.out.println("Sorting list of employees");
        employees.sort((e1, e2) -> e1.getId() - e2.getId());
    }

    public Optional<Employee> search(int id) {
        System.out.println("Searching employee with id: " + id + "...");
        return employees.stream().filter(e -> e.getId() == id).findFirst();
    }

    public void print() {
        System.out.println("List of employees:");
        System.out.println(this.employees);
    }
}

public class EmployeeManagementEx {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        system.add(new Employee(1, "Fast", 65));
        system.add(new Employee(3, "Tai", 32));
        system.add(new Employee(2, "An", 11.5));
        system.print();

        system.sort();
        system.print();

        Optional<Employee> employee = system.search(3);
        employee.ifPresentOrElse(
            (e) -> System.out.println("Found employee: " + e),
            () -> System.out.println("Not found.")
        );

        system.remove(3);
        system.print();

    }
}
