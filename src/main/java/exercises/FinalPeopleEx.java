package exercises;

/**
 * @author PhatNguyen
 * @created 20/09/2025 - 09:53
 * @project learn-java-w3school
 */

class People {
    private final String name;
    private final int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" + "name=\"" + name + '\"' + ", age=" + age + '}';
    }
}

public class FinalPeopleEx {
    public static void main(String[] args) {
        People p = new People("Fast Nguyen", 30);
        System.out.println(p);
    }
}
