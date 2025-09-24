package basic;

/**
 * @author PhatNguyen
 * @created 31/08/2025 - 10:32
 * @project learn-java-w3school
 */
public class MethodOverloadExample {
    public static void hello() {
        System.out.println("Hello");
    }

    public static void hello(String name) {
        System.out.println("Hello "+ name);
    }

    public static void hello(int score) {
        System.out.println("Hello score"+ score);
    }

    public static void hello(String name, float avgScore) {
        System.out.printf("Hello %s with score %.2f\n", name, avgScore);
    }

    public static void main(String[] args) {
        hello();
        hello("Phat");
        hello(10);
        hello("Phat", 9.45f);
    }
}
