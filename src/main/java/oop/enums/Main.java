package oop.enums;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 08:24
 * @project learn-java-w3school
 */
public class Main {
    public static void loopThroughEnums() {
        for (Level level : Level.values()) {
            System.out.println(level);
        }
    }
    public static void main(String[] args) {
        Level level = Level.HIGH;

        System.out.println("Level is " + level);

        loopThroughEnums();
    }
}
